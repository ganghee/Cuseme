package com.good.mycuseme.ui.card

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.data.card.HideBody
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityContentCardBinding
import com.good.mycuseme.ui.manage.ManageCardActivity
import kotlinx.android.synthetic.main.activity_content_card.*

class ContentCardActivity :
    BaseActivity<ActivityContentCardBinding>(R.layout.activity_content_card) {

    private val contentCardViewModel by lazy { ViewModelProvider(this).get(ContentCardViewModel::class.java) }
    val token by lazy { SharedPreferenceController.getUserToken(this)!! }
    val cardIdx by lazy { intent.getIntExtra("cardIdx", -1) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModelInit()
        getCard()
        cardModifySuccess()
        buttonClick()
        startRecord()
    }

    private fun startRecord() {
        iv_content_record_start.setOnClickListener {
            contentCardViewModel.startPlay()
        }
        contentCardViewModel.recordTotalTime.observe(this, Observer {
            Log.d("duration Time", contentCardViewModel.recordTotalTime.value.toString())
        })
    }

    private fun viewModelInit() {
        binding.contentViewModel = contentCardViewModel
        contentCardViewModel.apply {
            setTextToSpeech(applicationContext)
            startPlay()
            visibility.observe(this@ContentCardActivity, Observer {
                iv_content_hide.isSelected = it
            })
        }
    }

    fun getCard() {
        contentCardViewModel.getCard(token, cardIdx)
    }

    private fun cardModifySuccess() {
        contentCardViewModel.apply {
            hideSuccess.observe(this@ContentCardActivity, Observer {
                if (it) {
                    Toast.makeText(
                        this@ContentCardActivity,
                        "카드가 숨겨졌습니다.",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this@ContentCardActivity, ManageCardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
            deleteSuccess.observe(this@ContentCardActivity, Observer {
                if (it) {
                    Toast.makeText(
                        this@ContentCardActivity,
                        "카드가 삭제되었습니다.",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this@ContentCardActivity, ManageCardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            })
        }
    }

    private fun buttonClick() {
        iv_back.setOnClickListener {
            finish()
        }
        iv_content_delete.setOnClickListener {
            AlertDialog.Builder(this).setMessage("카드를 삭제하시겠습니까?")
                .setPositiveButton("삭제") { _, _ ->
                    contentCardViewModel.deleteCard(token, cardIdx)
                }
                .setNegativeButton("취소") { _, _ -> }
                .show()
        }
        iv_content_update.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            intent.putExtra("cardIdx", cardIdx)
            startActivity(intent)
            finish()
        }
        iv_content_hide.setOnClickListener {
            if (it.isSelected)
                AlertDialog.Builder(this).setMessage("카드를 숨기시겠습니까?")
                    .setPositiveButton("숨김") { _, _ ->
                        contentCardViewModel.hideCard(token, cardIdx, HideBody(false))
                    }
                    .setNegativeButton("취소") { _, _ -> }
                    .show()
            else
                AlertDialog.Builder(this).setMessage("카드를 보이게 하시겠습니까?")
                    .setPositiveButton("보이기") { _, _ ->
                        contentCardViewModel.hideCard(token, cardIdx, HideBody(true))
                    }
                    .setNegativeButton("취소") { _, _ -> }
                    .show()
        }
    }
}
