package com.good.mycuseme.data.remote

import android.util.Log
import com.good.mycuseme.data.card.CardResponse
import com.good.mycuseme.data.card.DownloadResponse
import com.good.mycuseme.data.login.LoginResponse
import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
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

    fun postDownload(token: String, serialNumber: String): Single<DownloadResponse> {
        Log.d("postdownload1", serialNumber)
        return retrofit.postCardDownload(token, serialNumber)
            .subscribeOn(Schedulers.io())
    }
}