package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityCreateBinding
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.toolbar_card.*

class CreateActivity : BaseActivity<ActivityCreateBinding>(R.layout.activity_create) {
    private val createViewModel by lazy { ViewModelProvider(this).get(CreateViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    private var imageUri: Uri? = null
    var second = 0.0
    private val progressBarCounter by lazy { ProgressBarCounter(100000, 10) }
    private val secondCounter = SecondCounter(10000, 95)
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.createViewModel = createViewModel

        checkPermission(this, this)
        bringImage()
        startRecord()
        pressStopRecordButton()
        saveRecord()
        isTextToSpeak()
        pressAddCardButton()
        backButton()
    }

    private fun pressStopRecordButton() {
        iv_create_stop.setOnClickListener {
            stopRecord()
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
            createViewModel.apply {
                setRotateImage(imageUri!!, contentResolver)
                uriRotateImage.observe(this@CreateActivity, Observer {
                    binding.ivCreateCard.setImageURI(it)
                })
            }
            iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
            ll_create_default_picture.visibility = View.INVISIBLE
        }
    }

    private fun pressAddCardButton() {
        createViewModel.apply {
            isSuccess.observe(this@CreateActivity, Observer {
                if (it) {
                    finish()
                }
            })
            sv_card.setOnClickListener {
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
                        createCard(token!!, uriRotateImage.value!!, contentResolver)
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
        progressBarCounter.cancel()
        secondCounter.cancel()
        second = 0.0
        progressbar.progress = 0
        createViewModel.apply {
            if (isRecording.value!!) {
                progressbar.setBackgroundResource(R.drawable.timer_gray)
                stopRecord()
                iv_create_save_record.isSelected = true
                progressbar.max = count
            } else {
                if (isPlayingRecord.value == true) {
                    stopPlaying()
                } else {
                    startPlay()
                    progressBarCounter.start()
                }
            }
            isPlayingRecord.observe(this@CreateActivity, Observer {
                if (it) {
                    iv_create_stop.isSelected = false
                    cv_create_record.visibility = View.GONE
                    progressbar.visibility = View.VISIBLE
                    tv_create_timer.visibility = View.VISIBLE
                } else {
                    iv_create_stop.isSelected = true
                    cv_create_record.visibility = View.VISIBLE
                    progressbar.visibility = View.GONE
                    tv_create_timer.visibility = View.GONE
                    progressBarCounter.cancel()
                    secondCounter.cancel()
                }
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
        cv_create_record.setOnClickListener {
            tv_create_save_record.visibility = View.INVISIBLE
            progressbar.progress = 0
            progressbar.max = 10000
            second = 0.0
            progressBarCounter.start()
            secondCounter.start()
            createViewModel.apply {
                iv_create_stop.setImageResource(R.drawable.selector_btn_recording)
                cv_create_record.visibility = View.GONE
                progressbar.visibility = View.VISIBLE
                tv_create_timer.visibility = View.VISIBLE
                startRecord()
            }
        }
    }

    private fun backButton() {
        iv_back.setOnClickListener {
            finish()
        }
    }

    inner class ProgressBarCounter(millisInFuture: Long, countDownInterval: Long) :
        CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {
            stopRecord()
            cancel()
        }

        override fun onTick(millisUntilFinished: Long) {
            progressbar.progress += 17
            count = progressbar.progress
        }
    }

    inner class SecondCounter(millisInFuture: Long, countDownInterval: Long) :
        CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {
            stopRecord()
            cancel()
        }

        override fun onTick(millisUntilFinished: Long) {
            second += 0.1
            val sec = String.format("%.1f", second)
            tv_create_timer.text = "$sec 초"
        }
    }

    companion object {
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
    }
}
