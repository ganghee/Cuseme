package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.*
import com.good.mycuseme.data.start.StartResponse
import com.good.mycuseme.data.user.UserResponse
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object CardRemoteDataSource {
    private val retrofit: NetworkService = Retrofit.Builder()
        .baseUrl("http://13.125.41.98:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(NetworkService::class.java)

    fun postStart(uuid: String): Single<StartResponse> =
        retrofit.postStart(uuid)
            .subscribeOn(Schedulers.io())

    fun getVisibleCard(uuid: String): Single<CardListResponse> =
        retrofit.getVisibleCard(uuid)
            .subscribeOn(Schedulers.io())

    fun postLogin(uuid: String, password: String): Single<UserResponse> =
        retrofit.postLogin(uuid, password)
            .subscribeOn(Schedulers.io())

    fun postDownload(token: String, serialNumber: String): Single<CardResponse> =
        retrofit.postCardDownload(token, serialNumber)
            .subscribeOn(Schedulers.io())

    fun postCreateCard(
        token: String,
        image: MultipartBody.Part,
        record: MultipartBody.Part?,
        title: RequestBody,
        content: RequestBody,
        visible: RequestBody
    ): Single<CardResponse> =
        retrofit.postCreateCard(token, image, record, title, content, visible)
            .subscribeOn(Schedulers.io())

    fun putUpdateCard(
        token: String,
        cardIdx: Int,
        image: MultipartBody.Part?,
        record: MultipartBody.Part?,
        title: RequestBody,
        content: RequestBody,
        visible: RequestBody,
        tts: Boolean?
    ): Single<CardResponse> =
        retrofit.putUpdateCard(token, cardIdx, image, record, title, content, visible, tts)
            .subscribeOn(Schedulers.io())

    fun getCard(token: String, cardIdx: Int): Single<CardResponse> =
        retrofit.getCard(token, cardIdx)
            .subscribeOn(Schedulers.io())

    fun deleteCard(token: String, cardIdx: Int): Single<CardResponse> =
        retrofit.deleteCard(token, cardIdx)
            .subscribeOn(Schedulers.io())

    fun getAllCard(token: String) =
        retrofit.getAllCard(token)
            .subscribeOn(Schedulers.io())

    fun changePhoneNumber(token: String, phoneNumber: String) =
        retrofit.changePhoneNumber(token, phoneNumber)
            .subscribeOn(Schedulers.io())

    fun changePassword(token: String, password: String, newPassword: String) =
        retrofit.changePassword(token, password, newPassword)
            .subscribeOn(Schedulers.io())

    fun hideCard(token: String, cardIdx: Int, isVisible: HideBody): Single<CardResponse> =
        retrofit.hideCard(token, cardIdx, isVisible)
            .subscribeOn(Schedulers.io())

    fun addCount(cardIdx: Int, uuid: CountBody): Single<CardResponse> =
        retrofit.addCount(cardIdx, uuid)
            .subscribeOn(Schedulers.io())

    fun reorder(token: String, updateArrList: UpdateArrBody) =
        retrofit.reorder(token, updateArrList)
            .subscribeOn(Schedulers.io())

}