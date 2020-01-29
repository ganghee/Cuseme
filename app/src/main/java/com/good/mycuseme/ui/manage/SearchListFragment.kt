package com.good.mycuseme.ui.manage

import android.os.Bundle
import android.util.Log
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
import com.good.mycuseme.databinding.FragmentSearchListBinding
import com.good.mycuseme.databinding.RecyclerUserItemBinding

class SearchListFragment : BaseFragment<FragmentSearchListBinding>(R.layout.fragment_search_list) {

    private val searchListViewModel by lazy { ViewModelProvider(this).get(SearchListViewModel::class.java) }
    private lateinit var androidId: String
    private val categoryName by lazy { arguments?.getString(SORT_NAME) }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.searchListViewModel = searchListViewModel
        getUUID()
        setCardList(androidId)
    }

    private fun getUUID() {
        androidId = SharedPreferenceController.getUserUUID(activity!!.applicationContext)
    }

    private fun setCardList(androidId: String) {
        searchListViewModel.getCard(androidId, categoryName)
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

                        }
                    }
                }
            }
        }
    }

    companion object {
        private const val SORT_NAME = "sort name"
        fun newInstance(sortName: String): SearchListFragment {
            val fragment = SearchListFragment()
            val bundle = Bundle()

            bundle.putString(SORT_NAME, sortName)
            Log.d("category", "" + sortName)
            fragment.arguments = bundle
            return fragment
        }
    }
}
