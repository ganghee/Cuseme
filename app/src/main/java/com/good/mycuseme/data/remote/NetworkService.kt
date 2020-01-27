package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.CardResponse
import com.good.mycuseme.data.login.LoginResponse
import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

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
}