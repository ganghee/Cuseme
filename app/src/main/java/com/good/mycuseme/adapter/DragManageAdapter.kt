package com.good.mycuseme.adapter

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.UpdateArr
import com.good.mycuseme.data.card.UpdateArrBody
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.manage.PreviewRearrayViewModel
import kotlinx.android.synthetic.main.recycler_reorder_item.view.*

class DragManageAdapter(
    adapter: BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>,
    private val viewmodel: PreviewRearrayViewModel,
    private val token: String,
    dragDirs: Int,
    swipeDirs: Int
) : ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {

    private val dragAdapter = adapter
    override fun getSwipeDirs(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        viewHolder.itemView.view_masking.isSelected = true
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

    override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.view_masking.isSelected = false
        val updateList = mutableListOf<UpdateArr>()
        updateList.clear()
        for (i in dragAdapter.items.indices) {
            updateList.add(
                UpdateArr(
                    dragAdapter.items[i].cardIdx,
                    dragAdapter.items[i].visible,
                    i
                )
            )
        }
        val reorderBody = UpdateArrBody(updateList)
        viewmodel.reorderCard(token, reorderBody)
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
    }
}