package com.good.mycuseme.data.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ$\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/good/mycuseme/data/user/UserRepository;", "", "()V", "changePassword", "Lio/reactivex/Single;", "Lcom/good/mycuseme/data/user/UserResponse;", "kotlin.jvm.PlatformType", "token", "", "password", "newPassword", "changePhoneNumber", "phoneNumber", "postLogin", "uuid", "app_debug"})
public final class UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.good.mycuseme.data.user.UserResponse> postLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
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
    
    public UserRepository() {
        super();
    }
}