package com.good.mycuseme.ui.manage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
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
import com.good.mycuseme.databinding.FragmentReorderPreviewBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity
import kotlinx.android.synthetic.main.fragment_reorder_preview.*

class PreviewReorderFragment :
    BaseFragment<FragmentReorderPreviewBinding>(R.layout.fragment_reorder_preview),
    SwipeRefreshLayout.OnRefreshListener {

    private val previewReorderViewModel by lazy {
        ViewModelProvider(this).get(
            PreviewReorderViewModel::class.java
        )
    }
    private val token by lazy { SharedPreferenceController.getUserToken(parentFragment?.activity!!.applicationContext)!! }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.d("token", token)
        initData()
        initRecyclerView()
    }

    override fun onStart() {
        super.onStart()
        getReorderCards()
        emptyCheck()
    }

    private fun initData() {
        binding.previewReorderViewModel = previewReorderViewModel
        srl_reorder.apply {
            setOnRefreshListener(this@PreviewReorderFragment)
            setColorSchemeResources(R.color.mainpink, R.color.light_blue)
        }
    }

    private fun initRecyclerView() {
        binding.rvPreview.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            val baseAdapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
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
            this.adapter = baseAdapter
            val callback = DragManageAdapter(
                baseAdapter,
                previewReorderViewModel,
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

    private fun emptyCheck() {
        previewReorderViewModel.cardList.observe(this, Observer {
            if (it.isNullOrEmpty()) {
                iv_reorder_empty.visibility = View.VISIBLE
                tv_reorder_empty.visibility = View.VISIBLE
            } else {
                iv_reorder_empty.visibility = View.GONE
                tv_reorder_empty.visibility = View.GONE
            }
        })
    }

    private fun getReorderCards() {
        previewReorderViewModel.getCard(token)
    }

    override fun onRefresh() {
        getReorderCards()
        srl_reorder.isRefreshing = false
    }
}
