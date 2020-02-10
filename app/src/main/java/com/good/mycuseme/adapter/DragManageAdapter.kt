package com.good.mycuseme.adapter

import android.content.Context
import android.widget.BaseAdapter
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.databinding.RecyclerCardItemBinding

class DragManageAdapter(
    adapter: BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>,
    context: Context,
    dragDirs: Int,
    swipeDirs: Int
) : ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {
    private val dragAdapter = adapter
    override fun getSwipeDirs(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        return 0
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        dragAdapter.swapItems(viewHolder.adapterPosition, target.adapterPosition)
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {}
}