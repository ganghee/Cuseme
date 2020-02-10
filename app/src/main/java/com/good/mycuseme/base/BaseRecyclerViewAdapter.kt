package com.good.mycuseme.base

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<ITEM : Any, B : ViewDataBinding>(
    @LayoutRes
    private val layoutRes: Int,
    private val bindingId: Int? = null
) : RecyclerView.Adapter<BaseViewHolder<B>>() {

    val items = mutableListOf<ITEM>()

    fun replaceAll(items: List<ITEM>?) {
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
                items[i + 1] = items[i]
                items[i] = items[i + 1]
            }
        } else {
            for (i in fromPosition..toPosition + 1) {
                items[i - 1] = items[i]
                items[i] = items[i - 1]
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

}