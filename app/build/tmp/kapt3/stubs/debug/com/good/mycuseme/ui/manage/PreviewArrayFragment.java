package com.good.mycuseme.ui.manage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/good/mycuseme/ui/manage/PreviewArrayFragment;", "Lcom/good/mycuseme/base/BaseFragment;", "Lcom/good/mycuseme/databinding/FragmentArrayPreviewBinding;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "categoryName", "", "getCategoryName", "()Ljava/lang/String;", "categoryName$delegate", "Lkotlin/Lazy;", "previewArrayViewModel", "Lcom/good/mycuseme/ui/manage/PreviewArrayViewModel;", "getPreviewArrayViewModel", "()Lcom/good/mycuseme/ui/manage/PreviewArrayViewModel;", "previewArrayViewModel$delegate", "token", "getToken", "token$delegate", "emptyCheck", "", "getArrayCards", "initData", "initRecyclerView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onStart", "Companion", "app_debug"})
public final class PreviewArrayFragment extends com.good.mycuseme.base.BaseFragment<com.good.mycuseme.databinding.FragmentArrayPreviewBinding> implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private final kotlin.Lazy previewArrayViewModel$delegate = null;
    private final kotlin.Lazy categoryName$delegate = null;
    private final kotlin.Lazy token$delegate = null;
    private static final java.lang.String SORT_NAME = "sort name";
    public static final com.good.mycuseme.ui.manage.PreviewArrayFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.good.mycuseme.ui.manage.PreviewArrayViewModel getPreviewArrayViewModel() {
        return null;
    }
    
    private final java.lang.String getCategoryName() {
        return null;
    }
    
    private final java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void initData() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void emptyCheck() {
    }
    
    private final void getArrayCards() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public PreviewArrayFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/good/mycuseme/ui/manage/PreviewArrayFragment$Companion;", "", "()V", "SORT_NAME", "", "newInstance", "Lcom/good/mycuseme/ui/manage/PreviewArrayFragment;", "sortName", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.good.mycuseme.ui.manage.PreviewArrayFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String sortName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}