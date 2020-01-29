package com.good.mycuseme.ui.manage

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class PreviewViewModel : BaseViewModel() {
    private val cardRepository by lazy { CardRepository() }
    val cardList = MutableLiveData<List<CardData>>()

    @SuppressLint("CheckResult")
    fun getCard(uuid: String) {
        cardRepository.getVisibleCard(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel getCard", it.message)
                cardList.value = it.data.sortedBy { it.sequence }
            }, {
                Log.d("UserViewModel getCard", it.message)
            })
    }
}