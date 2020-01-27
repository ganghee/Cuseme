package com.good.mycuseme.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/good/mycuseme/data/remote/NetworkService;", "", "getVisibleCard", "Lio/reactivex/Single;", "Lcom/good/mycuseme/data/card/CardResponse;", "uuid", "", "postStart", "Lcom/good/mycuseme/data/start/StartResponse;", "app_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/start")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Single<com.good.mycuseme.data.start.StartResponse> postStart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uuid")
    java.lang.String uuid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/cards/visible")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Single<com.good.mycuseme.data.card.CardResponse> getVisibleCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uuid")
    java.lang.String uuid);
}