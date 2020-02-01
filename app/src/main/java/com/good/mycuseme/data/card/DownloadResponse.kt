package com.good.mycuseme.data.card


import com.google.gson.annotations.SerializedName

data class DownloadResponse(
    @SerializedName("data")
    val downloadData: DownloadData,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)