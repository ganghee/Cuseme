package com.good.mycuseme.ui.user

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.start.StartRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class UserViewModel : BaseViewModel() {
    private val startRepository by lazy { StartRepository() }
    private val cardRepository by lazy { CardRepository() }
    val cardList = MutableLiveData<List<CardData>>()
    private val sortList = listOf("visibility", "title", "count")
    private var index = 0

    @SuppressLint("CheckResult")
    fun getUUID(uuid: String) {
        startRepository.postStart(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel getUUID", it.message)
            }, {
                Log.d("UserViewModel getUUID", it.message)
            })
    }

    @SuppressLint("CheckResult")
    fun getCard(uuid: String) {
        cardRepository.getVisibleCard(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel getCard", it.message)
                sort(it.data)
            }, {
                Log.d("UserViewModel getCard", it.message)
            })
    }

    fun sort(sortedList: List<CardData>?) {
        when (sortList[index]) {
            "visibility" -> {
                cardList.value = sortedList?.sortedBy { it.sequence }
                index = 1
            }
            "title" -> {
                cardList.value = sortedList?.sortedBy { it.title }
                index = 2
            }
            "count" -> {
                cardList.value = sortedList?.sortedBy { it.count }
                index = 0
            }
        }
    }
}
