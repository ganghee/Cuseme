package com.good.mycuseme.ui.manage

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class PreviewArrayViewModel : BaseViewModel() {
    val cardList = MutableLiveData<List<CardData>>()
    private val cardRepository by lazy { CardRepository() }
    val getSuccessCards = MutableLiveData<Boolean>()

    fun getAllCard(token: String, sorting: String?) =
        cardRepository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("ArrayViewModel getCard", it.message)
                sort(it.data, sorting)
                getSuccessCards.value = true
            }, {
                Log.d("ArrayViewModel getCard", it.message!!)
            })

    private fun sort(sortedList: List<CardData>?, sorting: String?) {
        when (sorting) {
            "visibility" -> {
                cardList.value = sortedList?.sortedBy { it.sequence }?.filter { it.visible }
            }
            "title" -> {
                cardList.value = sortedList?.sortedBy { it.title }?.filter { it.visible }
            }
            "count" -> {
                cardList.value = sortedList?.sortedByDescending { it.count }?.filter { it.visible }
            }
        }
    }
}