package com.good.mycuseme.data.card

import com.good.mycuseme.data.remote.CardRemoteDataSource
import io.reactivex.Single
import okhttp3.MultipartBody
import okhttp3.RequestBody

class CardRepository {
    fun getVisibleCard(uuid: String): Single<CardListResponse> =
        CardRemoteDataSource.getVisibleCard(uuid)

    fun postDownloadCard(token: String, serialNum: String): Single<CardResponse> =
        CardRemoteDataSource.postDownload(token, serialNum)

    fun postCreateCard(
        token: String,
        image: MultipartBody.Part,
        record: MultipartBody.Part?,
        title: RequestBody,
        content: RequestBody,
        visible: RequestBody
    ): Single<CardResponse> =
        CardRemoteDataSource.postCreateCard(token, image, record, title, content, visible)

    fun putUpdateCard(
        token: String,
        cardIdx: Int,
        image: MultipartBody.Part,
        record: MultipartBody.Part?,
        title: RequestBody,
        content: RequestBody,
        visible: RequestBody
    ): Single<CardResponse> =
        CardRemoteDataSource.putUpdateCard(token, cardIdx, image, record, title, content, visible)

    fun hideCard(
        token: String,
        cardIdx: Int,
        isVisible: HideBody
    ): Single<CardResponse> =
        CardRemoteDataSource.hideCard(token, cardIdx, isVisible)

    fun getCard(token: String, cardIdx: Int): Single<CardResponse> =
        CardRemoteDataSource.getCard(token, cardIdx)

    fun deleteCard(token: String, cardIdx: Int) =
        CardRemoteDataSource.deleteCard(token, cardIdx)

    fun getAllCard(token: String) =
        CardRemoteDataSource.getAllCard(token)

    fun addCount(cardIdx: Int, uuid: CountBody) =
        CardRemoteDataSource.addCount(cardIdx, uuid)

}