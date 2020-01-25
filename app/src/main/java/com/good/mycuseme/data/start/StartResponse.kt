package com.good.mycuseme.data.start


import com.google.gson.annotations.SerializedName

data class StartResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)