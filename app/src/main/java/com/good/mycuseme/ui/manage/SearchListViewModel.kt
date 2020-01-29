package com.good.mycuseme.ui.manage

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class SearchListViewModel : BaseViewModel() {
    val cardList = MutableLiveData<List<CardData>>()
    private val cardRepository by lazy { CardRepository() }

    @SuppressLint("CheckResult")
    fun getCard(uuid: String, sorting: String?) {
        cardRepository.getVisibleCard(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel getCard", it.message)
                sort(it.data, sorting)
            }, {
                Log.d("UserViewModel getCard", it.message!!)
            })
    }

    private fun sort(sortedList: List<CardData>?, sorting: String?) {
        when (sorting) {
            "visibility" -> {
                cardList.value = sortedList?.sortedBy { it.sequence }
            }
            "title" -> {
                cardList.value = sortedList?.sortedBy { it.title }
            }
            "count" -> {
                cardList.value = sortedList?.sortedBy { it.count }
            }
        }
    }

}