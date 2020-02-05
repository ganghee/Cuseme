package com.good.mycuseme.ui.card

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityEditBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.toolbar_card.*

class EditActivity : BaseActivity<ActivityEditBinding>(R.layout.activity_edit) {

    private val editViewModel by lazy { ViewModelProvider(this).get(EditViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.editViewModel = editViewModel

        initData()
        initRecordButton()
        Log.d("onCreate", "onCreate")

        checkPermission(this, this)
        bringImage()
        startRecord()
        stopRecord()
        saveRecord()
        isTextToSpeak()
        pressAddCardButton()
    }

    private fun initRecordButton() {
        editViewModel.recordServer.observe(this@EditActivity, Observer {
            if (it) {
                iv_update_stop.setImageResource(R.drawable.btn_recording_selector)
                iv_update_save_record.isSelected = true
                iv_update_start.isSelected = false
            }
        })
    }

    private fun initData() {
        iv_back.setOnClickListener {
            val intent = Intent(this, ManageCardActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_user.text = "수정"
        val cardIdx = intent.getIntExtra("cardIdx", -1)
        Log.d("datadata", token + "   " + cardIdx)

        editViewModel.apply {
            initData(token, cardIdx)
            imageServer.observe(this@EditActivity, Observer {
                Glide.with(this@EditActivity)
                    .load(it)
                    .into(iv_update_card)
                imageUri = Uri.parse(it)
            })
        }
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
            Log.d("imageUri@@", imageUri.toString())
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
                    val intent = Intent(this@EditActivity, ManageCardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
            btn_user.setOnClickListener {
                when {
                    imageUri.toString() == "null" -> {
                        iv_update_card.setBackgroundResource(R.drawable.round_all_border_pink_transparent_4)
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@EditActivity, "선택한 사진이 없습니다.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    title.value.isNullOrEmpty() -> {
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_update_card.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@EditActivity, "제목을 입력해 주세요", Toast.LENGTH_SHORT)
                            .show()
                    }
                    content.value.isNullOrEmpty() -> {
                        et_update_card_content.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_update_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_update_card.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@EditActivity, "내용을 입력해 주세요.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else -> {
                        Log.d("contentResolver", contentResolver.toString())
                        Log.d("imageUriData", imageUri.toString())
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
                Log.d("isRecording", isRecording.value.toString())
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
                iv_update_stop.setImageResource(R.drawable.btn_recording_selector)
                iv_update_start.isSelected = true
                startRecord()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@EditActivity, ManageCardActivity::class.java)
        startActivity(intent)
        finish()
    }

    companion object {
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
    }
}
