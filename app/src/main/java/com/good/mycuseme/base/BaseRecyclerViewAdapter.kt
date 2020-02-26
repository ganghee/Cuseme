package com.good.mycuseme.base

import android.util.Log
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.ui.manage.SearchViewModel

abstract class BaseRecyclerViewAdapter<ITEM : Any, B : ViewDataBinding>(
    @LayoutRes
    private val layoutRes: Int,
    private val bindingId: Int? = null
) : RecyclerView.Adapter<BaseViewHolder<B>>() {

    val items = mutableListOf<ITEM>()
    private val temp = mutableListOf<ITEM>()
    private val searchItems = mutableListOf<ITEM>()
    private val updateList = MutableLiveData<List<ITEM>>()

    fun replaceAll(item: List<ITEM>?) {
        temp.clear()
        if (item != null) {
            this.items.run {
                clear()
                addAll(item)
                searchItems.clear()
                searchItems.addAll(this)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        object : BaseViewHolder<B>(
            layoutRes = layoutRes,
            parent = parent,
            bindingId = bindingId
        ) {}

    override fun getItemCount(): Int {
        Log.d("count", items.size.toString())
        return items.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<B>, position: Int) {
        Log.d("Bind", items[position].toString())
        holder.onBindViewHolder(items[position])
    }

//    fun swapItems(fromPosition: Int, toPosition: Int) {
//        if (fromPosition < toPosition) {
//            for (i in fromPosition until toPosition) {
//                temp.add(items[i])
//                items[i] = items[i + 1]
//                items[i + 1] = temp[0]
//            }
//        } else {
//            for (i in fromPosition..toPosition + 1) {
//                temp.add(items[i - 1])
//                items[i - 1] = items[i]
//                items[i] = temp[0]
//            }
//        }
//        notifyItemMoved(fromPosition, toPosition)
//        for (i in items) {
//            i as CardData
//            Log.d(
//                "onMove index", i.cardIdx.toString() +
//                        "   sequence   " + i.sequence.toString()
//            )
//        }
//    }

    fun filter(charText: String?) {
        val searchViewModel = SearchViewModel()
        if (charText?.isEmpty()!!) {
            items.clear()
            items.addAll(searchItems)
        } else {
            val result = ArrayList<ITEM>()
            val text = charText.toLowerCase()
            for (cardData in searchItems) {
                cardData as CardData
                if (cardData.title.toLowerCase().contains(text)) {
                    result.add(cardData)
                }
            }
            items.clear()
            items.addAll(result)
        }
        updateList.value = items
        searchViewModel.cardList.value = items as MutableList<CardData>
        notifyDataSetChanged()
    }
}

//    fun filteraaa(charText: String?): android.widget.Filter {
//        return object : android.widget.Filter() {
//            override fun performFiltering(constraint: CharSequence?): FilterResults {
//                items.clear()
//                val lowChar = charText?.toLowerCase(Locale.getDefault())
//                if (lowChar?.length != 0) {
//                    for (cardData in searchItems) {
//                        cardData as CardData
//                        if (cardData.title.toLowerCase(Locale.getDefault()).contains(lowChar.toString())) {
//                            items.add(cardData)
//                        }
//                    }
//                } else {
//                    items.addAll(searchItems)
//                }
//                val filterResults = FilterResults()
//                filterResults.values = items
//                return filterResults
//            }
//
//            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
//                items.addAll(results?.values as MutableList<ITEM>)
//                notifyDataSetChanged()
//            }
//        }
//    }

