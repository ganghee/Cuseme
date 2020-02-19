package com.good.mycuseme.ui.manage

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import io.reactivex.android.schedulers.AndroidSchedulers

class SearchViewModel : BaseViewModel() {

    private val cardRepository by lazy { CardRepository() }
    var cardList = MutableLiveData<List<CardData>>()

    fun getAllCard(token: String) =
        cardRepository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("SearchViewModel getCard", it.message)
                cardList.value = it.data
            }, {
                Log.d("SearchViewModel getCard", it.message!!)
            })
}