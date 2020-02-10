package com.good.mycuseme.data.user

import com.good.mycuseme.data.remote.CardRemoteDataSource
import io.reactivex.Single

class UserRepository {
    fun postLogin(uuid: String, password: String): Single<UserResponse> =
        CardRemoteDataSource.postLogin(uuid, password)

    fun changePhoneNumber(token: String, phoneNumber: String) =
        CardRemoteDataSource.changePhoneNumber(token, phoneNumber)

    fun changePassword(token: String, password: String, newPassword: String) =
        CardRemoteDataSource.changePassword(token, password, newPassword)
}