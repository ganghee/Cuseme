package com.good.mycuseme.adapter

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.UpdateArr
import com.good.mycuseme.data.card.UpdateArrBody
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.manage.PreviewReorderViewModel
import kotlinx.android.synthetic.main.recycler_reorder_item.view.*

class DragManageAdapter(
    adapter: BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>,
    private val viewmodel: PreviewReorderViewModel,
    private val token: String,
    dragDirs: Int,
    swipeDirs: Int
) : ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {

    private var fromPosition = 0
    private var toPosition = 0
    private val dragAdapter = adapter
    private val temp = ArrayList<CardData>()
    private val updateItem = mutableListOf<CardData>()
    override fun getSwipeDirs(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        updateItem.clear()
        updateItem.addAll(dragAdapter.items)
        viewHolder.itemView.view_masking.isSelected = true
        fromPosition = viewHolder.adapterPosition
        return 0
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        dragAdapter.notifyItemMoved(viewHolder.adapterPosition, target.adapterPosition)
        return true
    }

    override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
        viewHolder.itemView.view_masking.isSelected = false
        toPosition = viewHolder.adapterPosition

        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                temp.add(updateItem[i])
                updateItem[i] = updateItem[i + 1]
                updateItem[i + 1] = temp[0]
                temp.clear()
            }
        } else if (fromPosition > toPosition) {
            for (i in fromPosition downTo toPosition + 1) {
                temp.add(updateItem[i - 1])
                updateItem[i - 1] = updateItem[i]
                updateItem[i] = temp[0]
                temp.clear()
            }
        }
        val updateList = mutableListOf<UpdateArr>()
        updateList.clear()
        for (i in updateItem.indices) {
            updateList.add(
                UpdateArr(
                    updateItem[i].cardIdx,
                    updateItem[i].visible,
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