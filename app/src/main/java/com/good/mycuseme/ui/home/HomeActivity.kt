package com.good.mycuseme.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CountBody
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.databinding.ActivityHomeBinding
import com.good.mycuseme.databinding.RecyclerCardItemBinding
import com.good.mycuseme.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.recycler_card_item.view.*
import kotlin.system.exitProcess

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    private val homeViewModel by lazy { ViewModelProvider(this).get(HomeViewModel::class.java) }

    private lateinit var androidId: String
    private lateinit var token: String
    private var gridLayoutManager = GridLayoutManager(this@HomeActivity, 2)
    var mParent: ViewGroup? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.homeViewModel = homeViewModel

        setUUID()//TODO : 사용자를 DB에서 지우고 시작하는 경우
        homeViewModel.setTextToSpeech(this)
        initRecyclerView()
        changeSpanCountEvent()
        startLoginActivity()
        reorderClick()
        finishEvent()
    }

    override fun onStart() {
        super.onStart()
        getCards(androidId)
        emptyCheck()
    }

    private fun finishEvent() {
        homeViewModel.apply {
            getFinishFlag()
            finishFlag.observe(this@HomeActivity, Observer {
                if (it) {
                    finishAffinity()
                    System.runFinalization()
                    exitProcess(0)
                } else Toast.makeText(
                    this@HomeActivity,
                    "뒤로가기 버튼을 한 번 더 누르면 종료",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }

    private fun changeSpanCountEvent() {
        val mScaleGestureDetector = ScaleGestureDetector(
            this,
            object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
                override fun onScaleEnd(detector: ScaleGestureDetector?) {
                    if (detector?.scaleFactor!! > 1.0f && gridLayoutManager.spanCount == 2) {
                        gridLayoutManager.spanCount = 1
                    } else if (detector.scaleFactor > 1.0f && gridLayoutManager.spanCount == 3) {
                        gridLayoutManager.spanCount = 2
                    } else if (detector.scaleFactor < 1.0f && gridLayoutManager.spanCount == 2) {
                        gridLayoutManager.spanCount = 3
                    } else if (detector.scaleFactor < 1.0f && gridLayoutManager.spanCount == 1) {
                        gridLayoutManager.spanCount = 2
                    }
                    binding.recyclerHomeCardlist.adapter?.notifyItemRangeChanged(
                        binding.recyclerHomeCardlist.adapter?.itemCount ?: 0,
                        binding.recyclerHomeCardlist.adapter?.itemCount ?: 0
                    )
                }
            })
        recycler_home_cardlist.setOnTouchListener { _, event ->
            mScaleGestureDetector.onTouchEvent(event)
            false
        }
    }

    @SuppressLint("HardwareIds")
    private fun setUUID() {
        androidId = Settings.Secure.getString(
            this.contentResolver,
            Settings.Secure.ANDROID_ID
        )
        SharedPreferenceController.setUserUUID(this, androidId)
    }

    private fun startLoginActivity() {
        button_home_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("uuid", androidId)
            startActivity(intent)
            finish()
        }
    }

    private fun getCards(androidId: String) {
        homeViewModel.getCards(androidId)
    }

    private fun initRecyclerView() {
        binding.recyclerHomeCardlist.apply {
            layoutManager = gridLayoutManager
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerCardItemBinding>(
                layoutRes = R.layout.recycler_card_item,
                bindingId = BR.cardData
            ) {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): BaseViewHolder<RecyclerCardItemBinding> {
                    return super.onCreateViewHolder(parent, viewType).apply {
                        mParent = parent
                        itemView.setOnClickListener {
                            homeViewModel.singleItemClick(parent, it)
                            textview_home_cardcontent.text = items[adapterPosition].content
                            tv_home_title.text = items[adapterPosition].title
                            token = SharedPreferenceController.getUserToken(context)!!
                            if (homeViewModel.recordFlag == 0) homeViewModel.startRecord(
                                items[adapterPosition],
                                items[adapterPosition].cardIdx,
                                CountBody(androidId)
                            )
                        }
                    }
                }
            }
        }
    }

    private fun reorderClick() {
        button_home_refresh.setOnClickListener {
            for (i in 0 until (mParent!!.childCount)) {
                mParent?.getChildAt(i)?.view_masking?.isSelected = false
            }
            homeViewModel.sort(homeViewModel.cardList.value)
        }
    }

    private fun emptyCheck() {
        homeViewModel.isEmpty.observe(this, Observer {
            if (it) {
                binding.lavHomeLock.visibility = View.VISIBLE
                binding.tvHomeEmpty.visibility = View.VISIBLE
                binding.ivHomeEmpty.visibility = View.VISIBLE
            } else {
                binding.lavHomeLock.visibility = View.GONE
                binding.tvHomeEmpty.visibility = View.GONE
                binding.ivHomeEmpty.visibility = View.GONE
            }
        })
    }

    override fun onBackPressed() {
        homeViewModel.backButtonSubject.onNext(System.currentTimeMillis())
    }
}
