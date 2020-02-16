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

    fun replaceAll(items: List<ITEM>?) {
        temp.clear()
        if (items != null) {
            this.items.run {
                clear()
                addAll(items)
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
        searchItems.addAll(items)
        items.clear()
        var charText = charText
        charText = charText?.toLowerCase(Locale.getDefault())
        if (charText!!.isNotEmpty()) {
            for (cardData in searchItems) {
                cardData as CardData
                if (cardData.title.toLowerCase(Locale.getDefault()).contains(charText)) {
                    items.add(cardData)
                }
            }
        } else {
            items.addAll(searchItems)
        }
        notifyDataSetChanged()
    }
}