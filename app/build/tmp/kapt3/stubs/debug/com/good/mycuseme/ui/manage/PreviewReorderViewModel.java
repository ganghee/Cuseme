package com.good.mycuseme.ui.manage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0007R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2 = {"Lcom/good/mycuseme/ui/manage/PreviewReorderViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "cardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/good/mycuseme/data/card/CardData;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "setCardList", "(Landroidx/lifecycle/MutableLiveData;)V", "cardRepository", "Lcom/good/mycuseme/data/card/CardRepository;", "getCardRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "cardRepository$delegate", "Lkotlin/Lazy;", "getSuccessCards", "", "getGetSuccessCards", "tempCardList", "", "getTempCardList", "()Ljava/util/List;", "setTempCardList", "(Ljava/util/List;)V", "getCard", "Lio/reactivex/disposables/Disposable;", "token", "", "reorderCard", "", "updateArrBody", "Lcom/good/mycuseme/data/card/UpdateArrBody;", "app_debug"})
public final class PreviewReorderViewModel extends com.good.mycuseme.base.BaseViewModel {
    private final kotlin.Lazy cardRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> cardList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.good.mycuseme.data.card.CardData> tempCardList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessCards = null;
    
    private final com.good.mycuseme.data.card.CardRepository getCardRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> getCardList() {
        return null;
    }
    
    public final void setCardList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.good.mycuseme.data.card.CardData> getTempCardList() {
        return null;
    }
    
    public final void setTempCardList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.good.mycuseme.data.card.CardData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetSuccessCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable getCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void reorderCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.UpdateArrBody updateArrBody) {
    }
    
    public PreviewReorderViewModel() {
        super();
    }
}