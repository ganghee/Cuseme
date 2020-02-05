package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
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
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityCreateBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.toolbar_card.*

class CreateActivity : BaseActivity<ActivityCreateBinding>(R.layout.activity_create) {

    private val createViewModel by lazy { ViewModelProvider(this).get(CreateViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.createViewModel = createViewModel

        checkPermission(this, this)
        bringImage()
        startRecord()
        stopRecord()
        saveRecord()
        isTextToSpeak()
        pressAddCardButton()
        backButton()
    }

    private fun backButton() {
        iv_back.setOnClickListener {
            finish()
        }
    }

    private fun bringImage() {
        iv_create_card.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, IMAGE_PICK_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICK_CODE && resultCode == Activity.RESULT_OK) {
            imageUri = data?.data!!
            iv_create_card.setImageURI(imageUri)
            iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
            ll_create_default_picture.visibility = View.INVISIBLE
        }
    }

    private fun pressAddCardButton() {
        createViewModel.apply {
            isSuccess.observe(this@CreateActivity, Observer {
                if (it) {
                    val intent = Intent(this@CreateActivity, ManageCardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
            btn_user.setOnClickListener {
                when {
                    imageUri.toString() == "null" -> {
                        iv_create_card.setBackgroundResource(R.drawable.round_all_border_pink_transparent_4)
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@CreateActivity, "선택한 사진이 없습니다.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    title.value.isNullOrEmpty() -> {
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@CreateActivity, "제목을 입력해 주세요", Toast.LENGTH_SHORT)
                            .show()
                    }
                    content.value.isNullOrEmpty() -> {
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
                        Toast.makeText(this@CreateActivity, "내용을 입력해 주세요.", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else -> {
                        Log.d("contentResolver", contentResolver.toString())
                        createCard(token!!, imageUri!!, contentResolver)
                    }
                }
            }
        }
    }

    private fun isTextToSpeak() {
        createViewModel.apply {
            isAutoSpeak.observe(this@CreateActivity, Observer {
                if (it) {
                    tv_create_save_record.visibility = View.INVISIBLE
                    tv_create_no_record.visibility = View.VISIBLE
                    ll_create_record.visibility = View.GONE
                } else {
                    tv_create_no_record.visibility = View.GONE
                    ll_create_record.visibility = View.VISIBLE
                }
            })
        }
    }

    private fun checkPermission(context: Context, activity: CreateActivity) {
        createViewModel.checkPermission(context, activity)
    }

    private fun saveRecord() {
        iv_create_save_record.setOnClickListener {
            createViewModel.apply {
                isSaveRecord.value = true
                tv_create_save_record.visibility = View.VISIBLE
            }
        }
    }

    private fun stopRecord() {
        createViewModel.apply {
            iv_create_stop.setOnClickListener {
                if (isRecording.value!!) {
                    stopRecord()
                    iv_create_save_record.isSelected = true
                    iv_create_start.isSelected = false
                } else {
                    startPlay()
                }
            }
            isPlayingRecord.observe(this@CreateActivity, Observer {
                iv_create_stop.isSelected = !it
            })
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun setRecordFileName() {
        createViewModel.apply {
            setFlieName(externalCacheDir!!.absolutePath)
        }
    }

    private fun startRecord() {
        setRecordFileName()
        tv_create_save_record.visibility = View.INVISIBLE
        cv_create_record.setOnClickListener {
            createViewModel.apply {
                iv_create_stop.setImageResource(R.drawable.btn_recording_selector)
                iv_create_start.isSelected = true
                startRecord()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@CreateActivity, ManageCardActivity::class.java)
        startActivity(intent)
        finish()
    }

    companion object {
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
    }
}
