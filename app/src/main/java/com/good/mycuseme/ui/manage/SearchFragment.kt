package com.good.mycuseme.ui.manage

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
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
import com.good.mycuseme.databinding.FragmentSearchBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity
import com.good.mycuseme.ui.card.DownloadActivity
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.toolbar_manager_search.iv_search_download

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search),
    SwipeRefreshLayout.OnRefreshListener {
    private val searchViewModel by lazy { ViewModelProvider(this).get(SearchViewModel::class.java) }
    private val token by lazy {
        SharedPreferenceController.getUserToken(activity!!.applicationContext)
    }
    lateinit var recycleAdapter: BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initRecyclerView()
        download()
    }

    override fun onStart() {
        super.onStart()
        getCards()
        searchCard()
        searchFilter()
    }

    private fun initData() {
        binding.searchViewModel = searchViewModel
        srl_search.apply {
            setOnRefreshListener(this@SearchFragment)
            setColorSchemeResources(
                R.color.mainpink,
                R.color.light_blue
            )
        }
    }

    private fun initRecyclerView() {
        binding.rvSearch.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            recycleAdapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_search_item,
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
            this.adapter = recycleAdapter
        }
    }


    private fun searchCard() {
        binding.svCard.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                recycleAdapter.filter(newText)
                return false
            }
        })
    }

    private fun searchFilter() {
        recycleAdapter.filter(sv_card.query.toString())
    }

    private fun getCards() {
        searchViewModel.getAllCard(token!!)
    }

    private fun download() {
        iv_search_download.setOnClickListener {
            val intent = Intent(context, DownloadActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRefresh() {
        searchFilter()
        srl_search.isRefreshing = false
    }
}