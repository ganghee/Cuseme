package com.good.mycuseme.ui.setting

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.user.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class PhoneNumberViewModel : BaseViewModel() {
    val phoneNumber = MutableLiveData<String>()
    val isClickable = MutableLiveData<Boolean>()
    private val repository by lazy { UserRepository() }
    val isSuccess = MutableLiveData<Int>().apply {
        value = 0
    }

    @SuppressLint("CheckResult")
    fun changePhoneNumber(token: String, phoneNumber: String) {
        Log.d("token phone", phoneNumber)
        repository.changePhoneNumber(token, phoneNumber)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                isSuccess.value = 1
                isSuccess.value = 0
                Log.d("phone", it.message)
            }, { error ->
                error as HttpException
                Log.d("phone err", error.message!!)
                isSuccess.value = -1
                isSuccess.value = 0
            })
    }

    fun notNullNumber() {
        isClickable.value = !phoneNumber.value.isNullOrEmpty()
    }
}