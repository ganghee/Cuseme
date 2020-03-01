package com.good.mycuseme.ui.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003789B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0000H\u0002J\b\u0010&\u001a\u00020!H\u0002J\b\u0010\'\u001a\u00020!H\u0002J\"\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020!H\u0016J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0003J\b\u00105\u001a\u00020!H\u0002J\b\u00106\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u00060\u000fR\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006:"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity;", "Lcom/good/mycuseme/base/BaseActivity;", "Lcom/good/mycuseme/databinding/ActivityEditBinding;", "()V", "count", "", "editViewModel", "Lcom/good/mycuseme/ui/card/EditViewModel;", "getEditViewModel", "()Lcom/good/mycuseme/ui/card/EditViewModel;", "editViewModel$delegate", "Lkotlin/Lazy;", "imageUri", "Landroid/net/Uri;", "progressBarCounter", "Lcom/good/mycuseme/ui/card/EditActivity$ProgressBarCounter;", "getProgressBarCounter", "()Lcom/good/mycuseme/ui/card/EditActivity$ProgressBarCounter;", "progressBarCounter$delegate", "second", "", "getSecond", "()D", "setSecond", "(D)V", "secondCounter", "Lcom/good/mycuseme/ui/card/EditActivity$SecondCounter;", "token", "", "getToken", "()Ljava/lang/String;", "token$delegate", "bringImage", "", "checkPermission", "context", "Landroid/content/Context;", "activity", "initData", "isTextToSpeak", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pressAddCardButton", "pressStopRecordButton", "saveRecord", "setRecordFileName", "startRecord", "stopRecord", "Companion", "ProgressBarCounter", "SecondCounter", "app_debug"})
public final class EditActivity extends com.good.mycuseme.base.BaseActivity<com.good.mycuseme.databinding.ActivityEditBinding> {
    private final kotlin.Lazy editViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy token$delegate = null;
    private android.net.Uri imageUri;
    private double second;
    private final kotlin.Lazy progressBarCounter$delegate = null;
    private final com.good.mycuseme.ui.card.EditActivity.SecondCounter secondCounter = null;
    private int count;
    public static final int IMAGE_PICK_CODE = 1000;
    public static final int PERMISSION_CODE = 1001;
    public static final com.good.mycuseme.ui.card.EditActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.good.mycuseme.ui.card.EditViewModel getEditViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final double getSecond() {
        return 0.0;
    }
    
    public final void setSecond(double p0) {
    }
    
    private final com.good.mycuseme.ui.card.EditActivity.ProgressBarCounter getProgressBarCounter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void pressStopRecordButton() {
    }
    
    private final void bringImage() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void pressAddCardButton() {
    }
    
    private final void isTextToSpeak() {
    }
    
    private final void checkPermission(android.content.Context context, com.good.mycuseme.ui.card.EditActivity activity) {
    }
    
    private final void saveRecord() {
    }
    
    private final void stopRecord() {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void setRecordFileName() {
    }
    
    private final void startRecord() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public EditActivity() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity$ProgressBarCounter;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(Lcom/good/mycuseme/ui/card/EditActivity;JJ)V", "onFinish", "", "onTick", "millisUntilFinished", "app_debug"})
    public final class ProgressBarCounter extends android.os.CountDownTimer {
        
        @java.lang.Override()
        public void onFinish() {
        }
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        public ProgressBarCounter(long millisInFuture, long countDownInterval) {
            super(0L, 0L);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity$SecondCounter;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(Lcom/good/mycuseme/ui/card/EditActivity;JJ)V", "onFinish", "", "onTick", "millisUntilFinished", "app_debug"})
    public final class SecondCounter extends android.os.CountDownTimer {
        
        @java.lang.Override()
        public void onFinish() {
        }
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        public SecondCounter(long millisInFuture, long countDownInterval) {
            super(0L, 0L);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity$Companion;", "", "()V", "IMAGE_PICK_CODE", "", "PERMISSION_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}