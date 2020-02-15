package com.good.mycuseme.ui.card

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.card.UpdateArr
import com.good.mycuseme.data.card.UpdateArrBody
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.recycler_hidden_item.view.*
import retrofit2.HttpException

class HiddenCardViewModel : BaseViewModel() {
    private val repository: CardRepository by lazy { CardRepository() }
    var cardList = MutableLiveData<List<CardData>>()
    val updateCardList =
        mutableListOf<UpdateArr>() //list는 MutableLiveData를 사용하지 못한다. 즉, observer 불가
    val isSaveClickable = MutableLiveData<Boolean>()

    fun hiddenCards(token: String) =
        repository.getAllCard(token)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                cardList.value = it.data.sortedBy { it.sequence }.filter { !it.visible }
                Log.d("hiddenviewmodel getcard", it.message)
            }, { error ->
                error as HttpException
                Log.d("getcards error", error.message!!)
            })

    @SuppressLint("CheckResult")
    fun changeVisibility(token: String) {
        val updateArrBody = UpdateArrBody(updateCardList)
        repository.reorder(token, updateArrBody)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("changeVisibility", it.message)
            }, { error ->
                error as HttpException
                Log.d("chandgeVisibility error", error.message!!)
            })
    }

    fun changeUpdateList(parent: ViewGroup, cardData: CardData, position: Int) {
        if (parent.getChildAt(position).view_masking.isSelected) {
            parent.getChildAt(position).view_masking.isSelected = false
            parent.getChildAt(position).iv_visibility.isSelected = false
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                updateCardList.removeIf { n -> n.cardIdx == cardData.cardIdx }
            }
        } else {
            parent.getChildAt(position).view_masking.isSelected = true
            parent.getChildAt(position).iv_visibility.isSelected = true
            updateCardList.add(UpdateArr(cardData.cardIdx, true, cardData.sequence))
        }

        if (!updateCardList.isNullOrEmpty()) {
            isSaveClickable.value = true
        } else if (updateCardList.isNullOrEmpty())
            isSaveClickable.value = false
    }
}