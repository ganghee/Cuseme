package com.good.mycuseme.data.login


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("data")
    val tokenData: TokenData,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)