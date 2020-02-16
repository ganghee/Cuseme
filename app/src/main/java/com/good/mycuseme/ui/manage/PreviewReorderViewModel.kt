package com.good.mycuseme.ui.manage

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.card.UpdateArrBody
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException

class PreviewRearrayViewModel : BaseViewModel() {
    private val cardRepository by lazy { CardRepository() }
    var cardList = MutableLiveData<List<CardData>>()
    var tempCardList = mutableListOf<CardData>()
    val getSuccessCards = MutableLiveData<Boolean>().apply {
        value = false
    }

    fun getCard(token: String) =
        cardRepository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel getCard", it.toString())
                cardList.value = it.data.sortedBy { it.sequence }.filter {
                    it.visible
                }.toMutableList()
                tempCardList = it.data.sortedBy { it.sequence }.filter {
                    it.visible
                }.toMutableList()
                getSuccessCards.value = true
            }, {
                Log.d("PViewModel get err", it.message!!)
            })

    @SuppressLint("CheckResult")
    fun reorderCard(token: String, updateArrBody: UpdateArrBody) {
        for (i in updateArrBody.updateArr.indices) {
            Log.d(
                "updateArr   ",
                updateArrBody.updateArr[i].cardIdx.toString() + "   " +
                        updateArrBody.updateArr[i].sequence.toString()
            )

        }
        cardRepository.reorder(token, updateArrBody)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("PViewModel reorderCard", it.message)
            }, { error ->
                error as HttpException
                Log.d("list", updateArrBody.toString())
                Log.d("PViewModel reorder err", error.message())
            })
    }
}