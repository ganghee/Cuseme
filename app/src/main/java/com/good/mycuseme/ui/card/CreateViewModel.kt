package com.good.mycuseme.ui.card

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.util.isPermissionNotGranted
import com.good.mycuseme.util.startSettingActivity
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class CreateViewModel : BaseViewModel() {
    val isStartRecord = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isAutoSpeak = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isSaveRecord = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isRecordClickable = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isStopClickable = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isStartClickable = MutableLiveData<Boolean>().apply {
        value = true
    }
    val isRecording = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isPlayingRecord = MutableLiveData<Boolean>().apply {
        value = false
    }
    private lateinit var dialogBuilder: AlertDialog.Builder
    lateinit var recordFileName: String
    private var recorder: MediaRecorder? = null
    private var player: MediaPlayer? = null
    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()

    @SuppressLint("SimpleDateFormat")
    fun setFlieName(cacheDir: String) {
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        recordFileName = "${cacheDir}/audiorecord$timeStamp.m4a"
    }

    fun startRecord() {
        isStartRecord.value = true
        isStopClickable.value = true
        isRecordClickable.value = false
        isStartClickable.value = false
        isPlayingRecord.value = true
        recorder = MediaRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setOutputFile(recordFileName)
            setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
            try {
                prepare()
                isRecording.value = true
                Log.d("recording", isRecording.value.toString())
            } catch (e: IOException) {
                Log.e("startRecord", "prepare() failed")
            }
            start()
        }
    }

    fun startPlay() {
        player = MediaPlayer().apply {
            try {
                setDataSource(recordFileName)
                prepare()
                start()
                isPlayingRecord.value = true
            } catch (e: IOException) {
                Log.e("startPlay", "prepare() failed")
            }
            setOnCompletionListener {
                isPlayingRecord.value = false
            }
        }

    }

    fun stopRecord() {
        recorder?.apply {
            stop()
            release()
            isPlayingRecord.value = false
            isRecordClickable.value = true
            isStartClickable.value = true
            isRecording.value = false
            recorder = null
        }
    }

    fun checkPermission(context: Context, activity: CreateActivity) {
        if (context.isPermissionNotGranted(Manifest.permission.RECORD_AUDIO)
            || context.isPermissionNotGranted(Manifest.permission.READ_EXTERNAL_STORAGE)
            || context.isPermissionNotGranted(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    activity,
                    Manifest.permission.RECORD_AUDIO
                ) ||
                ActivityCompat.shouldShowRequestPermissionRationale(
                    activity,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                ) ||
                ActivityCompat.shouldShowRequestPermissionRationale(
                    activity,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            ) {
                dialogBuilder
                    .setMessage("권한이 거부 되었습니다. 직접 권한을 허용하세요.")
                    .setPositiveButton("상세") { _, _ -> context.startSettingActivity() }
                    .setNegativeButton("취소") { _, _ -> activity.finish() }
                    .setCancelable(false)
                    .show()
            } else {
                ActivityCompat.requestPermissions(
                    activity,
                    arrayOf(
                        (Manifest.permission.READ_EXTERNAL_STORAGE),
                        (Manifest.permission.RECORD_AUDIO)
                    ),
                    CreateActivity.PERMISSION_CODE
                )
            }
        }
    }

    fun clickAutoSpeak(view: View) {
        view.isSelected = !view.isSelected
        isAutoSpeak.value = view.isSelected
        Log.d("view.select", view.isSelected.toString())
    }

    fun createCard() {
        //TODO: 서버 연결
    }
}