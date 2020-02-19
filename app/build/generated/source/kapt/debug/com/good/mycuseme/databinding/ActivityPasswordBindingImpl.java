package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPasswordBindingImpl extends ActivityPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include, 6);
        sViewsWithIds.put(R.id.tv_password_text, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCurrentPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passwordViewModel.beforePassword.getValue()
            //         is passwordViewModel.beforePassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCurrentPassword);
            // localize variables for thread safety
            // passwordViewModel.beforePassword.getValue()
            java.lang.String passwordViewModelBeforePasswordGetValue = null;
            // passwordViewModel.beforePassword
            androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelBeforePassword = null;
            // passwordViewModel.beforePassword != null
            boolean passwordViewModelBeforePasswordJavaLangObjectNull = false;
            // passwordViewModel
            com.good.mycuseme.ui.setting.PasswordViewModel passwordViewModel = mPasswordViewModel;
            // passwordViewModel != null
            boolean passwordViewModelJavaLangObjectNull = false;



            passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
            if (passwordViewModelJavaLangObjectNull) {


                passwordViewModelBeforePassword = passwordViewModel.getBeforePassword();

                passwordViewModelBeforePasswordJavaLangObjectNull = (passwordViewModelBeforePassword) != (null);
                if (passwordViewModelBeforePasswordJavaLangObjectNull) {




                    passwordViewModelBeforePassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNewPasswordFirstandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passwordViewModel.newPassword.getValue()
            //         is passwordViewModel.newPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNewPasswordFirst);
            // localize variables for thread safety
            // passwordViewModel.newPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelNewPassword = null;
            // passwordViewModel.newPassword.getValue()
            java.lang.String passwordViewModelNewPasswordGetValue = null;
            // passwordViewModel.newPassword != null
            boolean passwordViewModelNewPasswordJavaLangObjectNull = false;
            // passwordViewModel
            com.good.mycuseme.ui.setting.PasswordViewModel passwordViewModel = mPasswordViewModel;
            // passwordViewModel != null
            boolean passwordViewModelJavaLangObjectNull = false;



            passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
            if (passwordViewModelJavaLangObjectNull) {


                passwordViewModelNewPassword = passwordViewModel.getNewPassword();

                passwordViewModelNewPasswordJavaLangObjectNull = (passwordViewModelNewPassword) != (null);
                if (passwordViewModelNewPasswordJavaLangObjectNull) {




                    passwordViewModelNewPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNewPasswordSecondandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passwordViewModel.newPasswordConfirm.getValue()
            //         is passwordViewModel.newPasswordConfirm.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNewPasswordSecond);
            // localize variables for thread safety
            // passwordViewModel.newPasswordConfirm
            androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelNewPasswordConfirm = null;
            // passwordViewModel.newPasswordConfirm != null
            boolean passwordViewModelNewPasswordConfirmJavaLangObjectNull = false;
            // passwordViewModel.newPasswordConfirm.getValue()
            java.lang.String passwordViewModelNewPasswordConfirmGetValue = null;
            // passwordViewModel
            com.good.mycuseme.ui.setting.PasswordViewModel passwordViewModel = mPasswordViewModel;
            // passwordViewModel != null
            boolean passwordViewModelJavaLangObjectNull = false;



            passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
            if (passwordViewModelJavaLangObjectNull) {


                passwordViewModelNewPasswordConfirm = passwordViewModel.getNewPasswordConfirm();

                passwordViewModelNewPasswordConfirmJavaLangObjectNull = (passwordViewModelNewPasswordConfirm) != (null);
                if (passwordViewModelNewPasswordConfirmJavaLangObjectNull) {




                    passwordViewModelNewPasswordConfirm.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvPasswordWrongTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passwordViewModel.wrongText.getValue()
            //         is passwordViewModel.wrongText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvPasswordWrongText);
            // localize variables for thread safety
            // passwordViewModel.wrongText.getValue()
            java.lang.String passwordViewModelWrongTextGetValue = null;
            // passwordViewModel
            com.good.mycuseme.ui.setting.PasswordViewModel passwordViewModel = mPasswordViewModel;
            // passwordViewModel.wrongText
            androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelWrongText = null;
            // passwordViewModel != null
            boolean passwordViewModelJavaLangObjectNull = false;
            // passwordViewModel.wrongText != null
            boolean passwordViewModelWrongTextJavaLangObjectNull = false;



            passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
            if (passwordViewModelJavaLangObjectNull) {


                passwordViewModelWrongText = passwordViewModel.getWrongText();

                passwordViewModelWrongTextJavaLangObjectNull = (passwordViewModelWrongText) != (null);
                if (passwordViewModelWrongTextJavaLangObjectNull) {




                    passwordViewModelWrongText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.view.View) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.btnPassword.setTag(null);
        this.etCurrentPassword.setTag(null);
        this.etNewPasswordFirst.setTag(null);
        this.etNewPasswordSecond.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPasswordWrongText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.passwordViewModel == variableId) {
            setPasswordViewModel((com.good.mycuseme.ui.setting.PasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPasswordViewModel(@Nullable com.good.mycuseme.ui.setting.PasswordViewModel PasswordViewModel) {
        this.mPasswordViewModel = PasswordViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.passwordViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePasswordViewModelWrongText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangePasswordViewModelBeforePassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangePasswordViewModelNewPasswordConfirm((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangePasswordViewModelIsClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangePasswordViewModelNewPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePasswordViewModelWrongText(androidx.lifecycle.MutableLiveData<java.lang.String> PasswordViewModelWrongText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordViewModelBeforePassword(androidx.lifecycle.MutableLiveData<java.lang.String> PasswordViewModelBeforePassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordViewModelNewPasswordConfirm(androidx.lifecycle.MutableLiveData<java.lang.String> PasswordViewModelNewPasswordConfirm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordViewModelIsClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> PasswordViewModelIsClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordViewModelNewPassword(androidx.lifecycle.MutableLiveData<java.lang.String> PasswordViewModelNewPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String passwordViewModelNewPasswordConfirmGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelWrongText = null;
        java.lang.String passwordViewModelBeforePasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelBeforePassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelNewPasswordConfirm = null;
        java.lang.Boolean passwordViewModelIsClickableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> passwordViewModelIsClickable = null;
        com.good.mycuseme.ui.setting.PasswordViewModel passwordViewModel = mPasswordViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> passwordViewModelNewPassword = null;
        java.lang.String passwordViewModelNewPasswordGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsClickableGetValue = false;
        java.lang.String passwordViewModelWrongTextGetValue = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.wrongText
                        passwordViewModelWrongText = passwordViewModel.getWrongText();
                    }
                    updateLiveDataRegistration(0, passwordViewModelWrongText);


                    if (passwordViewModelWrongText != null) {
                        // read passwordViewModel.wrongText.getValue()
                        passwordViewModelWrongTextGetValue = passwordViewModelWrongText.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.beforePassword
                        passwordViewModelBeforePassword = passwordViewModel.getBeforePassword();
                    }
                    updateLiveDataRegistration(1, passwordViewModelBeforePassword);


                    if (passwordViewModelBeforePassword != null) {
                        // read passwordViewModel.beforePassword.getValue()
                        passwordViewModelBeforePasswordGetValue = passwordViewModelBeforePassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.newPasswordConfirm
                        passwordViewModelNewPasswordConfirm = passwordViewModel.getNewPasswordConfirm();
                    }
                    updateLiveDataRegistration(2, passwordViewModelNewPasswordConfirm);


                    if (passwordViewModelNewPasswordConfirm != null) {
                        // read passwordViewModel.newPasswordConfirm.getValue()
                        passwordViewModelNewPasswordConfirmGetValue = passwordViewModelNewPasswordConfirm.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.isClickable
                        passwordViewModelIsClickable = passwordViewModel.isClickable();
                    }
                    updateLiveDataRegistration(3, passwordViewModelIsClickable);


                    if (passwordViewModelIsClickable != null) {
                        // read passwordViewModel.isClickable.getValue()
                        passwordViewModelIsClickableGetValue = passwordViewModelIsClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.isClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModelIsClickableGetValue);
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.newPassword
                        passwordViewModelNewPassword = passwordViewModel.getNewPassword();
                    }
                    updateLiveDataRegistration(4, passwordViewModelNewPassword);


                    if (passwordViewModelNewPassword != null) {
                        // read passwordViewModel.newPassword.getValue()
                        passwordViewModelNewPasswordGetValue = passwordViewModelNewPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.btnPassword.setClickable(androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsClickableGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCurrentPassword, passwordViewModelBeforePasswordGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCurrentPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCurrentPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNewPasswordFirst, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNewPasswordFirstandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNewPasswordSecond, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNewPasswordSecondandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvPasswordWrongText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvPasswordWrongTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNewPasswordFirst, passwordViewModelNewPasswordGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNewPasswordSecond, passwordViewModelNewPasswordConfirmGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPasswordWrongText, passwordViewModelWrongTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passwordViewModel.wrongText
        flag 1 (0x2L): passwordViewModel.beforePassword
        flag 2 (0x3L): passwordViewModel.newPasswordConfirm
        flag 3 (0x4L): passwordViewModel.isClickable
        flag 4 (0x5L): passwordViewModel.newPassword
        flag 5 (0x6L): passwordViewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}