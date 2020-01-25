package com.good.mycuseme.data.remote

import com.good.mycuseme.data.start.StartResponse
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*

interface NetworkService {

    @FormUrlEncoded
    @POST("/auth/start")
    fun postStart(@Field("uuid")uuid: String) : Single<StartResponse>
}