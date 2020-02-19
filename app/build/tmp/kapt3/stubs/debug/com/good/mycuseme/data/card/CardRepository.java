package com.good.mycuseme.data.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\b\u001a\u00020\fJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fJF\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ$\u0010 \u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"\u00a8\u0006#"}, d2 = {"Lcom/good/mycuseme/data/card/CardRepository;", "", "()V", "addCount", "Lio/reactivex/Single;", "Lcom/good/mycuseme/data/card/CardResponse;", "cardIdx", "", "uuid", "Lcom/good/mycuseme/data/card/CountBody;", "deleteCard", "token", "", "getAllCard", "Lcom/good/mycuseme/data/card/CardListResponse;", "kotlin.jvm.PlatformType", "getCard", "getVisibleCard", "hideCard", "isVisible", "Lcom/good/mycuseme/data/card/HideBody;", "postCreateCard", "image", "Lokhttp3/MultipartBody$Part;", "record", "title", "Lokhttp3/RequestBody;", "content", "visible", "postDownloadCard", "serialNum", "putUpdateCard", "reorder", "updateArrList", "Lcom/good/mycuseme/data/card/UpdateArrBody;", "app_debug"})
public final class CardRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardListResponse> getVisibleCard(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> postDownloadCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNum) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> postCreateCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part record, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody content, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody visible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> putUpdateCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int cardIdx, @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part record, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody title, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody content, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody visible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> hideCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int cardIdx, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.HideBody isVisible) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> getCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int cardIdx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> deleteCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int cardIdx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardListResponse> getAllCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> addCount(int cardIdx, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.CountBody uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> reorder(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.UpdateArrBody updateArrList) {
        return null;
    }
    
    public CardRepository() {
        super();
    }
}