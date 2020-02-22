package com.good.mycuseme.ui.home

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardData
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.card.CountBody
import com.good.mycuseme.data.start.StartRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.BehaviorSubject
import kotlinx.android.synthetic.main.recycler_card_item.view.*
import retrofit2.HttpException
import java.io.IOException
import java.util.*

class HomeViewModel : BaseViewModel() {
    private val startRepository by lazy { StartRepository() }
    private val cardRepository by lazy { CardRepository() }
    val cardList = MutableLiveData<List<CardData>>()
    private val sortList = listOf("visibility", "title", "count")
    private var index = 0
    private lateinit var textToSpeech: TextToSpeech
    val isEmpty = MutableLiveData<Boolean>().apply {
        value = false
    }
    val finishFlag = MutableLiveData<Boolean>()
    private val player: MediaPlayer by lazy { MediaPlayer() }
    private lateinit var backPressedDisposable: Disposable
    val backButtonSubject: io.reactivex.subjects.Subject<Long> =
        BehaviorSubject.createDefault(0L)

    var recordFlag = 0

    @SuppressLint("CheckResult")
    fun getCards(uuid: String) {
        startRepository.postStart(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                getCard(uuid)
                Log.d("UserViewModel getUUID", it.message)
            }, {
                Log.d("UserViewModel getUUID", it.message)
            })
    }

    @SuppressLint("CheckResult")
    fun getCard(uuid: String) {
        cardRepository.getVisibleCard(uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("UserViewModel getCard", it.message)
                if (!it.data.isNullOrEmpty()) {
                    sort(it.data)
                } else {
                    isEmpty.value = it.data.isNullOrEmpty()
                }
            }, {
                Log.d("UserViewModel getCard", it.message)
            })
    }

    fun sort(sortedList: List<CardData>?) {
        when (sortList[index]) {
            "visibility" -> {
                cardList.value = sortedList?.sortedBy { it.sequence }
                index = 1
            }
            "title" -> {
                cardList.value = sortedList?.sortedBy { it.title }
                index = 2
            }
            "count" -> {
                cardList.value = sortedList?.sortedByDescending { it.count }
                index = 0
            }
        }
    }

    @SuppressLint("CheckResult")
    fun addCount(cardIdx: Int, uuid: CountBody) {
        cardRepository.addCount(cardIdx, uuid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("addCount success", it.message)
            }, { error ->
                error as HttpException
                Log.d("addCount error", error.message!!)
            })
    }

    fun setTextToSpeech(context: Context) {
        textToSpeech = TextToSpeech(context,
            TextToSpeech.OnInitListener { status ->
                if (status == TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage(Locale.KOREA).let {
                        when (it) {
                            TextToSpeech.LANG_MISSING_DATA,
                            TextToSpeech.LANG_NOT_SUPPORTED
                            -> {
                                //Toast.makeText(this, "지금 지원되지 않습니다.", Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                }
            })
    }

    fun startRecord(item: CardData, cardIdx: Int, uuid: CountBody) {
        if (item.record == null) {
            textToSpeech.speak(
                item.content,
                TextToSpeech.QUEUE_FLUSH,
                null,
                TextToSpeech.ACTION_TTS_QUEUE_PROCESSING_COMPLETED
            )
            textToSpeech.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                override fun onDone(utteranceId: String?) {
                    recordFlag = 0
                }

                override fun onError(utteranceId: String?) {
                    Log.d("recordError  ", utteranceId.toString())
                }

                override fun onStart(utteranceId: String?) {
                    recordFlag = -1
                    addCount(cardIdx, uuid)
                }
            })
        } else {
            player.apply {
                try {
                    reset() //매우 중요 초기화 되지 않은 처음 생태로 되돌리며 이후 재 초기화 하여 다시 사용 할 수 있다. release는 객체를 완전히 파괴하여 더 이상 사용할 수 없는 상태이다.
                    setDataSource(item.record)
                    prepareAsync()   //비동기
                    setOnPreparedListener {
                        it.start()
                        addCount(cardIdx, uuid)
                    }
                    recordFlag = -1
                } catch (e: IOException) {
                }
            }
            player.setOnCompletionListener {
                recordFlag = 0
            }
        }
    }

    fun singleItemClick(parent: ViewGroup, itemView: View) {
        for (i in 0 until parent.childCount) {
            parent.getChildAt(i).view_masking.isSelected = false
        }
        if (!itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        } else if (itemView.view_masking.isSelected) {
            itemView.view_masking.isSelected = true
        }
    }

    override fun onCleared() {
        player.stop()
        textToSpeech.stop()
        textToSpeech.shutdown()
        super.onCleared()
    }

    fun getFinishFlag() {
        backPressedDisposable = backButtonSubject
            .buffer(2, 1)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { t ->
                finishFlag.value = t[1] - t[0] <= 1500
            }
    }
}
