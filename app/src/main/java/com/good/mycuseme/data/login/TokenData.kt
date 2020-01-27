package com.good.mycuseme.data.login


import com.google.gson.annotations.SerializedName

data class TokenData(
    @SerializedName("token")
    val token: String
)