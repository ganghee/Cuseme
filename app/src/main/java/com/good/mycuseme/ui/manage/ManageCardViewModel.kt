package com.good.mycuseme.ui.manage

import androidx.lifecycle.MutableLiveData
import com.good.mycuseme.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.BehaviorSubject

class ManageCardViewModel : BaseViewModel() {

    val finishFlag = MutableLiveData<Boolean>()
    private lateinit var backPressedDisposable: Disposable
    val backButtonSubject: io.reactivex.subjects.Subject<Long> =
        BehaviorSubject.createDefault(0L)

    fun getFinishFlag() {
        backPressedDisposable = backButtonSubject
            .buffer(2, 1)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { t ->
                finishFlag.value = t[1] - t[0] <= 1500
            }
    }
}