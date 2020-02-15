package com.good.mycuseme.ui.card

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityHiddenCardBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_hidden_card.*
import kotlinx.android.synthetic.main.recycler_hidden_item.view.*
import kotlinx.android.synthetic.main.toolbar_back.*

class HiddenCardActivity : BaseActivity<ActivityHiddenCardBinding>(R.layout.activity_hidden_card) {

    private val hiddenCardViewModel by lazy { ViewModelProvider(this).get(HiddenCardViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.hiddenCardViewModel = hiddenCardViewModel
        tv_tabbar_title.text = "숨김 카드"
        backActivity()
        initRecycler()
        getHiddenCards()
        saveVisibility()
    }

    private fun backActivity() {
        iv_back.setOnClickListener {
            val intent = Intent(this, ManageCardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun initRecycler() {
        binding.rvHiddin.apply {
            layoutManager = GridLayoutManager(this@HiddenCardActivity, 2)
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_hidden_item,
                bindingId = BR.cardData
            ) {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): BaseViewHolder<RecyclerCardItemBinding> {
                    return super.onCreateViewHolder(parent, viewType).apply {
                        itemView.iv_visibility.setOnClickListener {
                            hiddenCardViewModel.changeUpdateList(parent, items[position], position)
                        }
                    }
                }
            }
        }
    }

    private fun saveVisibility() {
        hiddenCardViewModel.apply {
            isSaveClickable.observe(this@HiddenCardActivity, Observer {
                iv_hidden_save.isSelected = it
            })
            iv_hidden_save.setOnClickListener {
                changeVisibility(token!!)
                val intent = Intent(this@HiddenCardActivity, ManageCardActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun getHiddenCards() {
        hiddenCardViewModel.hiddenCards(token!!)
    }
}
