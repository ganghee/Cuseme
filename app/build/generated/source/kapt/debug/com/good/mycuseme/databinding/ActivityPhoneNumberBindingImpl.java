package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPhoneNumberBindingImpl extends ActivityPhoneNumberBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include, 3);
        sViewsWithIds.put(R.id.tv_phone_text, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of phoneNumberViewModel.phoneNumber.getValue()
            //         is phoneNumberViewModel.phoneNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPhoneNumber);
            // localize variables for thread safety
            // phoneNumberViewModel.phoneNumber.getValue()
            java.lang.String phoneNumberViewModelPhoneNumberGetValue = null;
            // phoneNumberViewModel
            com.good.mycuseme.ui.setting.PhoneNumberViewModel phoneNumberViewModel = mPhoneNumberViewModel;
            // phoneNumberViewModel.phoneNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumberViewModelPhoneNumber = null;
            // phoneNumberViewModel.phoneNumber != null
            boolean phoneNumberViewModelPhoneNumberJavaLangObjectNull = false;
            // phoneNumberViewModel != null
            boolean phoneNumberViewModelJavaLangObjectNull = false;



            phoneNumberViewModelJavaLangObjectNull = (phoneNumberViewModel) != (null);
            if (phoneNumberViewModelJavaLangObjectNull) {


                phoneNumberViewModelPhoneNumber = phoneNumberViewModel.getPhoneNumber();

                phoneNumberViewModelPhoneNumberJavaLangObjectNull = (phoneNumberViewModelPhoneNumber) != (null);
                if (phoneNumberViewModelPhoneNumberJavaLangObjectNull) {




                    phoneNumberViewModelPhoneNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityPhoneNumberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityPhoneNumberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.btnPhone.setTag(null);
        this.etPhoneNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.phoneNumberViewModel == variableId) {
            setPhoneNumberViewModel((com.good.mycuseme.ui.setting.PhoneNumberViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPhoneNumberViewModel(@Nullable com.good.mycuseme.ui.setting.PhoneNumberViewModel PhoneNumberViewModel) {
        this.mPhoneNumberViewModel = PhoneNumberViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.phoneNumberViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePhoneNumberViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangePhoneNumberViewModelIsClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePhoneNumberViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> PhoneNumberViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePhoneNumberViewModelIsClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> PhoneNumberViewModelIsClickable, int fieldId) {
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
        java.lang.String phoneNumberViewModelPhoneNumberGetValue = null;
        com.good.mycuseme.ui.setting.PhoneNumberViewModel phoneNumberViewModel = mPhoneNumberViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumberViewModelPhoneNumber = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPhoneNumberViewModelIsClickableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> phoneNumberViewModelIsClickable = null;
        java.lang.Boolean phoneNumberViewModelIsClickableGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (phoneNumberViewModel != null) {
                        // read phoneNumberViewModel.phoneNumber
                        phoneNumberViewModelPhoneNumber = phoneNumberViewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(0, phoneNumberViewModelPhoneNumber);


                    if (phoneNumberViewModelPhoneNumber != null) {
                        // read phoneNumberViewModel.phoneNumber.getValue()
                        phoneNumberViewModelPhoneNumberGetValue = phoneNumberViewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (phoneNumberViewModel != null) {
                        // read phoneNumberViewModel.isClickable
                        phoneNumberViewModelIsClickable = phoneNumberViewModel.isClickable();
                    }
                    updateLiveDataRegistration(1, phoneNumberViewModelIsClickable);


                    if (phoneNumberViewModelIsClickable != null) {
                        // read phoneNumberViewModel.isClickable.getValue()
                        phoneNumberViewModelIsClickableGetValue = phoneNumberViewModelIsClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(phoneNumberViewModel.isClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPhoneNumberViewModelIsClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(phoneNumberViewModelIsClickableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.btnPhone.setClickable(androidxDatabindingViewDataBindingSafeUnboxPhoneNumberViewModelIsClickableGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPhoneNumber, phoneNumberViewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPhoneNumberandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): phoneNumberViewModel.phoneNumber
        flag 1 (0x2L): phoneNumberViewModel.isClickable
        flag 2 (0x3L): phoneNumberViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}