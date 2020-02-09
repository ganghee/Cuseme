package com.good.mycuseme.ui.manage

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.card.HideBody
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class PreviewRearrayViewModel : BaseViewModel() {
    private val cardRepository by lazy { CardRepository() }
    var cardList = MutableLiveData<List<CardData>>()
    var tempCardList = mutableListOf<CardData>()

    @SuppressLint("CheckResult")
    fun getCard(token: String) {
        cardRepository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel getCard", it.message)
                cardList.value = it.data.sortedBy { it.sequence }.filter {
                    it.visible
                }.toMutableList()
                tempCardList = it.data.sortedBy { it.sequence }.filter {
                    it.visible
                }.toMutableList()
            }, {
                Log.d("PViewModel getCard", it.message!!)
            })
    }

    @SuppressLint("CheckResult")
    fun hideCard(token: String, cardIdx: Int, isVisible: HideBody, position: Int) {
        cardRepository.hideCard(token, cardIdx, isVisible)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel hideCard", it.message)
                tempCardList.removeAt(position)
                cardList.value = tempCardList
            }, { error ->
                error as HttpException
                Log.d("PViewModel hideCard", error.message!!)
            })
    }

    @SuppressLint("CheckResult")
    fun deleteCard(token: String, cardIdx: Int, position: Int) {
        cardRepository.deleteCard(token, cardIdx)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel deleteCard", it.message)
                tempCardList.removeAt(position)
                cardList.value = tempCardList
            }, { error ->
                error as HttpException
                Log.d("PViewModel deleteCard", error.message())
            })
    }
}