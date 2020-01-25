package com.good.mycuseme.data.remote

import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

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
}