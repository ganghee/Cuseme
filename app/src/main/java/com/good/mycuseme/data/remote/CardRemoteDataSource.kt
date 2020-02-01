package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.CardResponse
import com.good.mycuseme.data.card.CreateCardResponse
import com.good.mycuseme.data.card.DownloadResponse
import com.good.mycuseme.data.login.LoginResponse
import com.good.mycuseme.data.start.StartResponse
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

    fun getVisibleCard(uuid: String): Single<CardResponse> =
        retrofit.getVisibleCard(uuid)
            .subscribeOn(Schedulers.io())

    fun postLogin(uuid: String, password: String): Single<LoginResponse> =
        retrofit.postLogin(uuid, password)
            .subscribeOn(Schedulers.io())

    fun postDownload(token: String, serialNumber: String): Single<DownloadResponse> =
        retrofit.postCardDownload(token, serialNumber)
            .subscribeOn(Schedulers.io())

    fun postCreateCard(
        token: String,
        image: MultipartBody.Part,
        record: MultipartBody.Part?,
        title: RequestBody,
        content: RequestBody,
        visible: RequestBody): Single<CreateCardResponse> =
        retrofit.postCreateCard(token, image, record, title, content, visible)
            .subscribeOn(Schedulers.io())
}