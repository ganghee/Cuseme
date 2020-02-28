package com.good.mycuseme.data.remote

import com.good.mycuseme.data.card.*
import com.good.mycuseme.data.start.StartResponse
import com.good.mycuseme.data.user.UserResponse
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
    ): Single<UserResponse>

    @POST("/cards/{serialNum}")
    fun postCardDownload(
        @Header("token") token: String,
        @Path("serialNum") serialNum: String
    ): Single<CardResponse>

    @Multipart
    @POST("/cards")
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
        @Part image: MultipartBody.Part?,
        @Part record: MultipartBody.Part?,
        @Part("title") title: RequestBody,
        @Part("content") content: RequestBody,
        @Part("visible") visible: RequestBody,
        @Part("tts") tts: Boolean?
    ): Single<CardResponse>

    @GET("cards/{cardIdx}")
    fun getCard(
        @Header("token") token: String,
        @Path("cardIdx") cardIdx: Int
    ): Single<CardResponse>

    @DELETE("/cards/{cardIdx}")
    fun deleteCard(
        @Header("token") token: String,
        @Path("cardIdx") cardIdx: Int
    ): Single<CardResponse>

    @GET("/cards")
    fun getAllCard(@Header("token") token: String): Single<CardListResponse>

    @FormUrlEncoded
    @PUT("/auth/phone")
    fun changePhoneNumber(
        @Header("token") token: String,
        @Field("phoneNum") phoneNum: String
    ): Single<UserResponse>

    @FormUrlEncoded
    @PUT("/auth")
    fun changePassword(
        @Header("token") token: String,
        @Field("password") password: String,
        @Field("newPassword") newPassword: String
    ): Single<UserResponse>

    @PUT("/cards/{cardIdx}/hide")
    fun hideCard(
        @Header("token") token: String,
        @Path("cardIdx") cardIdx: Int,
        @Body hideBody: HideBody
    ): Single<CardResponse>

    @PUT("/cards/{cardIdx}/count")
    fun addCount(
        @Path("cardIdx") cardIdx: Int,
        @Body uuid: CountBody
    ): Single<CardResponse>

    @PUT("/cards")
    fun reorder(
        @Header("token") token: String,
        @Body updateArr: UpdateArrBody
    ): Single<CardResponse>
}