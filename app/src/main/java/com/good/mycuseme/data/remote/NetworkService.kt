package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.CardListResponse
import com.good.mycuseme.data.card.CardResponse
import com.good.mycuseme.data.login.LoginResponse
import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface NetworkService {

    @FormUrlEncoded
    @POST("/auth/start")
    fun postStart(@Field("uuid") uuid: String): Single<StartResponse>

    @FormUrlEncoded
    @POST("/cards/visible")
    fun getVisibleCard(@Field("uuid") uuid: String): Single<CardListResponse>

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
    ): Single<CardResponse>

    @Multipart
    @POST("/cards/")
    fun postCreateCard(
        @Header("token") token: String,
        @Part image: MultipartBody.Part,
        @Part record: MultipartBody.Part?,
        @Part("title") title: RequestBody,
        @Part("content") content: RequestBody,
        @Part("visible") visible: RequestBody
    ): Single<CardResponse>

    @Multipart
    @PUT("/cards/{cardIdx}")
    fun putUpdateCard(
        @Header("token") token: String,
        @Path("cardIdx") cardIdx: Int,
        @Part image: MultipartBody.Part,
        @Part record: MultipartBody.Part?,
        @Part("title") title: RequestBody,
        @Part("content") content: RequestBody,
        @Part("visible") visible: RequestBody
    ): Single<CardResponse>

    @GET("cards/{cardIdx}")
    fun getCard(
        @Header("token") token: String,
        @Path("cardIdx") cardIdx: Int
    ): Single<CardResponse>
}