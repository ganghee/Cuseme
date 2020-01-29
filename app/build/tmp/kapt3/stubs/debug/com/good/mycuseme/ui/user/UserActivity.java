package com.good.mycuseme.ui.user;

import java.lang.System;

@android.annotation.SuppressLint(value = {"HardwareIds"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006."}, d2 = {"Lcom/good/mycuseme/ui/user/UserActivity;", "Lcom/good/mycuseme/base/BaseActivity;", "Lcom/good/mycuseme/databinding/ActivityUserBinding;", "()V", "androidId", "", "player", "Landroid/media/MediaPlayer;", "getPlayer", "()Landroid/media/MediaPlayer;", "player$delegate", "Lkotlin/Lazy;", "recordFlag", "", "getRecordFlag", "()I", "setRecordFlag", "(I)V", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "userViewModel", "Lcom/good/mycuseme/ui/user/UserViewModel;", "getUserViewModel", "()Lcom/good/mycuseme/ui/user/UserViewModel;", "userViewModel$delegate", "coordinateMotion", "", "getUUID", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "setCardList", "setTextToSpeech", "setUUID", "singleItemClick", "parent", "Landroid/view/ViewGroup;", "itemView", "Landroid/view/View;", "startLoginActivity", "startRecord", "item", "Lcom/good/mycuseme/data/card/CardData;", "view", "app_debug"})
public final class UserActivity extends com.good.mycuseme.base.BaseActivity<com.good.mycuseme.databinding.ActivityUserBinding> {
    private final kotlin.Lazy userViewModel$delegate = null;
    private final kotlin.Lazy player$delegate = null;
    private android.speech.tts.TextToSpeech textToSpeech;
    private int recordFlag;
    private java.lang.String androidId;
    private java.util.HashMap _$_findViewCache;
    
    private final com.good.mycuseme.ui.user.UserViewModel getUserViewModel() {
        return null;
    }
    
    private final android.media.MediaPlayer getPlayer() {
        return null;
    }
    
    public final int getRecordFlag() {
        return 0;
    }
    
    public final void setRecordFlag(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUUID() {
    }
    
    private final void startLoginActivity() {
    }
    
    private final void setTextToSpeech() {
    }
    
    private final void coordinateMotion() {
    }
    
    private final void getUUID(java.lang.String androidId) {
    }
    
    private final void setCardList(java.lang.String androidId) {
    }
    
    private final void singleItemClick(android.view.ViewGroup parent, android.view.View itemView) {
    }
    
    private final void startRecord(com.good.mycuseme.data.card.CardData item, android.view.View view) {
    }
    
    private final void initViewModel(java.lang.String androidId) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public UserActivity() {
        super(0);
    }
}