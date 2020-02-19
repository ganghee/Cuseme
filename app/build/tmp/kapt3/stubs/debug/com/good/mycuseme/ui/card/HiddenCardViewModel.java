package com.good.mycuseme.ui.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/good/mycuseme/ui/card/HiddenCardViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "cardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/good/mycuseme/data/card/CardData;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "setCardList", "(Landroidx/lifecycle/MutableLiveData;)V", "getSuccessCards", "", "getGetSuccessCards", "isSaveClickable", "repository", "Lcom/good/mycuseme/data/card/CardRepository;", "getRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "repository$delegate", "Lkotlin/Lazy;", "updateCardList", "", "Lcom/good/mycuseme/data/card/UpdateArr;", "changeUpdateList", "", "parent", "Landroid/view/ViewGroup;", "cardData", "position", "", "changeVisibility", "token", "", "hiddenCards", "Lio/reactivex/disposables/Disposable;", "app_debug"})
public final class HiddenCardViewModel extends com.good.mycuseme.base.BaseViewModel {
    private final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> cardList;
    private final java.util.List<com.good.mycuseme.data.card.UpdateArr> updateCardList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSaveClickable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccessCards = null;
    
    private final com.good.mycuseme.data.card.CardRepository getRepository() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSaveClickable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetSuccessCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable hiddenCards(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void changeVisibility(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void changeUpdateList(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.CardData cardData, int position) {
    }
    
    public HiddenCardViewModel() {
        super();
    }
}