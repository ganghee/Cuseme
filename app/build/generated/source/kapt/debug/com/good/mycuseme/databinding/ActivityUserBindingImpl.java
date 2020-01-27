package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUserBindingImpl extends ActivityUserBinding implements com.good.mycuseme.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar_user, 3);
        sViewsWithIds.put(R.id.motionlayout_user, 4);
        sViewsWithIds.put(R.id.button_user_login, 5);
        sViewsWithIds.put(R.id.imageview_quote_left, 6);
        sViewsWithIds.put(R.id.imageview_quote_right, 7);
        sViewsWithIds.put(R.id.textview_user_cardcontent, 8);
        sViewsWithIds.put(R.id.imageview_cumi, 9);
        sViewsWithIds.put(R.id.lottieAnimView, 10);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[8]
            );
        this.buttonUserRefresh.setTag(null);
        this.constraint.setTag(null);
        this.recyclerUserCardlist.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.good.mycuseme.generated.callback.OnClickListener(this, 1);
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
        if (BR.userViewModel == variableId) {
            setUserViewModel((com.good.mycuseme.ui.user.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserViewModel(@Nullable com.good.mycuseme.ui.user.UserViewModel UserViewModel) {
        this.mUserViewModel = UserViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> UserViewModelCardList, int fieldId) {
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
        com.good.mycuseme.ui.user.UserViewModel userViewModel = mUserViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> userViewModelCardList = null;
        java.util.List<com.good.mycuseme.data.card.CardData> userViewModelCardListGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (userViewModel != null) {
                    // read userViewModel.cardList
                    userViewModelCardList = userViewModel.getCardList();
                }
                updateLiveDataRegistration(0, userViewModelCardList);


                if (userViewModelCardList != null) {
                    // read userViewModel.cardList.getValue()
                    userViewModelCardListGetValue = userViewModelCardList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonUserRefresh.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.recyclerUserCardlist, userViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // userViewModel
        com.good.mycuseme.ui.user.UserViewModel userViewModel = mUserViewModel;
        // userViewModel.cardList
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> userViewModelCardList = null;
        // userViewModel.cardList.getValue()
        java.util.List<com.good.mycuseme.data.card.CardData> userViewModelCardListGetValue = null;
        // userViewModel != null
        boolean userViewModelJavaLangObjectNull = false;
        // userViewModel.cardList != null
        boolean userViewModelCardListJavaLangObjectNull = false;



        userViewModelJavaLangObjectNull = (userViewModel) != (null);
        if (userViewModelJavaLangObjectNull) {




            userViewModelCardList = userViewModel.getCardList();

            userViewModelCardListJavaLangObjectNull = (userViewModelCardList) != (null);
            if (userViewModelCardListJavaLangObjectNull) {


                userViewModelCardListGetValue = userViewModelCardList.getValue();

                userViewModel.sort(userViewModelCardListGetValue);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userViewModel.cardList
        flag 1 (0x2L): userViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}