package com.good.mycuseme.ui.card

import android.Manifest
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.net.Uri
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.util.MyTask
import com.good.mycuseme.util.isPermissionNotGranted
import com.good.mycuseme.util.startSettingActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.io.*
import java.text.SimpleDateFormat
import java.util.*

class EditViewModel : BaseViewModel() {
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
    val isSuccess = MutableLiveData<Boolean>().apply {
        value = false
    }
    private lateinit var dialogBuilder: AlertDialog.Builder
    var recordFileName: String? = null
    private var recorder: MediaRecorder? = null
    private var player: MediaPlayer? = null
    private var cardIdx: Int? = null
    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()
    val imageServer = MutableLiveData<String>()
    val recordServer = MutableLiveData<Boolean>()
    private val repository by lazy { CardRepository() }

    @SuppressLint("CheckResult")
    fun initData(token: String?, cardIndex: Int?) {
        cardIdx = cardIndex
        repository.getCard(token!!, cardIndex!!)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                title.value = it.cardData?.title
                content.value = it.cardData?.content
                imageServer.value = it.cardData?.image
                if (it.cardData?.record != null) {
                    recordServer.value = true
                    recordFileName = it.cardData.record
                    isStopClickable.value = true
                } else {
                    recordServer.value = false
                    isStopClickable.value = false
                }
                Log.d("imageServer", it.cardData?.image)
                Log.d("recordServer", it.cardData?.record.toString())
            }, { error ->
                error as HttpException
                Log.d("EditViewModel err", error.message())
            })
    }

    @SuppressLint("SimpleDateFormat")
    fun setFlieName(cacheDir: String) {
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        recordFileName = "${cacheDir}/audiorecord$timeStamp.m4a"
        Log.d("recordFileName", recordFileName)
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
                Log.e("startRecord", e.message)
            }
            start()
        }
    }

    fun startPlay() {
        player = MediaPlayer().apply {
            try {
                setDataSource(recordFileName)
                isStartClickable.value = false
                prepare()
                start()
                isPlayingRecord.value = true
            } catch (e: IOException) {
                Log.e("startPlay", "prepare() failed")
            }
            setOnCompletionListener {
                isPlayingRecord.value = false
                isStartClickable.value = true
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

    fun checkPermission(context: Context, activity: EditActivity) {
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
                    EditActivity.PERMISSION_CODE
                )
            }
        }
    }

    fun clickAutoSpeak(view: View) {
        Log.d("view.select12", view.isSelected.toString())
        if (!view.isSelected) {
            recorder?.apply {
                stop()
                release()
            }
            player?.apply {
                stop()
                release()
            }
            recorder = null
            player = null
        }
        view.isSelected = !view.isSelected
        isAutoSpeak.value = view.isSelected
        Log.d("view.select", isAutoSpeak.value.toString())
    }

    @SuppressLint("CheckResult")
    fun updateCard(token: String, image: Uri, contentResolver: ContentResolver) {
        Log.d("imageimage", image.toString())
        val bitmap: Bitmap?
        if (image.toString().slice(IntRange(0, 5)) == "https:") {
            //TODO: http로 시작하는 image인 경우에 서버에 저장되지 않는다 빈 파일이 저장된다.
            val myTask = MyTask(image)
            myTask.execute()
            bitmap = myTask.bitmap
        } else {
            val options = BitmapFactory.Options()
            val inputStream: InputStream = contentResolver.openInputStream(image)!!
            bitmap = BitmapFactory.decodeStream(inputStream, null, options)
        }
        val byteArrayOutputStream = ByteArrayOutputStream()
        //비트맵으로 변환된 이미지 data를 byteArrayOutuptStream으로 저장한다.
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream)
        //retrofit으로 image데이터를 전송할 때는 반드시 다음과 같은 작업을 거쳐 RequestBody형태로 바꾼다.
        val photoBody =
            RequestBody.create(MediaType.parse("image/jpg"), byteArrayOutputStream.toByteArray())
        //retrofit으로 image데이터를 전송할 때는 MultipartBody.Part 형태로 바꾼다.
        val photo =
            MultipartBody.Part.createFormData(
                "image",
                File(image.toString()).name + ".jpg",
                photoBody
            )
        val title = RequestBody.create(MediaType.parse("text/plain"), title.value!!)
        val content = RequestBody.create(MediaType.parse("text/plain"), content.value!!)
        val visibility = RequestBody.create(MediaType.parse("text/plain"), "true")
        val record: MultipartBody.Part?
        record = if (isAutoSpeak.value!! || recordFileName == null) {
            null
        } else {
            //TODO: http로 시작하는 recordFileName인 경우에 W/System.err: java.io.FileNotFoundException:
            // https:/s3sopt25.s3.ap-northeast-2.amazonaws.com/1580795950807.MP3: open failed:
            // ENOENT (No such file or directory) 이라는 에러가 나온다.
            val audioFile = File(recordFileName)
            val audioUri = Uri.fromFile(File(recordFileName))
            val audioBody =
                RequestBody.create(
                    MediaType.parse(contentResolver.getType(audioUri).toString()),
                    audioFile
                )
            MultipartBody.Part.createFormData("record", audioFile.name + ".mp3", audioBody)
        }
        Log.d("RequestImage", image.toString())
        Log.d("RequestRecord", record.toString())

        repository.putUpdateCard(token, cardIdx!!, photo, record, title, content, visibility)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                isSuccess.value = true
                Log.d("EditViewModel", it.message)
            }, { error ->
                error as FileNotFoundException
                Log.d("EditViewModel err", error.printStackTrace().toString())
            })
    }
}