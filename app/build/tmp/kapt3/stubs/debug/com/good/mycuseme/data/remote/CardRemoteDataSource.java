package com.good.mycuseme.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/good/mycuseme/data/remote/CardRemoteDataSource;", "", "()V", "retrofit", "Lcom/good/mycuseme/data/remote/NetworkService;", "getVisibleCard", "Lio/reactivex/Single;", "Lcom/good/mycuseme/data/card/CardResponse;", "uuid", "", "postLogin", "Lcom/good/mycuseme/data/login/LoginResponse;", "password", "postStart", "Lcom/good/mycuseme/data/start/StartResponse;", "app_debug"})
public final class CardRemoteDataSource {
    private static final com.good.mycuseme.data.remote.NetworkService retrofit = null;
    public static final com.good.mycuseme.data.remote.CardRemoteDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.start.StartResponse> postStart(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> getVisibleCard(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.login.LoginResponse> postLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    private CardRemoteDataSource() {
        super();
    }
}