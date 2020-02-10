package com.good.mycuseme.ui.card

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityDownloadBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_download.*
import kotlinx.android.synthetic.main.toolbar_card.*

class DownloadActivity : BaseActivity<ActivityDownloadBinding>(R.layout.activity_download) {

    private val downloadViewModel by lazy { ViewModelProvider(this).get(DownloadViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.downloadViewModel = downloadViewModel

        initButton()
        downloadCard(token!!)
        startCreateActivity()
        backButton()
    }

    private fun backButton() {
        iv_back.setOnClickListener { finish() }
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
                if (it) tv_download_wrong_text.visibility = View.VISIBLE
            })
            downloadSuccess.observe(this@DownloadActivity, Observer {
                if (it) finish()
            })
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, ManageCardActivity::class.java)
        startActivity(intent)
        finish()
    }
}
