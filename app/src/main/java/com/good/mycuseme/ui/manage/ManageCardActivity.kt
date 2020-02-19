package com.good.mycuseme.ui.manage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.databinding.ActivityManageBinding
import com.good.mycuseme.ui.card.CreateActivity
import com.good.mycuseme.ui.card.HiddenCardActivity
import kotlinx.android.synthetic.main.activity_manage.*

class ManageCardActivity : BaseActivity<ActivityManageBinding>(R.layout.activity_manage) {

    private lateinit var nowFrag: Fragment
    private val manageCardViewModel by lazy {
        ViewModelProvider(this).get(ManageCardViewModel::class.java)
    }
    private val previewFragment by lazy { PreviewFragment() }
    private val searchFragment by lazy { SearchFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.manageViewModel = manageCardViewModel

        callFragment(1)
        changeBottomFragment()
        startCreateCardActivity()
        startHiddenCardActivity()
    }

    private fun startHiddenCardActivity() {
        ll_manage_hidden.setOnClickListener {
            val intent = Intent(this, HiddenCardActivity::class.java)
            startActivity(intent)
        }
    }

    private fun startCreateCardActivity() {
        ll_manage_new_card.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
        }
    }

    private fun changeBottomFragment() {
        ll_bottom_preview.setOnClickListener {
            callFragment(1)
        }

        ll_bottom_search.setOnClickListener {
            callFragment(2)
        }
    }

    private fun callFragment(frag: Int) {
        when (frag) {
            1 -> {
                iv_bottom_preview.isSelected = true
                iv_bottom_search.isSelected = false
                tv_preview.isSelected = true
                tv_search.isSelected = false
                nowFrag = previewFragment
            }

            2 -> {
                iv_bottom_preview.isSelected = false
                iv_bottom_search.isSelected = true
                tv_preview.isSelected = false
                tv_search.isSelected = true
                nowFrag = searchFragment
            }
        }
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_manage, nowFrag)
        transaction.commit()
    }
}