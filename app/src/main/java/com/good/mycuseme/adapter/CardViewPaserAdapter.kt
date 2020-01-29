package com.good.mycuseme.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.good.mycuseme.ui.manage.SearchListFragment


class CategoryViewPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val cardTitleList =
        listOf("보이는 순", "이름 순", "조회 순")

    private val cardList =
        listOf("visibility", "title", "count")

    override fun getItem(position: Int): Fragment =
        SearchListFragment.newInstance(cardList[position])

    override fun getCount(): Int = cardList.size

    override fun getPageTitle(position: Int): CharSequence? = cardTitleList[position]
}
