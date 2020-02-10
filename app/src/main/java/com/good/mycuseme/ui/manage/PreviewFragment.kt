package com.good.mycuseme.ui.manage

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.ContextThemeWrapper
import com.good.mycuseme.R
import com.good.mycuseme.adapter.CategoryViewPagerAdapter
import com.good.mycuseme.base.BaseFragment
import com.good.mycuseme.databinding.FragmentPreviewBinding
import com.good.mycuseme.ui.home.HomeActivity
import com.good.mycuseme.ui.setting.SettingActivity
import kotlinx.android.synthetic.main.fragment_preview.*
import kotlinx.android.synthetic.main.toolbar_manager_preview.*

class PreviewFragment : BaseFragment<FragmentPreviewBinding>(R.layout.fragment_preview) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureMainTab()
        topBarClick()
        changeViewPager()
    }

    private fun changeViewPager() {
        iv_reload.setOnClickListener {
            if (vp_preview.currentItem == 2) vp_preview.currentItem = 0
            else vp_preview.currentItem = vp_preview.currentItem + 1
        }
    }

    private fun topBarClick() {
        iv_home.setOnClickListener {
            AlertDialog.Builder(ContextThemeWrapper(context, R.style.Theme_AppCompat_Light_Dialog))
                .setMessage("홈으로 이동하시겠습니까?")
                .setPositiveButton("이동") { _, _ ->
                    val intent = Intent(context, HomeActivity::class.java)
                    startActivity(intent)
                    activity?.finish()
                }
                .setNegativeButton("취소") { _, _ -> }
                .show()
        }
        btn_setting.setOnClickListener {
            val intent = Intent(context, SettingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configureMainTab() {
        vp_preview.adapter = CategoryViewPagerAdapter(childFragmentManager)
        tl_preview.setupWithViewPager(vp_preview)
    }
}
