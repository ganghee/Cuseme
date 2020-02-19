package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityContentCardBindingImpl extends ActivityContentCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_back, 5);
        sViewsWithIds.put(R.id.iv_content_hide, 6);
        sViewsWithIds.put(R.id.iv_content_update, 7);
        sViewsWithIds.put(R.id.iv_content_delete, 8);
        sViewsWithIds.put(R.id.tv_content_record1, 9);
        sViewsWithIds.put(R.id.tv_content_record2, 10);
        sViewsWithIds.put(R.id.iv_content_record_start, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvContentContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contentViewModel.content.getValue()
            //         is contentViewModel.content.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvContentContent);
            // localize variables for thread safety
            // contentViewModel.content.getValue()
            java.lang.String contentViewModelContentGetValue = null;
            // contentViewModel.content != null
            boolean contentViewModelContentJavaLangObjectNull = false;
            // contentViewModel.content
            androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelContent = null;
            // contentViewModel
            com.good.mycuseme.ui.card.ContentCardViewModel contentViewModel = mContentViewModel;
            // contentViewModel != null
            boolean contentViewModelJavaLangObjectNull = false;



            contentViewModelJavaLangObjectNull = (contentViewModel) != (null);
            if (contentViewModelJavaLangObjectNull) {


                contentViewModelContent = contentViewModel.getContent();

                contentViewModelContentJavaLangObjectNull = (contentViewModelContent) != (null);
                if (contentViewModelContentJavaLangObjectNull) {




                    contentViewModelContent.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvContentSerialNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contentViewModel.serialNumber.getValue()
            //         is contentViewModel.serialNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvContentSerialNumber);
            // localize variables for thread safety
            // contentViewModel
            com.good.mycuseme.ui.card.ContentCardViewModel contentViewModel = mContentViewModel;
            // contentViewModel.serialNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelSerialNumber = null;
            // contentViewModel.serialNumber.getValue()
            java.lang.String contentViewModelSerialNumberGetValue = null;
            // contentViewModel != null
            boolean contentViewModelJavaLangObjectNull = false;
            // contentViewModel.serialNumber != null
            boolean contentViewModelSerialNumberJavaLangObjectNull = false;



            contentViewModelJavaLangObjectNull = (contentViewModel) != (null);
            if (contentViewModelJavaLangObjectNull) {


                contentViewModelSerialNumber = contentViewModel.getSerialNumber();

                contentViewModelSerialNumberJavaLangObjectNull = (contentViewModelSerialNumber) != (null);
                if (contentViewModelSerialNumberJavaLangObjectNull) {




                    contentViewModelSerialNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvContentTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of contentViewModel.title.getValue()
            //         is contentViewModel.title.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvContentTitle);
            // localize variables for thread safety
            // contentViewModel.title
            androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelTitle = null;
            // contentViewModel.title != null
            boolean contentViewModelTitleJavaLangObjectNull = false;
            // contentViewModel
            com.good.mycuseme.ui.card.ContentCardViewModel contentViewModel = mContentViewModel;
            // contentViewModel != null
            boolean contentViewModelJavaLangObjectNull = false;
            // contentViewModel.title.getValue()
            java.lang.String contentViewModelTitleGetValue = null;



            contentViewModelJavaLangObjectNull = (contentViewModel) != (null);
            if (contentViewModelJavaLangObjectNull) {


                contentViewModelTitle = contentViewModel.getTitle();

                contentViewModelTitleJavaLangObjectNull = (contentViewModelTitle) != (null);
                if (contentViewModelTitleJavaLangObjectNull) {




                    contentViewModelTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityContentCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityContentCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.ivContent.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvContentContent.setTag(null);
        this.tvContentSerialNumber.setTag(null);
        this.tvContentTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.contentViewModel == variableId) {
            setContentViewModel((com.good.mycuseme.ui.card.ContentCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContentViewModel(@Nullable com.good.mycuseme.ui.card.ContentCardViewModel ContentViewModel) {
        this.mContentViewModel = ContentViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.contentViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContentViewModelImage((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeContentViewModelTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeContentViewModelContent((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeContentViewModelSerialNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContentViewModelImage(androidx.lifecycle.MutableLiveData<java.lang.String> ContentViewModelImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContentViewModelTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ContentViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContentViewModelContent(androidx.lifecycle.MutableLiveData<java.lang.String> ContentViewModelContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContentViewModelSerialNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ContentViewModelSerialNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String contentViewModelImageGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelImage = null;
        com.good.mycuseme.ui.card.ContentCardViewModel contentViewModel = mContentViewModel;
        java.lang.String contentViewModelSerialNumberGetValue = null;
        java.lang.String contentViewModelContentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelTitle = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelContent = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> contentViewModelSerialNumber = null;
        java.lang.String contentViewModelTitleGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (contentViewModel != null) {
                        // read contentViewModel.image
                        contentViewModelImage = contentViewModel.getImage();
                    }
                    updateLiveDataRegistration(0, contentViewModelImage);


                    if (contentViewModelImage != null) {
                        // read contentViewModel.image.getValue()
                        contentViewModelImageGetValue = contentViewModelImage.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (contentViewModel != null) {
                        // read contentViewModel.title
                        contentViewModelTitle = contentViewModel.getTitle();
                    }
                    updateLiveDataRegistration(1, contentViewModelTitle);


                    if (contentViewModelTitle != null) {
                        // read contentViewModel.title.getValue()
                        contentViewModelTitleGetValue = contentViewModelTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (contentViewModel != null) {
                        // read contentViewModel.content
                        contentViewModelContent = contentViewModel.getContent();
                    }
                    updateLiveDataRegistration(2, contentViewModelContent);


                    if (contentViewModelContent != null) {
                        // read contentViewModel.content.getValue()
                        contentViewModelContentGetValue = contentViewModelContent.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (contentViewModel != null) {
                        // read contentViewModel.serialNumber
                        contentViewModelSerialNumber = contentViewModel.getSerialNumber();
                    }
                    updateLiveDataRegistration(3, contentViewModelSerialNumber);


                    if (contentViewModelSerialNumber != null) {
                        // read contentViewModel.serialNumber.getValue()
                        contentViewModelSerialNumberGetValue = contentViewModelSerialNumber.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.setImageUrl(this.ivContent, contentViewModelImageGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContentContent, contentViewModelContentGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvContentContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvContentContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvContentSerialNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvContentSerialNumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvContentTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvContentTitleandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContentSerialNumber, contentViewModelSerialNumberGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContentTitle, contentViewModelTitleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): contentViewModel.image
        flag 1 (0x2L): contentViewModel.title
        flag 2 (0x3L): contentViewModel.content
        flag 3 (0x4L): contentViewModel.serialNumber
        flag 4 (0x5L): contentViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}