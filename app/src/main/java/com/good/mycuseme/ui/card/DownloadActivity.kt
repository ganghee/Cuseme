package com.good.mycuseme.ui.card

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityDownloadBinding
import kotlinx.android.synthetic.main.activity_download.*

class DownloadActivity : BaseActivity<ActivityDownloadBinding>(R.layout.activity_download) {

    private val downloadViewModel by lazy { ViewModelProvider(this).get(DownloadViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.downloadViewModel = downloadViewModel

        initButton()
        downloadCard(token!!)
        startCreateActivity()
    }

    private fun startCreateActivity() {
        tv_download_create.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun downloadCard(token: String) {
        btn_download.setOnClickListener {
            Log.d("tag", token + "   " + downloadViewModel.serialNumber.value!!)
            downloadViewModel.downloadCard(token, downloadViewModel.serialNumber.value!!)
        }
    }

    private fun initButton() {
        downloadViewModel.apply {
            serialNumber.observe(this@DownloadActivity, Observer {
                clickable(it)
                btn_download.isSelected = isClickable.value!!
            })
            wrongDownload.observe(this@DownloadActivity, Observer {
                tv_download_wrong_text.isVisible = downloadSuccess.value!!
            })
        }
    }
}
