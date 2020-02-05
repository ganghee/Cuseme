package com.good.mycuseme.ui.card

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityContentCardBinding
import kotlinx.android.synthetic.main.activity_content_card.*

class ContentCardActivity :
    BaseActivity<ActivityContentCardBinding>(R.layout.activity_content_card) {

    private val contentCardViewModel by lazy { ViewModelProvider(this).get(ContentCardViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.contentViewModel = contentCardViewModel

        getCard(token!!)
        contentCardViewModel.setTextToSpeech(this)
        contentCardViewModel.startPlay()
        buttonClick()
    }

    private fun buttonClick() {
        iv_back.setOnClickListener {
            finish()
        }
        iv_content_delete.setOnClickListener {
            //TODO: contentActivity delete
        }
        iv_content_update.setOnClickListener {
            //TODO: contentActivity update
        }
    }

    fun getCard(token: String) {
        val cardIdx = intent.getIntExtra("cardIdx", -1)

        contentCardViewModel.apply {
            getCard(token, cardIdx)
            isVisibility.observe(this@ContentCardActivity, Observer {
                iv_content_visibility.isSelected = it
            })
        }
    }

}
