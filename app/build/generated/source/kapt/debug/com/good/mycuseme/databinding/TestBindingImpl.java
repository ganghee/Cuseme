package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TestBindingImpl extends TestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint, 3);
        sViewsWithIds.put(R.id.button_home_login, 4);
        sViewsWithIds.put(R.id.imageview_quote_left, 5);
        sViewsWithIds.put(R.id.imageview_quote_right, 6);
        sViewsWithIds.put(R.id.tv_home_title, 7);
        sViewsWithIds.put(R.id.textview_home_cardcontent, 8);
        sViewsWithIds.put(R.id.imageview_cumi, 9);
        sViewsWithIds.put(R.id.lottieAnimView, 10);
        sViewsWithIds.put(R.id.view_green, 11);
        sViewsWithIds.put(R.id.view, 12);
        sViewsWithIds.put(R.id.lav_home_lock, 13);
        sViewsWithIds.put(R.id.iv_home_empty, 14);
        sViewsWithIds.put(R.id.tv_home_empty, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private TestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[14]
            , (com.airbnb.lottie.LottieAnimationView) bindings[13]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[11]
            );
        this.buttonHomeRefresh.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerHomeCardlist.setTag(null);
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.homeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
            case 1 :
                return onChangeHomeViewModelIsEmpty((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeHomeViewModelIsEmpty(androidx.lifecycle.MutableLiveData<java.lang.Boolean> HomeViewModelIsEmpty, int fieldId) {
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
        java.util.List<com.good.mycuseme.data.card.CardData> homeViewModelCardListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> homeViewModelCardList = null;
        boolean homeViewModelIsEmpty = false;
        java.lang.Boolean homeViewModelIsEmptyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmpty = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmptyGetValue = false;
        com.good.mycuseme.ui.home.HomeViewModel homeViewModel = mHomeViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> HomeViewModelIsEmpty1 = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

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
            if ((dirtyFlags & 0xeL) != 0) {

                    if (homeViewModel != null) {
                        // read homeViewModel.isEmpty
                        HomeViewModelIsEmpty1 = homeViewModel.isEmpty();
                    }
                    updateLiveDataRegistration(1, HomeViewModelIsEmpty1);


                    if (HomeViewModelIsEmpty1 != null) {
                        // read homeViewModel.isEmpty.getValue()
                        homeViewModelIsEmptyGetValue = HomeViewModelIsEmpty1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isEmpty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(homeViewModelIsEmptyGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isEmpty.getValue())
                    homeViewModelIsEmpty = !androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmptyGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(homeViewModel.isEmpty.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmpty = androidx.databinding.ViewDataBinding.safeUnbox(homeViewModelIsEmpty);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.buttonHomeRefresh.setClickable(androidxDatabindingViewDataBindingSafeUnboxHomeViewModelIsEmpty);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.recyclerHomeCardlist, homeViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel.cardList
        flag 1 (0x2L): homeViewModel.isEmpty
        flag 2 (0x3L): homeViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}