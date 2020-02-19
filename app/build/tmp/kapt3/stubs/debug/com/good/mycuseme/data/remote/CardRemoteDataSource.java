package com.good.mycuseme.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ,\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J$\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00170\u00170\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\n\u001a\u00020\u0010J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cJ>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010J\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010\n\u001a\u00020\u0010JF\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"J$\u0010+\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/good/mycuseme/data/remote/CardRemoteDataSource;", "", "()V", "retrofit", "Lcom/good/mycuseme/data/remote/NetworkService;", "addCount", "Lio/reactivex/Single;", "Lcom/good/mycuseme/data/card/CardResponse;", "cardIdx", "", "uuid", "Lcom/good/mycuseme/data/card/CountBody;", "changePassword", "Lcom/good/mycuseme/data/user/UserResponse;", "kotlin.jvm.PlatformType", "token", "", "password", "newPassword", "changePhoneNumber", "phoneNumber", "deleteCard", "getAllCard", "Lcom/good/mycuseme/data/card/CardListResponse;", "getCard", "getVisibleCard", "hideCard", "isVisible", "Lcom/good/mycuseme/data/card/HideBody;", "postCreateCard", "image", "Lokhttp3/MultipartBody$Part;", "record", "title", "Lokhttp3/RequestBody;", "content", "visible", "postDownload", "serialNumber", "postLogin", "postStart", "Lcom/good/mycuseme/data/start/StartResponse;", "putUpdateCard", "reorder", "updateArrList", "Lcom/good/mycuseme/data/card/UpdateArrBody;", "app_debug"})
public final class CardRemoteDataSource {
    private static final com.good.mycuseme.data.remote.NetworkService retrofit = null;
    public static final com.good.mycuseme.data.remote.CardRemoteDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.start.StartResponse> postStart(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardListResponse> getVisibleCard(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.user.UserResponse> postLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> postDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber) {
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
    public final io.reactivex.Single<com.good.mycuseme.data.user.UserResponse> changePhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.user.UserResponse> changePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> hideCard(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int cardIdx, @org.jetbrains.annotations.NotNull()
    com.good.mycuseme.data.card.HideBody isVisible) {
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
    
    private CardRemoteDataSource() {
        super();
    }
}