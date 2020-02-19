package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDownloadBindingImpl extends ActivityDownloadBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include, 3);
        sViewsWithIds.put(R.id.tv_download_text, 4);
        sViewsWithIds.put(R.id.tv_download_wrong_text, 5);
        sViewsWithIds.put(R.id.tv_download_create, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextDownloadSerialandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of downloadViewModel.serialNumber.getValue()
            //         is downloadViewModel.serialNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextDownloadSerial);
            // localize variables for thread safety
            // downloadViewModel.serialNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> downloadViewModelSerialNumber = null;
            // downloadViewModel
            com.good.mycuseme.ui.card.DownloadViewModel downloadViewModel = mDownloadViewModel;
            // downloadViewModel != null
            boolean downloadViewModelJavaLangObjectNull = false;
            // downloadViewModel.serialNumber != null
            boolean downloadViewModelSerialNumberJavaLangObjectNull = false;
            // downloadViewModel.serialNumber.getValue()
            java.lang.String downloadViewModelSerialNumberGetValue = null;



            downloadViewModelJavaLangObjectNull = (downloadViewModel) != (null);
            if (downloadViewModelJavaLangObjectNull) {


                downloadViewModelSerialNumber = downloadViewModel.getSerialNumber();

                downloadViewModelSerialNumberJavaLangObjectNull = (downloadViewModelSerialNumber) != (null);
                if (downloadViewModelSerialNumberJavaLangObjectNull) {




                    downloadViewModelSerialNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityDownloadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityDownloadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.btnDownload.setTag(null);
        this.editTextDownloadSerial.setTag(null);
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
        if (BR.downloadViewModel == variableId) {
            setDownloadViewModel((com.good.mycuseme.ui.card.DownloadViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDownloadViewModel(@Nullable com.good.mycuseme.ui.card.DownloadViewModel DownloadViewModel) {
        this.mDownloadViewModel = DownloadViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.downloadViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDownloadViewModelSerialNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDownloadViewModelIsClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDownloadViewModelSerialNumber(androidx.lifecycle.MutableLiveData<java.lang.String> DownloadViewModelSerialNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDownloadViewModelIsClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DownloadViewModelIsClickable, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> downloadViewModelSerialNumber = null;
        com.good.mycuseme.ui.card.DownloadViewModel downloadViewModel = mDownloadViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> downloadViewModelIsClickable = null;
        java.lang.Boolean downloadViewModelIsClickableGetValue = null;
        java.lang.String downloadViewModelSerialNumberGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDownloadViewModelIsClickableGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (downloadViewModel != null) {
                        // read downloadViewModel.serialNumber
                        downloadViewModelSerialNumber = downloadViewModel.getSerialNumber();
                    }
                    updateLiveDataRegistration(0, downloadViewModelSerialNumber);


                    if (downloadViewModelSerialNumber != null) {
                        // read downloadViewModel.serialNumber.getValue()
                        downloadViewModelSerialNumberGetValue = downloadViewModelSerialNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (downloadViewModel != null) {
                        // read downloadViewModel.isClickable
                        downloadViewModelIsClickable = downloadViewModel.isClickable();
                    }
                    updateLiveDataRegistration(1, downloadViewModelIsClickable);


                    if (downloadViewModelIsClickable != null) {
                        // read downloadViewModel.isClickable.getValue()
                        downloadViewModelIsClickableGetValue = downloadViewModelIsClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(downloadViewModel.isClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDownloadViewModelIsClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(downloadViewModelIsClickableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.btnDownload.setClickable(androidxDatabindingViewDataBindingSafeUnboxDownloadViewModelIsClickableGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextDownloadSerial, downloadViewModelSerialNumberGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextDownloadSerial, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextDownloadSerialandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): downloadViewModel.serialNumber
        flag 1 (0x2L): downloadViewModel.isClickable
        flag 2 (0x3L): downloadViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}