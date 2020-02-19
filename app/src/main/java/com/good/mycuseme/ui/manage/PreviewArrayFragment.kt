package com.good.mycuseme.ui.manage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseFragment
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.FragmentArrayPreviewBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity
import kotlinx.android.synthetic.main.fragment_array_preview.*

class PreviewArrayFragment :
    BaseFragment<FragmentArrayPreviewBinding>(R.layout.fragment_array_preview),
    SwipeRefreshLayout.OnRefreshListener {

    private val previewArrayViewModel by lazy { ViewModelProvider(this).get(PreviewArrayViewModel::class.java) }
    private val categoryName by lazy { arguments?.getString(SORT_NAME) }
    private val token: String by lazy { SharedPreferenceController.getUserToken(activity!!.applicationContext)!! }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initData()
        emptyCheck()
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        getArrayCards()
    }

    private fun initData() {
        binding.previewArrayViewModel = previewArrayViewModel
        srl_order.apply {
            setOnRefreshListener(this@PreviewArrayFragment)
            setColorSchemeResources(R.color.mainpink, R.color.light_blue)
        }
    }

    private fun initRecyclerView() {
        binding.rvPreview.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_order_item,
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
        }
    }

    private fun emptyCheck() {
        previewArrayViewModel.cardList.observe(this, Observer {
            if (it.isNullOrEmpty()) {
                iv_array_empty.visibility = View.VISIBLE
                tv_array_empty.visibility = View.VISIBLE
            } else {
                iv_array_empty.visibility = View.GONE
                tv_array_empty.visibility = View.GONE
            }
        })
    }

    private fun getArrayCards() {
        previewArrayViewModel.getAllCard(token, categoryName)
    }

    override fun onRefresh() {
        getArrayCards()
        srl_order.isRefreshing = false
    }

    companion object {
        private const val SORT_NAME = "sort name"
        fun newInstance(sortName: String): PreviewArrayFragment {
            val fragment = PreviewArrayFragment()
            val bundle = Bundle()

            bundle.putString(SORT_NAME, sortName)
            Log.d("category", "" + sortName)
            fragment.arguments = bundle
            return fragment
        }
    }
}
