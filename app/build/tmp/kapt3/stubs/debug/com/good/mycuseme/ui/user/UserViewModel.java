package com.good.mycuseme.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0007J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0007J\u0016\u0010\"\u001a\u00020\u001f2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006$"}, d2 = {"Lcom/good/mycuseme/ui/user/UserViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "cardList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/good/mycuseme/data/card/CardData;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "cardRepository", "Lcom/good/mycuseme/data/card/CardRepository;", "getCardRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "cardRepository$delegate", "Lkotlin/Lazy;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "sortList", "", "getSortList", "()Ljava/util/List;", "startRepository", "Lcom/good/mycuseme/data/start/StartRepository;", "getStartRepository", "()Lcom/good/mycuseme/data/start/StartRepository;", "startRepository$delegate", "getCard", "", "uuid", "getUUID", "sort", "sortedList", "app_debug"})
public final class UserViewModel extends com.good.mycuseme.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy startRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cardRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> cardList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> sortList = null;
    private int index;
    
    @org.jetbrains.annotations.NotNull()
    public final com.good.mycuseme.data.start.StartRepository getStartRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.good.mycuseme.data.card.CardRepository getCardRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> getCardList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSortList() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getUUID(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getCard(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    public final void sort(@org.jetbrains.annotations.Nullable()
    java.util.List<com.good.mycuseme.data.card.CardData> sortedList) {
    }
    
    public UserViewModel() {
        super();
    }
}