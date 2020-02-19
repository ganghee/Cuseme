package com.good.mycuseme.base

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.good.mycuseme.data.card.CardData
import java.util.*

abstract class BaseRecyclerViewAdapter<ITEM : Any, B : ViewDataBinding>(
    @LayoutRes
    private val layoutRes: Int,
    private val bindingId: Int? = null
) : RecyclerView.Adapter<BaseViewHolder<B>>() {

    val items = mutableListOf<ITEM>()
    val temp = mutableListOf<ITEM>()
    val searchItems = mutableListOf<ITEM>()

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

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BaseViewHolder<B>, position: Int) =
        holder.onBindViewHolder(items[position])

    fun swapItems(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                temp.add(items[i])
                items[i] = items[i + 1]
                items[i + 1] = temp[0]
            }
        } else {
            for (i in fromPosition..toPosition + 1) {
                temp.add(items[i - 1])
                items[i - 1] = items[i]
                items[i] = temp[0]
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

    fun filter(charText: String?) {
        items.clear()
        val lowChar = charText?.toLowerCase(Locale.getDefault())
        if (lowChar?.length != 0) {
            for (cardData in searchItems) {
                cardData as CardData
                if (cardData.title.toLowerCase(Locale.getDefault()).contains(lowChar.toString())) {
                    items.add(cardData)
                }
            }
        } else {
            items.addAll(searchItems)
        }
        notifyDataSetChanged()
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

}