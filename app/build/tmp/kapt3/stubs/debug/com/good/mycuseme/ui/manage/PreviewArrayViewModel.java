package com.good.mycuseme.ui.manage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\"\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/good/mycuseme/ui/manage/PreviewArrayViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "cardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/good/mycuseme/data/card/CardData;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "cardRepository", "Lcom/good/mycuseme/data/card/CardRepository;", "getCardRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "cardRepository$delegate", "Lkotlin/Lazy;", "getSuccessCards", "", "getGetSuccessCards", "getAllCard", "Lio/reactivex/disposables/Disposable;", "token", "", "sorting", "sort", "", "sortedList", "app_debug"})
public final class PreviewArrayViewModel extends com.good.mycuseme.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> cardList = null;
    private final kotlin.Lazy cardRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessCards = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> getCardList() {
        return null;
    }
    
    private final com.good.mycuseme.data.card.CardRepository getCardRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetSuccessCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable getAllCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    java.lang.String sorting) {
        return null;
    }
    
    private final void sort(java.util.List<com.good.mycuseme.data.card.CardData> sortedList, java.lang.String sorting) {
    }
    
    public PreviewArrayViewModel() {
        super();
    }
}