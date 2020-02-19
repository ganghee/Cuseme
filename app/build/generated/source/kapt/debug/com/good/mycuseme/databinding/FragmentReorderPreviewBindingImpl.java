package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReorderPreviewBindingImpl extends FragmentReorderPreviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_reorder_empty, 3);
        sViewsWithIds.put(R.id.tv_reorder_empty, 4);
        sViewsWithIds.put(R.id.srl_reorder, 5);
        sViewsWithIds.put(R.id.nestedScrollView, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReorderPreviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentReorderPreviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.pbReorder.setTag(null);
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
        if (BR.previewReorderViewModel == variableId) {
            setPreviewReorderViewModel((com.good.mycuseme.ui.manage.PreviewReorderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPreviewReorderViewModel(@Nullable com.good.mycuseme.ui.manage.PreviewReorderViewModel PreviewReorderViewModel) {
        this.mPreviewReorderViewModel = PreviewReorderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.previewReorderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePreviewReorderViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
            case 1 :
                return onChangePreviewReorderViewModelGetSuccessCards((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePreviewReorderViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> PreviewReorderViewModelCardList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePreviewReorderViewModelGetSuccessCards(androidx.lifecycle.MutableLiveData<java.lang.Boolean> PreviewReorderViewModelGetSuccessCards, int fieldId) {
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
        int previewReorderViewModelGetSuccessCardsViewGONEViewVISIBLE = 0;
        java.lang.Boolean previewReorderViewModelGetSuccessCardsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPreviewReorderViewModelGetSuccessCardsGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> previewReorderViewModelCardList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> previewReorderViewModelGetSuccessCards = null;
        java.util.List<com.good.mycuseme.data.card.CardData> previewReorderViewModelCardListGetValue = null;
        com.good.mycuseme.ui.manage.PreviewReorderViewModel previewReorderViewModel = mPreviewReorderViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (previewReorderViewModel != null) {
                        // read previewReorderViewModel.cardList
                        previewReorderViewModelCardList = previewReorderViewModel.getCardList();
                    }
                    updateLiveDataRegistration(0, previewReorderViewModelCardList);


                    if (previewReorderViewModelCardList != null) {
                        // read previewReorderViewModel.cardList.getValue()
                        previewReorderViewModelCardListGetValue = previewReorderViewModelCardList.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (previewReorderViewModel != null) {
                        // read previewReorderViewModel.getSuccessCards
                        previewReorderViewModelGetSuccessCards = previewReorderViewModel.getGetSuccessCards();
                    }
                    updateLiveDataRegistration(1, previewReorderViewModelGetSuccessCards);


                    if (previewReorderViewModelGetSuccessCards != null) {
                        // read previewReorderViewModel.getSuccessCards.getValue()
                        previewReorderViewModelGetSuccessCardsGetValue = previewReorderViewModelGetSuccessCards.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(previewReorderViewModel.getSuccessCards.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPreviewReorderViewModelGetSuccessCardsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(previewReorderViewModelGetSuccessCardsGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxPreviewReorderViewModelGetSuccessCardsGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(previewReorderViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
                    previewReorderViewModelGetSuccessCardsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxPreviewReorderViewModelGetSuccessCardsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.pbReorder.setVisibility(previewReorderViewModelGetSuccessCardsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.rvPreview, previewReorderViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): previewReorderViewModel.cardList
        flag 1 (0x2L): previewReorderViewModel.getSuccessCards
        flag 2 (0x3L): previewReorderViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(previewReorderViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(previewReorderViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}