package com.good.mycuseme.ui.manage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.adapter.DragManageAdapter
import com.good.mycuseme.base.BaseFragment
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.FragmentRearrayPreviewBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity
import kotlinx.android.synthetic.main.activity_manage.*
import kotlinx.android.synthetic.main.fragment_rearray_preview.*

class PreviewRearrayFragment :
    BaseFragment<FragmentRearrayPreviewBinding>(R.layout.fragment_rearray_preview),
    SwipeRefreshLayout.OnRefreshListener {

    private val previewRearrayViewModel by lazy {
        ViewModelProvider(this).get(
            PreviewRearrayViewModel::class.java
        )
    }
    private val token by lazy { SharedPreferenceController.getUserToken(parentFragment?.activity!!.applicationContext)!! }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initData()
    }

    private fun initData() {
        binding.previewRearrayViewModel = previewRearrayViewModel
        srl_reorder.apply {
            setOnRefreshListener(this@PreviewRearrayFragment)
            setColorSchemeResources(R.color.mainpink, R.color.light_blue)
        }
    }

    override fun onStart() {
        super.onStart()
        getReorderCards()
        initBottomTab()
    }

    private fun getReorderCards() {
        previewRearrayViewModel.getCard(token)
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
                previewRearrayViewModel,
                token,
                ItemTouchHelper.UP.or(ItemTouchHelper.DOWN).or(ItemTouchHelper.LEFT).or(
                    ItemTouchHelper.RIGHT
                ),
                ItemTouchHelper.UP.or(ItemTouchHelper.DOWN).or(ItemTouchHelper.LEFT).or(
                    ItemTouchHelper.RIGHT
                )
            )
            val helper = ItemTouchHelper(callback)
            helper.attachToRecyclerView(this)
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

    override fun onRefresh() {
        previewRearrayViewModel.getCard(token)
        srl_reorder.isRefreshing = false
    }
}
