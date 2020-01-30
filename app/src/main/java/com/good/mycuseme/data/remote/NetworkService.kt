package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.CardResponse
import com.good.mycuseme.data.card.DownloadResponse
import com.good.mycuseme.data.login.LoginResponse
import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import retrofit2.http.*

interface NetworkService {

    @FormUrlEncoded
    @POST("/auth/start")
    fun postStart(@Field("uuid") uuid: String): Single<StartResponse>

    @FormUrlEncoded
    @POST("/cards/visible")
    fun getVisibleCard(@Field("uuid") uuid: String): Single<CardResponse>

    @FormUrlEncoded
    @POST("/auth/signin")
    fun postLogin(
        @Field("uuid") uuid: String,
        @Field("password") password: String
    ): Single<LoginResponse>

    @POST("/cards/{serialNum}")
    fun postCardDownload(
        @Header("token") token: String,
        @Path("serialNum") serialNum: String
    ): Single<DownloadResponse>
}