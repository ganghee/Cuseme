package com.good.mycuseme.ui.card

import android.Manifest
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.util.isPermissionNotGranted
import com.good.mycuseme.util.startSettingActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.*

class CreateViewModel : BaseViewModel() {
    val isAutoSpeak = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isSaveRecord = MutableLiveData<Boolean>().apply {
        value = false
    }
    val isSaveRecordClickable = MutableLiveData<Boolean>().apply {
        value = false
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
    private lateinit var recordFileName: String
    private var recorder: MediaRecorder? = null
    private var player: MediaPlayer? = null
    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()
    private val repository by lazy { CardRepository() }
    var uriRotateImage = MutableLiveData<Uri>()

    @SuppressLint("SimpleDateFormat")
    fun setFileName(cacheDir: String) {
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        recordFileName = "${cacheDir}/audiorecord$timeStamp.m4a"
    }

    fun startRecord() {
        speakFileNull()
        isSaveRecordClickable.value = false
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
                setOnPreparedListener {
                    it.start()
                }
                isPlayingRecord.value = true
            } catch (e: IOException) {
                Log.e("startPlay", "prepare() failed")
            }
            setOnCompletionListener {
                stopPlaying()
            }
        }
    }

    fun stopPlaying() {
        isPlayingRecord.value = false
        player?.apply {
            stop()
            release()
        }
    }

    fun stopRecord() {
        recorder?.apply {
            stop()
            release()
            isPlayingRecord.value = false
            isSaveRecordClickable.value = true
            isRecording.value = false
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
        if (!view.isSelected) {
            speakFileNull()
        }
        view.isSelected = !view.isSelected
        isAutoSpeak.value = view.isSelected
    }

    private fun speakFileNull() {
        recorder = null
        player = null
    }

    @SuppressLint("CheckResult")
    fun createCard(token: String, image: Uri, contentResolver: ContentResolver) {
        val options = BitmapFactory.Options()
        val inputStream: InputStream = contentResolver.openInputStream(image)!!
        val bitmap = BitmapFactory.decodeStream(inputStream, null, options)
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream)
        val photoBody =
            RequestBody.create(MediaType.parse("image/jpg"), byteArrayOutputStream.toByteArray())
        val photo =
            MultipartBody.Part.createFormData(
                "image",
                File(image.toString()).name + ".jpg",
                photoBody
            )
        val audioFile = File(recordFileName)
        val audioUri = Uri.fromFile(File(recordFileName))
        val audioBody =
            RequestBody.create(
                MediaType.parse(contentResolver.getType(audioUri).toString()),
                audioFile
            )
        var record: MultipartBody.Part? =
            MultipartBody.Part.createFormData("record", audioFile.name + ".mp3", audioBody)
        val title = RequestBody.create(MediaType.parse("text/plain"), title.value!!)
        val content = RequestBody.create(MediaType.parse("text/plain"), content.value!!)
        val visibility = RequestBody.create(MediaType.parse("text/plain"), "true")
        if (recorder == null) {
            record = null
        }
        repository.postCreateCard(token, photo, record, title, content, visibility)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                isSuccess.value = true
                Log.d("CreateViewModel", it.message)

            }, { error ->
                error as HttpException
                Log.d("CreateViewModel err", error.message())
            })
    }

    fun setRotateImage(imageUri: Uri, contentResolver: ContentResolver) {
        try {
            val imagePath = absolutelyPath(imageUri, contentResolver)
            val image = BitmapFactory.decodeFile(imagePath)
            val exif = ExifInterface(imagePath)
            val exifOrientation = exif.getAttributeInt(
                ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL
            )
            val exifDegree = exifOrientationToDegrees(exifOrientation)
            uriRotateImage.value = rotate(image, exifDegree, contentResolver)
        } catch (e: Exception) {
            Log.d("image err", e.localizedMessage!!)
        }
    }

    private fun rotate(getBitmap: Bitmap, degrees: Int, contentResolver: ContentResolver): Uri {
        var bitmap = getBitmap
        if (degrees != 0) {
            val m = Matrix()
            m.setRotate(
                degrees.toFloat(), bitmap.width.toFloat() / 2,
                bitmap.height.toFloat() / 2
            )
            try {
                val converted = Bitmap.createBitmap(
                    bitmap, 0, 0,
                    bitmap.width, bitmap.height, m, true
                )
                if (bitmap != converted) {
                    bitmap.recycle()
                    bitmap = converted
                }
            } catch (ex: OutOfMemoryError) { // 메모리가 부족하여 회전을 시키지 못할 경우 그냥 원본을 반환합니다.
            }
        }
        val bytes = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path: String =
            MediaStore.Images.Media.insertImage(contentResolver, bitmap, "Title", null)
        return Uri.parse(path)
    }

    @SuppressLint("Recycle")
    fun absolutelyPath(path: Uri, contentResolver: ContentResolver): String {
        val proj: Array<String> = arrayOf(MediaStore.Images.Media.DATA)
        val c: Cursor = contentResolver.query(path, proj, null, null, null)!!
        val index = c.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
        c.moveToFirst()

        return c.getString(index)
    }

    private fun exifOrientationToDegrees(exifOrientation: Int): Int {
        return when (exifOrientation) {
            ExifInterface.ORIENTATION_ROTATE_90 -> 90
            ExifInterface.ORIENTATION_ROTATE_180 -> 180
            ExifInterface.ORIENTATION_ROTATE_270 -> 270
            else -> 0
        }
    }

}