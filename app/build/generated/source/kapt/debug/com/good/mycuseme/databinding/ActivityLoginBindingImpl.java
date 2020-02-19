package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include, 3);
        sViewsWithIds.put(R.id.tv_login_text, 4);
        sViewsWithIds.put(R.id.tv_login_wrong_text, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextLoginPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.password.getValue()
            //         is loginViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextLoginPassword);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
            // loginViewModel.password.getValue()
            java.lang.String loginViewModelPasswordGetValue = null;
            // loginViewModel
            com.good.mycuseme.ui.login.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.getPassword();

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.btnLogin.setTag(null);
        this.editTextLoginPassword.setTag(null);
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
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.good.mycuseme.ui.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.good.mycuseme.ui.login.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelIsClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelIsClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> LoginViewModelIsClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPassword, int fieldId) {
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
        java.lang.String loginViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginViewModelIsClickable = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
        java.lang.Boolean loginViewModelIsClickableGetValue = null;
        com.good.mycuseme.ui.login.LoginViewModel loginViewModel = mLoginViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsClickableGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.isClickable
                        loginViewModelIsClickable = loginViewModel.isClickable();
                    }
                    updateLiveDataRegistration(0, loginViewModelIsClickable);


                    if (loginViewModelIsClickable != null) {
                        // read loginViewModel.isClickable.getValue()
                        loginViewModelIsClickableGetValue = loginViewModelIsClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.isClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelIsClickableGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.password
                        loginViewModelPassword = loginViewModel.getPassword();
                    }
                    updateLiveDataRegistration(1, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read loginViewModel.password.getValue()
                        loginViewModelPasswordGetValue = loginViewModelPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.btnLogin.setClickable(androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsClickableGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextLoginPassword, loginViewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextLoginPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextLoginPasswordandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.isClickable
        flag 1 (0x2L): loginViewModel.password
        flag 2 (0x3L): loginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}