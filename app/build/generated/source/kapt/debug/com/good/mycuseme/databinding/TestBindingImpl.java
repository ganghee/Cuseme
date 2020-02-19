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
        sViewsWithIds.put(R.id.button_home_login, 2);
        sViewsWithIds.put(R.id.button_home_refresh, 3);
        sViewsWithIds.put(R.id.imageview_quote_left, 4);
        sViewsWithIds.put(R.id.imageview_quote_right, 5);
        sViewsWithIds.put(R.id.tv_home_title, 6);
        sViewsWithIds.put(R.id.textview_home_cardcontent, 7);
        sViewsWithIds.put(R.id.imageview_cumi, 8);
        sViewsWithIds.put(R.id.lottieAnimView, 9);
        sViewsWithIds.put(R.id.view_green, 10);
        sViewsWithIds.put(R.id.lav_home_lock, 11);
        sViewsWithIds.put(R.id.iv_home_empty, 12);
        sViewsWithIds.put(R.id.tv_home_empty, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private TestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[12]
            , (com.airbnb.lottie.LottieAnimationView) bindings[11]
            , (com.airbnb.lottie.LottieAnimationView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[10]
            );
        this.constraint.setTag(null);
        this.recyclerHomeCardlist.setTag(null);
        setRootTag(root);
        // listeners
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
        if ((dirtyFlags & 0x7L) != 0) {
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
        flag 1 (0x2L): homeViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}