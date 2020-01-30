package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.databinding.ActivityCreateBinding
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.toolbar_create_card.*

class CreateActivity : BaseActivity<ActivityCreateBinding>(R.layout.activity_create) {

    private val createViewModel by lazy { ViewModelProvider(this).get(CreateViewModel::class.java) }
    private lateinit var fileName: String
    private var selectPicUri: Uri? = null


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
            selectPicUri = data?.data!!
            iv_create_card.setImageURI(selectPicUri)
            ll_create_default_picture.visibility = View.INVISIBLE
        }
    }

    private fun pressAddCardButton() {
        iv_user.setOnClickListener {
            Log.d("sss", selectPicUri.toString())
            createViewModel.apply {
                when {
                    selectPicUri.toString() == "null" -> {
                        iv_create_card.setBackgroundResource(R.drawable.round_all_border_pink_transparent_4)
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                    }
                    title.value.isNullOrEmpty() -> {
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
                    }
                    content.value.isNullOrEmpty() -> {
                        et_create_card_content.setBackgroundResource(R.drawable.round_all_border_pink_white_4)
                        et_create_card_title.setBackgroundResource(R.drawable.round_all_transparent)
                        iv_create_card.setBackgroundResource(R.drawable.round_all_transparent)
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
            Log.d("click1", "click1")
//            fileName = recordFileName
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

    companion object {
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
    }
}
