package com.good.mycuseme.ui.manage

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseFragment
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.FragmentPreviewBinding
import com.good.mycuseme.databinding.RecyclerUserItemBinding
import com.good.mycuseme.ui.card.EditActivity
import kotlinx.android.synthetic.main.activity_manage.*
import kotlinx.android.synthetic.main.recycler_user_item.view.*
import kotlinx.android.synthetic.main.tabbar_bottom.*

class PreviewFragment : BaseFragment<FragmentPreviewBinding>(R.layout.fragment_preview) {

    private val previewViewModel by lazy { ViewModelProvider(this).get(PreviewViewModel::class.java) }
    private var token: String? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.previewViewModel = previewViewModel

        getToken()
        setCardList(token!!)
    }

    private fun getToken() {
        token = SharedPreferenceController.getUserToken(activity!!.applicationContext)
    }

    private fun setCardList(androidId: String) {
        previewViewModel.getCard(token!!)
        binding.rvPreview.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerUserItemBinding>(
                layoutRes = R.layout.recycler_user_item,
                bindingId = BR.cardData
            ) {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): BaseViewHolder<RecyclerUserItemBinding> {
                    return super.onCreateViewHolder(parent, viewType).apply {
                        itemView.setOnClickListener {
                            singleItemClick(parent, it)
                            showBottomTab(parent)
                            deleteCard(items[position], position, parent)
                            hideCard(items[position], position, parent)
                            modifyCard(items[position])
                            Log.d("cardIdx", items[position].cardIdx.toString())
                            Log.d("cardData", items[position].toString())
                        }
                    }
                }
            }
        }
    }

    private fun modifyCard(cardData: CardData) {
        (this@PreviewFragment.context as ManageCardActivity).ll_bottom_modify.setOnClickListener {
            val intent = Intent(activity, EditActivity::class.java)
            Log.d("datadate", cardData.cardIdx.toString())
            intent.putExtra("cardIdx", cardData.cardIdx)
            startActivity(intent)
            activity?.finish()
        }
    }

    private fun hideCard(cardData: CardData, position: Int, parent: ViewGroup) {
        (this@PreviewFragment.context as ManageCardActivity).ll_bottom_hide.setOnClickListener {
            previewViewModel.hideCard(token!!, cardData, activity!!.contentResolver)
            initBottomTab(parent)
        }
    }

    private fun deleteCard(cardData: CardData, position: Int, parent: ViewGroup) {
        (this@PreviewFragment.context as ManageCardActivity).ll_bottom_delete.setOnClickListener {
            AlertDialog.Builder(ContextThemeWrapper(context, R.style.Theme_AppCompat_Light_Dialog))
                .setMessage("카드를 완전히 삭제하시겠습니까?")
                .setPositiveButton("삭제") { _, _ ->
                    previewViewModel.apply {
                        deleteCard(token!!, cardData.cardIdx, position)
                        initBottomTab(parent)
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
        (this@PreviewFragment.context as ManageCardActivity).tabbar_manage_bottom.visibility =
            View.VISIBLE
        (this@PreviewFragment.context as ManageCardActivity).fb_manage_add_card.visibility =
            View.GONE
        (this@PreviewFragment.context as ManageCardActivity).ll_bottom_cancel.setOnClickListener {
            initBottomTab(parent)
        }
    }

    private fun initBottomTab(parent: ViewGroup) {
        (this@PreviewFragment.context as ManageCardActivity).tabbar_manage_bottom.visibility =
            View.GONE
        (this@PreviewFragment.context as ManageCardActivity).cv_bottom_bar.visibility =
            View.VISIBLE
        (this@PreviewFragment.context as ManageCardActivity).fb_manage_add_card.visibility =
            View.VISIBLE
        for (i in 0 until parent.childCount) {
            parent.getChildAt(i).view_masking.isSelected = false
        }
    }
}
