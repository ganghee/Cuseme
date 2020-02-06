package com.good.mycuseme.ui.setting

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.user.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class PasswordViewModel : BaseViewModel() {
    val beforePassword = MutableLiveData<String?>()
    val newPassword = MutableLiveData<String>()
    val newPasswordConfirm = MutableLiveData<String>()
    val isClickable = MutableLiveData<Boolean>()
    val wrongText = MutableLiveData<String>().apply {
        value = ""
    }
    val successChange = MutableLiveData<Int>()
    val repository by lazy { UserRepository() }

    fun confirmNewPassword() {
        isClickable.value =
            !beforePassword.value.isNullOrEmpty() &&
                    !newPassword.value.isNullOrEmpty() &&
                    !newPasswordConfirm.value.isNullOrEmpty() &&
                    newPassword.value == newPasswordConfirm.value
        if (newPassword.value != null && newPasswordConfirm.value != null && newPassword.value != newPasswordConfirm.value) {
            wrongText.value = "새 비밀번호가 일치하지 않습니다."
        } else if (newPassword.value != null && newPasswordConfirm.value != null && newPassword.value == newPasswordConfirm.value) {
            wrongText.value = ""
        }
    }


    @SuppressLint("CheckResult")
    fun changePassword(token: String, password: String, newPassword: String) {
        repository.changePassword(token, password, newPassword)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                successChange.value = 1
                successChange.value = 0
                Log.d("password", it.message)
            }, { error ->
                error as HttpException
                Log.d("password", error.message)
                successChange.value = -1
                successChange.value = 0
            })
    }
}