package com.good.mycuseme.ui.login

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.user.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class LoginViewModel : BaseViewModel() {
    val password = MutableLiveData<String>()
    val token = MutableLiveData<String>()
    val isClickable = MutableLiveData<Boolean>().apply {
        value = false
    }
    val loginSuccess = MutableLiveData<Boolean>().apply {
        value = false
    }
    val wrongPassword = MutableLiveData<Boolean>().apply {
        value = false
    }
    private val loginRepository by lazy { UserRepository() }

    @SuppressLint("CheckResult")
    fun login(uuid: String, password: String) {
        loginRepository.postLogin(uuid, password)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                token.value = it.tokenData?.token
                loginSuccess.value = true
                Log.d("LoginViewModel getToken", it.message)
            }, { error ->
                error as HttpException
                if (error.code() == 403) wrongPassword.value = true
                Log.d("LoginViewModel getToken", error.toString())
            })
    }

    fun clickable(password: String) {
        isClickable.value = password.isNotEmpty()
    }
}