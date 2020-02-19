package com.good.mycuseme.ui.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/good/mycuseme/ui/card/DownloadViewModel;", "Lcom/good/mycuseme/base/BaseViewModel;", "()V", "cardRepository", "Lcom/good/mycuseme/data/card/CardRepository;", "getCardRepository", "()Lcom/good/mycuseme/data/card/CardRepository;", "cardRepository$delegate", "Lkotlin/Lazy;", "downloadSuccess", "Landroidx/lifecycle/MutableLiveData;", "", "getDownloadSuccess", "()Landroidx/lifecycle/MutableLiveData;", "isClickable", "serialNumber", "", "getSerialNumber", "wrongDownload", "getWrongDownload", "clickable", "", "downloadCard", "token", "app_debug"})
public final class DownloadViewModel extends com.good.mycuseme.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> serialNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isClickable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> downloadSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> wrongDownload = null;
    private final kotlin.Lazy cardRepository$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSerialNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isClickable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDownloadSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWrongDownload() {
        return null;
    }
    
    private final com.good.mycuseme.data.card.CardRepository getCardRepository() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void downloadCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber) {
    }
    
    public final void clickable(@org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber) {
    }
    
    public DownloadViewModel() {
        super();
    }
}