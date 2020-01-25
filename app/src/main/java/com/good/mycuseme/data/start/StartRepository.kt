package com.good.mycuseme.data.start

import com.good.mycuseme.data.remote.CardRemoteDataSource
import io.reactivex.Single
import java.util.*

class StartRepository {
    fun postStart(uuid: String): Single<StartResponse> =
        CardRemoteDataSource.postStart(uuid)
}