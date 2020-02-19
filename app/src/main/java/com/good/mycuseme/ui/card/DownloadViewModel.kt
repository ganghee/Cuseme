package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class DownloadViewModel : BaseViewModel() {
    val serialNumber = MutableLiveData<String>()
    val isClickable = MutableLiveData<Boolean>().apply {
        value = false
    }
    val downloadSuccess = MutableLiveData<Boolean>().apply {
        value = false
    }
    val wrongDownload = MutableLiveData<Boolean>().apply {
        value = false
    }
    private val cardRepository by lazy { CardRepository() }

    @SuppressLint("CheckResult")
    fun downloadCard(token: String, serialNumber: String) {
        cardRepository.postDownloadCard(token, serialNumber)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                downloadSuccess.value = true
                Log.d("download ", it.message)
            }, { error ->
                error as HttpException
                if (error.message == "존재하지 않는 카드 입니다.") wrongDownload.value = true
                Log.d("download err", error.message)
            })
    }

    fun clickable(serialNumber: String) {
        isClickable.value = serialNumber.length == 10
    }
}