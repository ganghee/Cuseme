package com.good.mycuseme.ui.manage

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.adapter.DragManageAdapter
import com.good.mycuseme.base.BaseFragment
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.HideBody
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.FragmentRearrayPreviewBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity
import com.good.mycuseme.ui.card.EditActivity
import kotlinx.android.synthetic.main.activity_manage.*
import kotlinx.android.synthetic.main.recycler_card_item.view.*
import kotlinx.android.synthetic.main.tabbar_bottom.*

class PreviewRearrayFragment : BaseFragment<FragmentRearrayPreviewBinding>(R.layout.fragment_rearray_preview) {

    private val previewRearrayViewModel by lazy { ViewModelProvider(this).get(PreviewRearrayViewModel::class.java) }
    private var token: String? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.previewRearrayViewModel = previewRearrayViewModel
        getToken()
    }

    override fun onStart() {
        super.onStart()
        setCardList()
        initBottomTab()
    }

    private fun getToken() {
        token = SharedPreferenceController.getUserToken(parentFragment?.activity!!.applicationContext)
    }

    private fun setCardList() {
        previewRearrayViewModel.getCard(token!!)
        binding.rvPreview.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            val adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_reorder_item,
                bindingId = BR.cardData
            ) {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): BaseViewHolder<RecyclerCardItemBinding> {
                    return super.onCreateViewHolder(parent, viewType).apply {
//                        itemView.setOnClickListener {
//                            singleItemClick(parent, it)
//                            showBottomTab(parent)
//                            deleteCard(items[position], position, parent)
//                            hideCard(items[position], position, parent)
//                            modifyCard(items[position])
//                            Log.d("cardIdx", items[position].cardIdx.toString())
//                            Log.d("cardData", items[position].toString())
//                        }
                        itemView.setOnClickListener {
                            val intent = Intent(context, ContentCardActivity::class.java)
                            intent.putExtra("cardIdx", items[position].cardIdx)
                            startActivity(intent)
                        }
                    }
                }
            }
            this.adapter = adapter
            val callback = DragManageAdapter(
                adapter,
                context,
                ItemTouchHelper.UP.or(ItemTouchHelper.DOWN).or(ItemTouchHelper.LEFT).or(ItemTouchHelper.RIGHT),
                ItemTouchHelper.UP.or(ItemTouchHelper.DOWN).or(ItemTouchHelper.LEFT).or(ItemTouchHelper.RIGHT)
            )
            val helper = ItemTouchHelper(callback)
            helper.attachToRecyclerView(this)
        }
    }

    private fun modifyCard(cardData: CardData) {
        (this@PreviewRearrayFragment.context as ManageCardActivity).ll_bottom_modify.setOnClickListener {
            val intent = Intent(activity, EditActivity::class.java)
            intent.putExtra("cardIdx", cardData.cardIdx)
            startActivity(intent)
        }
    }

    private fun hideCard(cardData: CardData, position: Int, parent: ViewGroup) {
        (this@PreviewRearrayFragment.context as ManageCardActivity).ll_bottom_hide.setOnClickListener {
            previewRearrayViewModel.hideCard(token!!, cardData.cardIdx, HideBody(false), position)
            initBottomTab()
            for (i in 0 until parent.childCount) {
                parent.getChildAt(i).view_masking.isSelected = false
            }
        }
    }

    private fun deleteCard(cardData: CardData, position: Int, parent: ViewGroup) {
        (this@PreviewRearrayFragment.context as ManageCardActivity).ll_bottom_delete.setOnClickListener {
            AlertDialog.Builder(ContextThemeWrapper(context, R.style.Theme_AppCompat_Light_Dialog))
                .setMessage("카드를 완전히 삭제하시겠습니까?")
                .setPositiveButton("삭제") { _, _ ->
                    previewRearrayViewModel.apply {
                        deleteCard(token!!, cardData.cardIdx, position)
                        initBottomTab()
                        for (i in 0 until parent.childCount) {
                            parent.getChildAt(i).view_masking.isSelected = false
                        }
                    }
                }
                .setNegativeButton("취소") { _, _ -> }
                .show()
        }
    }

    private fun singleItemClick(parent: ViewGroup, itemView: View) {
        for (i in 0 until parent.childCount) {
            parent.getChildAt(i).view_masking.isSelected = false
        }
        if (!itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        } else if (itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        }
    }

    private fun showBottomTab(parent: ViewGroup) {
        (this@PreviewRearrayFragment.context as ManageCardActivity).tabbar_manage_bottom.visibility =
            View.VISIBLE
        (this@PreviewRearrayFragment.context as ManageCardActivity).fb_manage_add_card.visibility =
            View.GONE
        (this@PreviewRearrayFragment.context as ManageCardActivity).ll_bottom_cancel.setOnClickListener {
            initBottomTab()
            for (i in 0 until parent.childCount) {
                parent.getChildAt(i).view_masking.isSelected = false
            }
        }
    }

    private fun initBottomTab() {
        (this@PreviewRearrayFragment.context as ManageCardActivity).tabbar_manage_bottom.visibility =
            View.GONE
        (this@PreviewRearrayFragment.context as ManageCardActivity).cv_bottom_bar.visibility =
            View.VISIBLE
        (this@PreviewRearrayFragment.context as ManageCardActivity).fb_manage_add_card.visibility =
            View.VISIBLE
    }
}
