package com.good.mycuseme.ui.user

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.Settings
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.good.mycuseme.BR
import com.good.mycuseme.R
import com.good.mycuseme.base.BaseActivity
import com.good.mycuseme.base.BaseRecyclerViewAdapter
import com.good.mycuseme.base.BaseViewHolder
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.local.SharedPreferenceController
import com.good.mycuseme.data.local.UserData
import com.good.mycuseme.databinding.ActivityUserBinding
import com.good.mycuseme.databinding.RecyclerUserItemBinding
import com.good.mycuseme.ui.login.LoginActivity
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.recycler_user_item.view.*
import java.io.IOException
import java.util.*

@SuppressLint("HardwareIds")
class UserActivity : BaseActivity<ActivityUserBinding>(R.layout.activity_user) {

    private val userViewModel by lazy { ViewModelProvider(this).get(UserViewModel::class.java) }
    private val player: MediaPlayer by lazy { MediaPlayer() }
    lateinit var textToSpeech: TextToSpeech
    var recordFlag = 0
    private lateinit var androidId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.userViewModel = userViewModel

        setUUID()
        coordinateMotion() //TODO
        initViewModel(androidId)
        getUUID(androidId)
        setCardList(androidId)
        setTextToSpeech()
        startLoginActivity()
    }

    private fun setUUID() {
        androidId = Settings.Secure.getString(
            this.contentResolver,
            Settings.Secure.ANDROID_ID
        )
        val userData = UserData(androidId, null, null)
        Log.d("uuidandroid", userData.toString())
        SharedPreferenceController.setUserInfo(this, userData)
    }

    private fun startLoginActivity() {
        button_user_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("uuid", androidId)
            startActivity(intent)
        }
    }

    private fun setTextToSpeech() {
        textToSpeech = TextToSpeech(this,
            TextToSpeech.OnInitListener { status ->
                if (status == TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage(Locale.KOREA).let {
                        if (it == TextToSpeech.LANG_MISSING_DATA
                            || it == TextToSpeech.LANG_NOT_SUPPORTED
                        ) {
                            Toast.makeText(this, "지금 지원되지 않습니다.", Toast.LENGTH_LONG).show()
                        }
                    }
                }
            })
    }

    private fun coordinateMotion() {

        val listener = AppBarLayout.OnOffsetChangedListener { unused, verticalOffset ->
            val seekPosition = -verticalOffset / binding.appbarUser.totalScrollRange.toFloat()
            binding.motionlayoutUser.progress = seekPosition
        }
        binding.appbarUser.addOnOffsetChangedListener(listener)
    }

    private fun getUUID(androidId: String) {
        userViewModel.getUUID(androidId)
    }

    private fun setCardList(androidId: String) {
        userViewModel.getCard(androidId)
        binding.recyclerUserCardlist.apply {
            layoutManager = GridLayoutManager(this.context, 2)
            adapter = object : BaseRecyclerViewAdapter<CardData, RecyclerUserItemBinding>(
                layoutRes = R.layout.recycler_user_item,
                bindingId = BR.cardData
            ) {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): BaseViewHolder<RecyclerUserItemBinding> {
                    return super.onCreateViewHolder(parent, viewType).apply {
                        itemView.setOnClickListener {
                            singleItemClick(parent, it)
                            textview_user_cardcontent.text = items[adapterPosition].content
                            if (recordFlag == 0) startRecord(items[adapterPosition], it)
                        }
                    }
                }
            }
        }
    }

    private fun singleItemClick(parent: ViewGroup, itemView: View) {
        for (i in 0 until parent.childCount) {
            parent.getChildAt(i).view_masking.isSelected = false
        }
        if (!itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        } else if (itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        }
    }

    private fun startRecord(item: CardData, view: View) {
        if (item.record.isEmpty()) {
            (view.context as UserActivity).textToSpeech.speak(
                item.record,
                TextToSpeech.QUEUE_FLUSH,
                null,
                null
            )
            val speechListener = object : UtteranceProgressListener() {
                override fun onDone(utteranceId: String?) {
                    recordFlag = 0
                }

                override fun onError(utteranceId: String?) {
                    Log.d("recordError  ", utteranceId.toString())
                }

                override fun onStart(utteranceId: String?) {
                    recordFlag = -1
                }
            }
            textToSpeech.setOnUtteranceProgressListener(speechListener)
        } else {
            Log.d("player  ", player.toString())
            player.apply {
                try {
                    Log.d("item.record  ", item.record)
                    reset() //매우 중요 초기화 되지 않은 처음 생태로 되돌리며 이후 재 초기화 하여 다시 사용 할 수 있다. release는 객체를 완전히 파괴하여 더 이상 사용할 수 없는 상태이다.
                    setDataSource(item.record)
                    prepareAsync()   //비동기
                    setOnPreparedListener {
                        it.start()
                    }
                    recordFlag = -1
                } catch (e: IOException) {
                    Log.d("playerError", e.message.toString())
                }
            }
            player.setOnCompletionListener {
                Log.d("playerError2", "SDSD")
                recordFlag = 0
            }
        }
    }

    private fun initViewModel(androidId: String) {
        Toast.makeText(this.applicationContext, androidId, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        player.release()
        textToSpeech.stop()
    }

}
