package com.good.mycuseme.data.card


import com.google.gson.annotations.SerializedName

data class CardData(
    @SerializedName("cardIdx")
    val cardIdx: Int,
    @SerializedName("content")
    val content: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("record")
    val record: String,
    @SerializedName("sequence")
    val sequence: Int,
    @SerializedName("serialNum")
    val serialNum: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("visible")
    val visible: Boolean
)