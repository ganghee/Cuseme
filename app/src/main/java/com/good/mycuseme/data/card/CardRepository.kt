package com.good.mycuseme.data.card

import com.good.mycuseme.data.remote.CardRemoteDataSource
import io.reactivex.Single

class CardRepository {
    fun getVisibleCard(uuid: String): Single<CardResponse> =
        CardRemoteDataSource.getVisibleCard(uuid)

    fun postDownloadCard(token: String, serialNum: String): Single<DownloadResponse> =
        CardRemoteDataSource.postDownload(token, serialNum)

}