package com.good.mycuseme.ui.card

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityEditBinding
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.toolbar_card.*

class EditActivity : BaseActivity<ActivityEditBinding>(R.layout.activity_edit) {

    private val editViewModel by lazy { ViewModelProvider(this).get(EditViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initData()
        initRecordButton()
        checkPermission(this, this)
        bringImage()
        startRecord()
        stopRecord()
        saveRecord()
        isTextToSpeak()
        pressAddCardButton()
    }

    private fun initData() {
        binding.editViewModel = editViewModel
        iv_back.setOnClickListener { finish() }
        sv_card.text = "수정"

        editViewModel.apply {
            val cardIdx = intent.getIntExtra("cardIdx", -1)
            initData(token, cardIdx)
            title.observe(this@EditActivity, Observer {
                et_update_card_title.hint = it
            })
            content.observe(this@EditActivity, Observer {
                et_update_card_content.hint = it
            })
            imageServer.observe(this@EditActivity, Observer {
                Glide.with(this@EditActivity)
                    .load(it)
                    .into(iv_update_card)
                imageUri = Uri.parse(it)
            })
        }
    }

    private fun initRecordButton() {
        editViewModel.recordServer.observe(this@EditActivity, Observer {
            if (it) {
                iv_update_stop.setImageResource(R.drawable.selector_btn_recording)
                iv_update_save_record.isSelected = true
                iv_update_start.isSelected = false
            }
        })
    }

    private fun bringImage() {
        iv_update_card.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, IMAGE_PICK_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICK_CODE && resultCode == Activity.RESULT_OK) {
            //선택한 이미지 uri로 가져오기 핸드폰 로컬 절대 경로가 나온다.
            //예: content://media/external/images/media/338
            imageUri = data?.data!!
            Glide.with(this@EditActivity)
                .load(imageUri)
                .into(iv_update_card)
            iv_update_card.setBackgroundResource(R.drawable.round_all_transparent)
            ll_update_default_picture.visibility = View.INVISIBLE
        }
    }

    private fun pressAddCardButton() {
        editViewModel.apply {
            isSuccess.observe(this@EditActivity, Observer {
                if (it) {
                    val intent = Intent(this@EditActivity, ContentCardActivity::class.java)
                    intent.putExtra("cardIdx", updateCardIdx)
                    startActivity(intent)
                    finish()
                    Toast.makeText(this@EditActivity, "수정되었습니다.", Toast.LENGTH_SHORT).show()
                }
            })
            sv_card.setOnClickListener {
                when {
                    imageUri.toString() == "null" -> {
                        iv_update_card.setBackgroundResource(R.drawable.round_all_border_pink_transparent_4)
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_white_20)
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_white_20)
                        Toast.makeText(this@EditActivity, "선택한 사진이 없습니다.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    et_update_card_title.text.isNullOrEmpty() -> {
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_white_20)
                        iv_update_card.setBackgroundResource(R.drawable.round_all_white_20)
                        Toast.makeText(this@EditActivity, "제목을 입력해 주세요", Toast.LENGTH_SHORT)
                            .show()
                    }
                    et_update_card_content.text.isNullOrEmpty() -> {
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_white_20)
                        iv_update_card.setBackgroundResource(R.drawable.round_all_white_20)
                        Toast.makeText(this@EditActivity, "내용을 입력해 주세요.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else -> {
                        title.value = et_update_card_title.text.toString()
                        content.value = et_update_card_content.text.toString()
                        updateCard(token!!, imageUri!!, contentResolver)
                    }
                }
            }
        }
    }

    private fun isTextToSpeak() {
        editViewModel.apply {
            isAutoSpeak.observe(this@EditActivity, Observer {
                if (it) {
                    tv_update_save_record.visibility = View.INVISIBLE
                    tv_update_no_record.visibility = View.VISIBLE
                    ll_update_record.visibility = View.GONE
                } else {
                    tv_update_no_record.visibility = View.GONE
                    ll_update_record.visibility = View.VISIBLE
                }
            })
        }
    }

    private fun checkPermission(context: Context, activity: EditActivity) {
        editViewModel.checkPermission(context, activity)
    }

    private fun saveRecord() {
        iv_update_save_record.setOnClickListener {
            editViewModel.apply {
                isSaveRecord.value = true
                tv_update_save_record.visibility = View.VISIBLE
            }
        }
    }

    private fun stopRecord() {
        editViewModel.apply {
            iv_update_stop.setOnClickListener {
                if (isRecording.value!!) {
                    stopRecord()
                    iv_update_save_record.isSelected = true
                    iv_update_start.isSelected = false
                } else {
                    startPlay()
                }
            }
            isPlayingRecord.observe(this@EditActivity, Observer {
                iv_update_stop.isSelected = !it
            })
        }
    }

    private fun startRecord() {
        tv_update_save_record.visibility = View.INVISIBLE
        cv_update_record.setOnClickListener {
            editViewModel.apply {
                setFlieName(externalCacheDir!!.absolutePath)
                iv_update_stop.setImageResource(R.drawable.selector_btn_recording)
                iv_update_start.isSelected = true
                startRecord()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    companion object {
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
    }
}
