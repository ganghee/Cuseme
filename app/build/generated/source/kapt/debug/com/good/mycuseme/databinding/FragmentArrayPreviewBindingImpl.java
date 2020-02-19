package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArrayPreviewBindingImpl extends FragmentArrayPreviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_array_empty, 3);
        sViewsWithIds.put(R.id.tv_array_empty, 4);
        sViewsWithIds.put(R.id.srl_order, 5);
        sViewsWithIds.put(R.id.nestedScrollView2, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArrayPreviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentArrayPreviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbOrder.setTag(null);
        this.rvPreview.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.previewArrayViewModel == variableId) {
            setPreviewArrayViewModel((com.good.mycuseme.ui.manage.PreviewArrayViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPreviewArrayViewModel(@Nullable com.good.mycuseme.ui.manage.PreviewArrayViewModel PreviewArrayViewModel) {
        this.mPreviewArrayViewModel = PreviewArrayViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.previewArrayViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePreviewArrayViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
            case 1 :
                return onChangePreviewArrayViewModelGetSuccessCards((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePreviewArrayViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> PreviewArrayViewModelCardList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePreviewArrayViewModelGetSuccessCards(androidx.lifecycle.MutableLiveData<java.lang.Boolean> PreviewArrayViewModelGetSuccessCards, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> previewArrayViewModelCardList = null;
        com.good.mycuseme.ui.manage.PreviewArrayViewModel previewArrayViewModel = mPreviewArrayViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> previewArrayViewModelGetSuccessCards = null;
        java.lang.Boolean previewArrayViewModelGetSuccessCardsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPreviewArrayViewModelGetSuccessCardsGetValue = false;
        int previewArrayViewModelGetSuccessCardsViewGONEViewVISIBLE = 0;
        java.util.List<com.good.mycuseme.data.card.CardData> previewArrayViewModelCardListGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (previewArrayViewModel != null) {
                        // read previewArrayViewModel.cardList
                        previewArrayViewModelCardList = previewArrayViewModel.getCardList();
                    }
                    updateLiveDataRegistration(0, previewArrayViewModelCardList);


                    if (previewArrayViewModelCardList != null) {
                        // read previewArrayViewModel.cardList.getValue()
                        previewArrayViewModelCardListGetValue = previewArrayViewModelCardList.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (previewArrayViewModel != null) {
                        // read previewArrayViewModel.getSuccessCards
                        previewArrayViewModelGetSuccessCards = previewArrayViewModel.getGetSuccessCards();
                    }
                    updateLiveDataRegistration(1, previewArrayViewModelGetSuccessCards);


                    if (previewArrayViewModelGetSuccessCards != null) {
                        // read previewArrayViewModel.getSuccessCards.getValue()
                        previewArrayViewModelGetSuccessCardsGetValue = previewArrayViewModelGetSuccessCards.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(previewArrayViewModel.getSuccessCards.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPreviewArrayViewModelGetSuccessCardsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(previewArrayViewModelGetSuccessCardsGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxPreviewArrayViewModelGetSuccessCardsGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(previewArrayViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
                    previewArrayViewModelGetSuccessCardsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxPreviewArrayViewModelGetSuccessCardsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.pbOrder.setVisibility(previewArrayViewModelGetSuccessCardsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.rvPreview, previewArrayViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): previewArrayViewModel.cardList
        flag 1 (0x2L): previewArrayViewModel.getSuccessCards
        flag 2 (0x3L): previewArrayViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(previewArrayViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(previewArrayViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}