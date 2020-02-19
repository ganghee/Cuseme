package com.good.mycuseme.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u0004\u001a\u001c\u0010\u000e\u001a\u00020\u0006*\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007\u001a\n\u0010\u0013\u001a\u00020\u0006*\u00020\f\u00a8\u0006\u0014"}, d2 = {"createLoggerListener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "name", "", "setImageUrl", "", "view", "Landroid/widget/ImageView;", "profile", "isPermissionNotGranted", "", "Landroid/content/Context;", "permission", "replaceAll", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "", "startSettingActivity", "app_debug"})
public final class AdapterUilKt {
    
    @androidx.databinding.BindingAdapter(value = {"setImage"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String profile) {
    }
    
    private static final com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> createLoggerListener(java.lang.String name) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"replaceAll"})
    public static final void replaceAll(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$replaceAll, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> list) {
    }
    
    public static final void startSettingActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$startSettingActivity) {
    }
    
    public static final boolean isPermissionNotGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isPermissionNotGranted, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
}