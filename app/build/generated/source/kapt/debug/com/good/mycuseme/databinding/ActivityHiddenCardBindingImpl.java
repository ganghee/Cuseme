package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHiddenCardBindingImpl extends ActivityHiddenCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include3, 4);
        sViewsWithIds.put(R.id.srl_hide, 5);
        sViewsWithIds.put(R.id.iv_hidden_empty, 6);
        sViewsWithIds.put(R.id.tv_hidden_empty, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHiddenCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityHiddenCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.view.View) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            , (android.widget.TextView) bindings[7]
            );
        this.ivHiddenSave.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbOrder.setTag(null);
        this.rvHidden.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.hiddenCardViewModel == variableId) {
            setHiddenCardViewModel((com.good.mycuseme.ui.card.HiddenCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHiddenCardViewModel(@Nullable com.good.mycuseme.ui.card.HiddenCardViewModel HiddenCardViewModel) {
        this.mHiddenCardViewModel = HiddenCardViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.hiddenCardViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHiddenCardViewModelGetSuccessCards((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeHiddenCardViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
            case 2 :
                return onChangeHiddenCardViewModelIsSaveClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHiddenCardViewModelGetSuccessCards(androidx.lifecycle.MutableLiveData<java.lang.Boolean> HiddenCardViewModelGetSuccessCards, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHiddenCardViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> HiddenCardViewModelCardList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHiddenCardViewModelIsSaveClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> HiddenCardViewModelIsSaveClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> hiddenCardViewModelGetSuccessCards = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelGetSuccessCardsGetValue = false;
        java.lang.Boolean hiddenCardViewModelGetSuccessCardsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> hiddenCardViewModelCardList = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelIsSaveClickableGetValue = false;
        com.good.mycuseme.ui.card.HiddenCardViewModel hiddenCardViewModel = mHiddenCardViewModel;
        int hiddenCardViewModelGetSuccessCardsViewGONEViewVISIBLE = 0;
        java.util.List<com.good.mycuseme.data.card.CardData> hiddenCardViewModelCardListGetValue = null;
        java.lang.Boolean hiddenCardViewModelIsSaveClickableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> hiddenCardViewModelIsSaveClickable = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (hiddenCardViewModel != null) {
                        // read hiddenCardViewModel.getSuccessCards
                        hiddenCardViewModelGetSuccessCards = hiddenCardViewModel.getGetSuccessCards();
                    }
                    updateLiveDataRegistration(0, hiddenCardViewModelGetSuccessCards);


                    if (hiddenCardViewModelGetSuccessCards != null) {
                        // read hiddenCardViewModel.getSuccessCards.getValue()
                        hiddenCardViewModelGetSuccessCardsGetValue = hiddenCardViewModelGetSuccessCards.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModel.getSuccessCards.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelGetSuccessCardsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModelGetSuccessCardsGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelGetSuccessCardsGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
                    hiddenCardViewModelGetSuccessCardsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelGetSuccessCardsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (hiddenCardViewModel != null) {
                        // read hiddenCardViewModel.cardList
                        hiddenCardViewModelCardList = hiddenCardViewModel.getCardList();
                    }
                    updateLiveDataRegistration(1, hiddenCardViewModelCardList);


                    if (hiddenCardViewModelCardList != null) {
                        // read hiddenCardViewModel.cardList.getValue()
                        hiddenCardViewModelCardListGetValue = hiddenCardViewModelCardList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (hiddenCardViewModel != null) {
                        // read hiddenCardViewModel.isSaveClickable
                        hiddenCardViewModelIsSaveClickable = hiddenCardViewModel.isSaveClickable();
                    }
                    updateLiveDataRegistration(2, hiddenCardViewModelIsSaveClickable);


                    if (hiddenCardViewModelIsSaveClickable != null) {
                        // read hiddenCardViewModel.isSaveClickable.getValue()
                        hiddenCardViewModelIsSaveClickableGetValue = hiddenCardViewModelIsSaveClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModel.isSaveClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelIsSaveClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModelIsSaveClickableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.ivHiddenSave.setClickable(androidxDatabindingViewDataBindingSafeUnboxHiddenCardViewModelIsSaveClickableGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.pbOrder.setVisibility(hiddenCardViewModelGetSuccessCardsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.rvHidden, hiddenCardViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hiddenCardViewModel.getSuccessCards
        flag 1 (0x2L): hiddenCardViewModel.cardList
        flag 2 (0x3L): hiddenCardViewModel.isSaveClickable
        flag 3 (0x4L): hiddenCardViewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(hiddenCardViewModel.getSuccessCards.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}