package com.good.mycuseme.ui.manage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/good/mycuseme/ui/manage/SearchFragment;", "Lcom/good/mycuseme/base/BaseFragment;", "Lcom/good/mycuseme/databinding/FragmentSearchBinding;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "recycleAdapter", "Lcom/good/mycuseme/base/BaseRecyclerViewAdapter;", "Lcom/good/mycuseme/data/card/CardData;", "Lcom/good/mycuseme/databinding/RecyclerCardItemBinding;", "getRecycleAdapter", "()Lcom/good/mycuseme/base/BaseRecyclerViewAdapter;", "setRecycleAdapter", "(Lcom/good/mycuseme/base/BaseRecyclerViewAdapter;)V", "searchViewModel", "Lcom/good/mycuseme/ui/manage/SearchViewModel;", "getSearchViewModel", "()Lcom/good/mycuseme/ui/manage/SearchViewModel;", "searchViewModel$delegate", "Lkotlin/Lazy;", "token", "", "getToken", "()Ljava/lang/String;", "token$delegate", "download", "", "getCards", "initData", "initRecyclerView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onStart", "searchCard", "searchFilter", "app_debug"})
public final class SearchFragment extends com.good.mycuseme.base.BaseFragment<com.good.mycuseme.databinding.FragmentSearchBinding> implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private final kotlin.Lazy searchViewModel$delegate = null;
    private final kotlin.Lazy token$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.good.mycuseme.base.BaseRecyclerViewAdapter<com.good.mycuseme.data.card.CardData, com.good.mycuseme.databinding.RecyclerCardItemBinding> recycleAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.good.mycuseme.ui.manage.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.good.mycuseme.base.BaseRecyclerViewAdapter<com.good.mycuseme.data.card.CardData, com.good.mycuseme.databinding.RecyclerCardItemBinding> getRecycleAdapter() {
        return null;
    }
    
    public final void setRecycleAdapter(@org.jetbrains.annotations.NotNull()
    com.good.mycuseme.base.BaseRecyclerViewAdapter<com.good.mycuseme.data.card.CardData, com.good.mycuseme.databinding.RecyclerCardItemBinding> p0) {
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
    
    private final void searchCard() {
    }
    
    private final void searchFilter() {
    }
    
    private final void getCards() {
    }
    
    private final void download() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public SearchFragment() {
        super(0);
    }
}