package com.good.mycuseme.data.card


import com.google.gson.annotations.SerializedName

data class CardResponse(
    @SerializedName("data")
    val cardData: CardData,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)