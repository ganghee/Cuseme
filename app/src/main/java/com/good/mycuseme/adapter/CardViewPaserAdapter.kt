package com.good.mycuseme.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.good.mycuseme.ui.manage.PreviewArrayFragment
import com.good.mycuseme.ui.manage.PreviewReorderFragment


class CategoryViewPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val cardTitleList =
        listOf("재배열", "이름 순", "조회 순")

    val cardList =
        listOf("visibility", "title", "count")

    override fun getItem(position: Int): Fragment {
        Log.d("position", position.toString())
        return if (position == 0) PreviewReorderFragment()
        else PreviewArrayFragment.newInstance(cardList[position])
    }

    override fun getCount(): Int = cardList.size

    override fun getPageTitle(position: Int): CharSequence? = cardTitleList[position]
}
