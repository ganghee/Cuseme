package com.good.mycuseme.ui.manage

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import androidx.core.net.toUri
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStream

class PreviewViewModel : BaseViewModel() {
    private val cardRepository by lazy { CardRepository() }
    var cardList = MutableLiveData<List<CardData>>()
    var tempCardList = mutableListOf<CardData>()

    @SuppressLint("CheckResult")
    fun getCard(token: String) {
        cardRepository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel getCard", it.message)
                cardList.value = it.data.sortedBy { it.title }.filter {
                    it.visible
                }.toMutableList()
                tempCardList = it.data.sortedBy { it.sequence }.filter {
                    it.visible
                }.toMutableList()
            }, {
                Log.d("PViewModel getCard", it.message)
            })
    }

    @SuppressLint("CheckResult")
    fun hideCard(
        token: String,
        cardData: CardData,
        contentResolver: ContentResolver
    ) {
        val options = BitmapFactory.Options()
        val inputStream: InputStream = contentResolver.openInputStream(cardData.image.toUri())!!
        val bitmap = BitmapFactory.decodeStream(inputStream, null, options)
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap?.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream)
        val photoBody =
            RequestBody.create(MediaType.parse("image/jpg"), byteArrayOutputStream.toByteArray())
        val photo =
            MultipartBody.Part.createFormData("image", File(cardData.image).name, photoBody)
        val audioFile = File(cardData.record)
        val audioUri = Uri.fromFile(File(cardData.record))
        val audioBody =
            RequestBody.create(
                MediaType.parse(contentResolver.getType(audioUri).toString()),
                audioFile
            )
        val record: MultipartBody.Part? =
            MultipartBody.Part.createFormData("record", audioFile.name, audioBody)
        val title = RequestBody.create(MediaType.parse("text/plain"), cardData.title)
        val content = RequestBody.create(MediaType.parse("text/plain"), cardData.content)
        val visibility = RequestBody.create(MediaType.parse("text/plain"), "false")

        cardRepository.putUpdateCard(
            token,
            cardData.cardIdx,
            photo,
            record,
            title,
            content,
            visibility
        )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel hideCard", it.message)
            }, { error ->
                error as HttpException
                Log.d("PViewModel hideCard", error.message!!)
            })
    }

    @SuppressLint("CheckResult")
    fun deleteCard(token: String, cardIdx: Int, position: Int) {
        cardRepository.deleteCard(token, cardIdx)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel deleteCard", it.message)
                tempCardList.removeAt(position)
                cardList.value = tempCardList
            }, { error ->
                error as HttpException
                Log.d("PViewModel deleteCard", error.message())
            })
    }
}