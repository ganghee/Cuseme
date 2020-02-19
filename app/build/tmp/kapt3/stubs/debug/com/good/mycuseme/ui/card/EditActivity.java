package com.good.mycuseme.ui.card;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0012H\u0016J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity;", "Lcom/good/mycuseme/base/BaseActivity;", "Lcom/good/mycuseme/databinding/ActivityEditBinding;", "()V", "editViewModel", "Lcom/good/mycuseme/ui/card/EditViewModel;", "getEditViewModel", "()Lcom/good/mycuseme/ui/card/EditViewModel;", "editViewModel$delegate", "Lkotlin/Lazy;", "imageUri", "Landroid/net/Uri;", "token", "", "getToken", "()Ljava/lang/String;", "token$delegate", "bringImage", "", "checkPermission", "context", "Landroid/content/Context;", "activity", "initData", "initRecordButton", "isTextToSpeak", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pressAddCardButton", "saveRecord", "startRecord", "stopRecord", "Companion", "app_debug"})
public final class EditActivity extends com.good.mycuseme.base.BaseActivity<com.good.mycuseme.databinding.ActivityEditBinding> {
    private final kotlin.Lazy editViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy token$delegate = null;
    private android.net.Uri imageUri;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void initRecordButton() {
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
    
    private final void startRecord() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public EditActivity() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/good/mycuseme/ui/card/EditActivity$Companion;", "", "()V", "IMAGE_PICK_CODE", "", "PERMISSION_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}