package com.good.mycuseme.ui.user

import android.annotation.SuppressLint
import android.util.Log
import com.good.mycuseme.adapter.CardAdapter
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.start.StartRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class UserViewModel : BaseViewModel() {
    val startRepository by lazy { StartRepository() }
    val cardAdapter by lazy { CardAdapter() }

    @SuppressLint("CheckResult")
    fun getUUID(uuid: String) {
        startRepository.postStart(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel", it.message)
            }, {
                Log.d("UserViewModel", it.message)
            })
    }


}
