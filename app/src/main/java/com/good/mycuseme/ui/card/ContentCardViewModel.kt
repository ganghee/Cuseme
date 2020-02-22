package com.good.mycuseme.ui.card

import android.content.Context
import android.media.MediaPlayer
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import com.good.mycuseme.data.card.CardRepository
import com.good.mycuseme.data.card.HideBody
import io.reactivex.android.schedulers.AndroidSchedulers
import retrofit2.HttpException
import java.io.IOException
import java.util.*

class ContentCardViewModel : BaseViewModel() {
    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()
    val image = MutableLiveData<String>()
    val serialNumber = MutableLiveData<String>()
    private var recordFileName: String? = null
    var recordFlag = 0
    private val player: MediaPlayer by lazy { MediaPlayer() }
    val hideSuccess = MutableLiveData<Boolean>().apply {
        value = false
    }
    val deleteSuccess = MutableLiveData<Boolean>().apply {
        value = false
    }
    val visibility = MutableLiveData<Boolean>()
    private lateinit var textToSpeech: TextToSpeech
    val recordTotalTime = MutableLiveData<Int>()

    private val repository by lazy { CardRepository() }

    fun getCard(token: String, cardIdx: Int) =
        repository.getCard(token, cardIdx)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                title.value = it.cardData?.title
                content.value = it.cardData?.content
                recordFileName = it.cardData?.record
                serialNumber.value = "일련번호 | " + it.cardData?.serialNum
                image.value = it.cardData?.image
                visibility.value = it.cardData?.visible
            }, { error ->
                error as HttpException
                error.message
            })

    fun setTextToSpeech(context: Context) {
        textToSpeech = TextToSpeech(context,
            TextToSpeech.OnInitListener { status ->
                if (status == TextToSpeech.SUCCESS) {
                    textToSpeech.setLanguage(Locale.KOREA).let {
                        if (it == TextToSpeech.LANG_MISSING_DATA
                            || it == TextToSpeech.LANG_NOT_SUPPORTED
                        ) {
                            Toast.makeText(context, "지금 지원되지 않습니다.", Toast.LENGTH_LONG).show()
                        }
                    }
                }
            })
    }

    fun startPlay() {
        if (recordFlag == 0) {
            if (recordFileName == null) {
                textToSpeech.speak(
                    content.value,
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
                player.apply {
                    try {
                        reset() //매우 중요 초기화 되지 않은 처음 생태로 되돌리며 이후 재 초기화 하여 다시 사용 할 수 있다. release는 객체를 완전히 파괴하여 더 이상 사용할 수 없는 상태이다.
                        setDataSource(recordFileName)
                        prepareAsync()   //비동기
                        setOnPreparedListener {
                            recordTotalTime.value = duration
                            it.start()
                        }
                        recordFlag = -1
                    } catch (e: IOException) {
                        Log.d("playerError", e.message.toString())
                    }
                }
                player.setOnCompletionListener {
                    recordFlag = 0
                }
            }
        }
    }

    fun hideCard(token: String, cardIdx: Int, visibility: HideBody) =
        repository.hideCard(token, cardIdx, visibility)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("contentviewmodel hide", it.message)
                hideSuccess.value = true
            }, { error ->
                error as HttpException
                error.message
            })

    fun deleteCard(token: String, cardIdx: Int) =
        repository.deleteCard(token, cardIdx)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("contentviewmodel delete", it.message)
                deleteSuccess.value = true
            }, { error ->
                error as HttpException
                error.message
            })
}
