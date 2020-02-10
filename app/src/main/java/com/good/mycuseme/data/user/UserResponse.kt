package com.good.mycuseme.data.user

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("data")
    val tokenData: TokenData?,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)

data class TokenData(
    @SerializedName("token")
    val token: String
)