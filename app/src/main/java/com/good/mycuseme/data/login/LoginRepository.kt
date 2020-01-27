package com.good.mycuseme.data.login

import com.good.mycuseme.data.remote.CardRemoteDataSource
import io.reactivex.Single

class LoginRepository {
    fun postLogin(uuid: String, password: String): Single<LoginResponse> =
        CardRemoteDataSource.postLogin(uuid, password)
}