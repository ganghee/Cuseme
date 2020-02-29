package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
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
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.toolbar_card.*

class EditActivity : BaseActivity<ActivityEditBinding>(R.layout.activity_edit) {

    private val editViewModel by lazy { ViewModelProvider(this).get(EditViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }
    private var imageUri: Uri? = null
    var second = 0.0
    private val progressBarCounter by lazy { ProgressBarCounter(100000, 10) }
    private val secondCounter = SecondCounter(10000, 95)
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initData()
        pressStopRecordButton()
        checkPermission(this, this)
        bringImage()
        startRecord()
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
            recordServer.observe(this@EditActivity, Observer {
                if (it) {
                    iv_update_stop.setImageResource(R.drawable.selector_btn_recording)
                    iv_update_stop.isSelected = true
                    iv_update_stop.isClickable = true
                } else {
                    iv_update_stop.isClickable = false
                }
            })
            recordServerTime.observe(this@EditActivity, Observer {
                progressbar_edit.max = it
                val sec = String.format("%.1f", it * 0.001)
                tv_update_timer.text = "$sec 초"
            })
            isAutoSpeak.observe(this@EditActivity, Observer {
                iv_update_record.isSelected = it
            })
        }
    }

    private fun pressStopRecordButton() {
        iv_update_stop.setOnClickListener {
            stopRecord()
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
            imageUri = data?.data!!
            editViewModel.apply {
                setRotateImage(imageUri!!, contentResolver)
                uriRotateImage.observe(this@EditActivity, Observer {
                    binding.ivUpdateCard.setImageURI(it)
                })
            }
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
                        updateCard(token!!, uriRotateImage.value!!, contentResolver)
                    }
                }
            }
        }
    }

    private fun isTextToSpeak() {
        iv_update_record.setOnClickListener {
            editViewModel.apply {
                if (!iv_update_record.isSelected) {
                    tv_update_save_record.visibility = View.INVISIBLE
                    tv_update_no_record.visibility = View.VISIBLE
                    cl_update.visibility = View.GONE
                    iv_update_record.isSelected = true
                    isAutoSpeak.value = true
                } else {
                    tv_update_no_record.visibility = View.GONE
                    cl_update.visibility = View.VISIBLE
                    iv_update_record.isSelected = false
                    isAutoSpeak.value = false
                }
            }
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
        progressBarCounter.cancel()
        secondCounter.cancel()
        second = 0.0
        progressbar_edit.progress = 0
        editViewModel.apply {
            if (isRecording.value!!) {
                progressbar_edit.setBackgroundResource(R.drawable.timer_gray)
                stopRecord()
                iv_update_save_record.isSelected = true
                iv_update_start.isSelected = false
                progressbar_edit.max = count
            } else {
                if (isPlayingRecord.value == true) {
                    stopPlaying()
                } else {
                    startPlay()
                    progressBarCounter.start()
                }
            }
            isPlayingRecord.observe(this@EditActivity, Observer {
                if (it) {
                    iv_update_stop.isSelected = false
                    cv_update_record.visibility = View.GONE
                    progressbar_edit.visibility = View.VISIBLE
                    tv_update_timer.visibility = View.VISIBLE
                } else {
                    iv_update_stop.isSelected = true
                    cv_update_record.visibility = View.VISIBLE
                    progressbar_edit.visibility = View.GONE
                    tv_update_timer.visibility = View.GONE
                    progressBarCounter.cancel()
                    secondCounter.cancel()
                }
            })
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun setRecordFileName() =
        editViewModel.setFileName(externalCacheDir!!.absolutePath)

    private fun startRecord() {
        cv_update_record.setOnClickListener {
            iv_update_stop.isClickable = true
            setRecordFileName()
            tv_update_save_record.visibility = View.INVISIBLE
            progressbar_edit.progress = 0
            progressbar_edit.max = 10000
            second = 0.0
            progressBarCounter.start()
            secondCounter.start()
            Log.d("progress @@", progressbar_edit.progress.toString())
            editViewModel.apply {
                iv_update_stop.setImageResource(R.drawable.selector_btn_recording)
                cv_update_record.visibility = View.GONE
                progressbar_edit.visibility = View.VISIBLE
                tv_update_timer.visibility = View.VISIBLE
                startRecord()
            }
        }
    }

    inner class ProgressBarCounter(millisInFuture: Long, countDownInterval: Long) :
        CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {
            stopRecord()
            cancel()
        }

        override fun onTick(millisUntilFinished: Long) {
//            if (editViewModel.isRecording.value!!) progressbar_edit.progress += 17
//            else {
//                when (editViewModel.recordServerTime.value!!) {
//                    in 0 until 1000 -> progressbar_edit.progress += 10
//                    in 1000 until 2000 -> progressbar_edit.progress += 13
//                    in 2000 until 3000 -> progressbar_edit.progress += 14
//                    in 3000 until 4000 -> progressbar_edit.progress += 15
//                    in 4000 until 8000 -> progressbar_edit.progress += 16
//                    in 8000 until 10000 -> progressbar_edit.progress += 17
//                    else -> progressbar_edit.progress += 17
//                }
//            }
            progressbar_edit.progress += 17
            count = progressbar_edit.progress
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
            tv_update_timer.text = "$sec 초"
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
