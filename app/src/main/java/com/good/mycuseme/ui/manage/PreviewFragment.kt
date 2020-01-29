package com.good.mycuseme.ui.manage

import android.os.Bundle
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
import kotlinx.android.synthetic.main.recycler_user_item.view.*

class PreviewFragment : BaseFragment<FragmentPreviewBinding>(R.layout.fragment_preview) {

    private val previewViewModel by lazy { ViewModelProvider(this).get(PreviewViewModel::class.java) }
    private lateinit var androidId: String

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.previewViewModel = previewViewModel

        getUUID()
        setCardList(androidId)
    }

    private fun getUUID() {
        androidId = SharedPreferenceController.getUserUUID(activity!!.applicationContext)
    }

    private fun setCardList(androidId: String) {
        previewViewModel.getCard(androidId)
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
                        }
                    }
                }
            }
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
}
