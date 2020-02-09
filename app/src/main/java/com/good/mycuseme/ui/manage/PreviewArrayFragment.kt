package com.good.mycuseme.ui.manage

import android.content.Intent
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
import com.good.mycuseme.databinding.FragmentArrayPreviewBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.card.ContentCardActivity

class PreviewArrayFragment : BaseFragment<FragmentArrayPreviewBinding>(R.layout.fragment_array_preview) {

    private val previewArrayViewModel by lazy { ViewModelProvider(this).get(PreviewArrayViewModel::class.java) }
    private val categoryName by lazy { arguments?.getString(SORT_NAME) }
    private var token: String? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.previewArrayViewModel = previewArrayViewModel
        getToken()
        setCardList(token!!)
    }

    private fun getToken() {
        token = SharedPreferenceController.getUserToken(activity!!.applicationContext)
    }

    private fun setCardList(token: String) {
        previewArrayViewModel.getAllCard(token, categoryName)
        binding.rvPreview.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_card_item,
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
