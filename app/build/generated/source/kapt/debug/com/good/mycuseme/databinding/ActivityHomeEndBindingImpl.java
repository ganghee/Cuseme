package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeEndBindingImpl extends ActivityHomeEndBinding implements com.good.mycuseme.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint, 3);
        sViewsWithIds.put(R.id.button_home_login, 4);
        sViewsWithIds.put(R.id.imageview_cumi, 5);
        sViewsWithIds.put(R.id.imageview_quote_left, 6);
        sViewsWithIds.put(R.id.imageview_quote_right, 7);
        sViewsWithIds.put(R.id.tv_home_title, 8);
        sViewsWithIds.put(R.id.textview_home_cardcontent, 9);
        sViewsWithIds.put(R.id.lottieAnimView, 10);
        sViewsWithIds.put(R.id.view_green, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeEndBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityHomeEndBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[11]
            );
        this.buttonHomeRefresh.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerHomeCardlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.good.mycuseme.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.homeViewModel == variableId) {
            setHomeViewModel((com.good.mycuseme.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeViewModel(@Nullable com.good.mycuseme.ui.home.HomeViewModel HomeViewModel) {
        this.mHomeViewModel = HomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.homeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> HomeViewModelCardList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.util.List<com.good.mycuseme.data.card.CardData> homeViewModelCardListGetValue = null;
        com.good.mycuseme.ui.home.HomeViewModel homeViewModel = mHomeViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> homeViewModelCardList = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (homeViewModel != null) {
                    // read homeViewModel.cardList
                    homeViewModelCardList = homeViewModel.getCardList();
                }
                updateLiveDataRegistration(0, homeViewModelCardList);


                if (homeViewModelCardList != null) {
                    // read homeViewModel.cardList.getValue()
                    homeViewModelCardListGetValue = homeViewModelCardList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonHomeRefresh.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.recyclerHomeCardlist, homeViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // homeViewModel != null
        boolean homeViewModelJavaLangObjectNull = false;
        // homeViewModel
        com.good.mycuseme.ui.home.HomeViewModel homeViewModel = mHomeViewModel;
        // homeViewModel.cardList
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> homeViewModelCardList = null;
        // homeViewModel.cardList.getValue()
        java.util.List<com.good.mycuseme.data.card.CardData> homeViewModelCardListGetValue = null;
        // homeViewModel.cardList != null
        boolean homeViewModelCardListJavaLangObjectNull = false;



        homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
        if (homeViewModelJavaLangObjectNull) {




            homeViewModelCardList = homeViewModel.getCardList();

            homeViewModelCardListJavaLangObjectNull = (homeViewModelCardList) != (null);
            if (homeViewModelCardListJavaLangObjectNull) {


                homeViewModelCardListGetValue = homeViewModelCardList.getValue();

                homeViewModel.sort(homeViewModelCardListGetValue);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel.cardList
        flag 1 (0x2L): homeViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}