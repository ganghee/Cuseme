package com.good.mycuseme.data.card


import com.google.gson.annotations.SerializedName

data class DownloadData(
    @SerializedName("cardIdx")
    val cardIdx: Int,
    @SerializedName("content")
    val content: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("record")
    val record: Any,
    @SerializedName("sequence")
    val sequence: Int,
    @SerializedName("serialNum")
    val serialNum: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("visible")
    val visible: Boolean
)