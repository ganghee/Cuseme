package com.good.mycuseme.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005B\u001b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001e\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0016\u0010\u001e\u001a\u00020\u00132\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 R\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/good/mycuseme/base/BaseRecyclerViewAdapter;", "ITEM", "", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/good/mycuseme/base/BaseViewHolder;", "layoutRes", "", "bindingId", "(ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "items", "", "getItems", "()Ljava/util/List;", "searchItems", "temp", "filter", "", "charText", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceAll", "item", "", "app_debug"})
public abstract class BaseRecyclerViewAdapter<ITEM extends java.lang.Object, B extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.good.mycuseme.base.BaseViewHolder<B>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ITEM> items = null;
    private final java.util.List<ITEM> temp = null;
    private final java.util.List<ITEM> searchItems = null;
    private final int layoutRes = 0;
    private final java.lang.Integer bindingId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ITEM> getItems() {
        return null;
    }
    
    public final void replaceAll(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends ITEM> item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.good.mycuseme.base.BaseViewHolder<B> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.good.mycuseme.base.BaseViewHolder<B> holder, int position) {
    }
    
    public final void filter(@org.jetbrains.annotations.Nullable()
    java.lang.String charText) {
    }
    
    public BaseRecyclerViewAdapter(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bindingId) {
        super();
    }
}