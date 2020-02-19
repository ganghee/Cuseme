package com.good.mycuseme.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/good/mycuseme/data/local/SharedPreferenceController;", "", "()V", "ACCOUNT", "", "clearUserToken", "", "ctx", "Landroid/content/Context;", "getUserPhoneNumber", "getUserToken", "getUserUUID", "setUserPhoneNumber", "phone", "setUserToken", "token", "setUserUUID", "uuid", "app_debug"})
public final class SharedPreferenceController {
    private static final java.lang.String ACCOUNT = "my account";
    public static final com.good.mycuseme.data.local.SharedPreferenceController INSTANCE = null;
    
    public final void setUserUUID(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    public final void setUserToken(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void setUserPhoneNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserUUID(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserToken(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserPhoneNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    public final void clearUserToken(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    private SharedPreferenceController() {
        super();
    }
}