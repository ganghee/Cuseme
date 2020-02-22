package com.good.mycuseme.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0007J\u0010\u00104\u001a\u0002002\u0006\u00102\u001a\u00020\'H\u0007J\u0010\u00105\u001a\u0002002\u0006\u00102\u001a\u00020\'H\u0007J\u0006\u0010\u0018\u001a\u000200J\b\u00106\u001a\u000200H\u0014J\u000e\u00107\u001a\u0002002\u0006\u00108\u001a\u000209J\u0016\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u0002002\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u001e\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\r2\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/good/mycuseme/ui/home/HomeViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "backButtonSubject", "Lio/reactivex/subjects/Subject;", "", "getBackButtonSubject", "()Lio/reactivex/subjects/Subject;", "backPressedDisposable", "Lio/reactivex/disposables/Disposable;", "cardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/good/mycuseme/data/card/CardData;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "cardRepository", "Lcom/good/mycuseme/data/card/CardRepository;", "getCardRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "cardRepository$delegate", "Lkotlin/Lazy;", "finishFlag", "", "getFinishFlag", "index", "", "isEmpty", "player", "Landroid/media/MediaPlayer;", "getPlayer", "()Landroid/media/MediaPlayer;", "player$delegate", "recordFlag", "getRecordFlag", "()I", "setRecordFlag", "(I)V", "sortList", "", "startRepository", "Lcom/good/mycuseme/data/start/StartRepository;", "getStartRepository", "()Lcom/good/mycuseme/data/start/StartRepository;", "startRepository$delegate", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "addCount", "", "cardIdx", "uuid", "Lcom/good/mycuseme/data/card/CountBody;", "getCard", "getCards", "onCleared", "setTextToSpeech", "context", "Landroid/content/Context;", "singleItemClick", "parent", "Landroid/view/ViewGroup;", "itemView", "Landroid/view/View;", "sort", "sortedList", "startRecord", "item", "app_debug"})
public final class HomeViewModel extends com.good.mycuseme.base.BaseViewModel {
    private final kotlin.Lazy startRepository$delegate = null;
    private final kotlin.Lazy cardRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> cardList = null;
    private final java.util.List<java.lang.String> sortList = null;
    private int index;
    private android.speech.tts.TextToSpeech textToSpeech;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> finishFlag = null;
    private final kotlin.Lazy player$delegate = null;
    private io.reactivex.disposables.Disposable backPressedDisposable;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.Subject<java.lang.Long> backButtonSubject = null;
    private int recordFlag;
    
    private final com.good.mycuseme.data.start.StartRepository getStartRepository() {
        return null;
    }
    
    private final com.good.mycuseme.data.card.CardRepository getCardRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> getCardList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFinishFlag() {
        return null;
    }
    
    private final android.media.MediaPlayer getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.Subject<java.lang.Long> getBackButtonSubject() {
        return null;
    }
    
    public final int getRecordFlag() {
        return 0;
    }
    
    public final void setRecordFlag(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getCards(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getCard(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    public final void sort(@org.jetbrains.annotations.Nullable()
    java.util.List<com.good.mycuseme.data.card.CardData> sortedList) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void addCount(int cardIdx, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.CountBody uuid) {
    }
    
    public final void setTextToSpeech(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startRecord(@org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.CardData item, int cardIdx, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.CountBody uuid) {
    }
    
    public final void singleItemClick(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void getFinishFlag() {
    }
    
    public HomeViewModel() {
        super();
    }
}