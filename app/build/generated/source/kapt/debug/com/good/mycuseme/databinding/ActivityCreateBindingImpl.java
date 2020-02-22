package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCreateBindingImpl extends ActivityCreateBinding implements com.good.mycuseme.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tb_create_card, 5);
        sViewsWithIds.put(R.id.cardView, 6);
        sViewsWithIds.put(R.id.ll_create_default_picture, 7);
        sViewsWithIds.put(R.id.iv_create_card, 8);
        sViewsWithIds.put(R.id.textView, 9);
        sViewsWithIds.put(R.id.tv_create_save_record, 10);
        sViewsWithIds.put(R.id.tv_create_no_record, 11);
        sViewsWithIds.put(R.id.ll_create_record, 12);
        sViewsWithIds.put(R.id.iv_create_stop, 13);
        sViewsWithIds.put(R.id.progressbar, 14);
        sViewsWithIds.put(R.id.tv_create_timer, 15);
        sViewsWithIds.put(R.id.cv_create_record, 16);
        sViewsWithIds.put(R.id.iv_create_start, 17);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCreateCardContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of createViewModel.content.getValue()
            //         is createViewModel.content.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCreateCardContent);
            // localize variables for thread safety
            // createViewModel.content != null
            boolean createViewModelContentJavaLangObjectNull = false;
            // createViewModel
            com.good.mycuseme.ui.card.CreateViewModel createViewModel = mCreateViewModel;
            // createViewModel != null
            boolean createViewModelJavaLangObjectNull = false;
            // createViewModel.content
            androidx.lifecycle.MutableLiveData<java.lang.String> createViewModelContent = null;
            // createViewModel.content.getValue()
            java.lang.String createViewModelContentGetValue = null;



            createViewModelJavaLangObjectNull = (createViewModel) != (null);
            if (createViewModelJavaLangObjectNull) {


                createViewModelContent = createViewModel.getContent();

                createViewModelContentJavaLangObjectNull = (createViewModelContent) != (null);
                if (createViewModelContentJavaLangObjectNull) {




                    createViewModelContent.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etCreateCardTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of createViewModel.title.getValue()
            //         is createViewModel.title.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCreateCardTitle);
            // localize variables for thread safety
            // createViewModel
            com.good.mycuseme.ui.card.CreateViewModel createViewModel = mCreateViewModel;
            // createViewModel.title.getValue()
            java.lang.String createViewModelTitleGetValue = null;
            // createViewModel != null
            boolean createViewModelJavaLangObjectNull = false;
            // createViewModel.title
            androidx.lifecycle.MutableLiveData<java.lang.String> createViewModelTitle = null;
            // createViewModel.title != null
            boolean createViewModelTitleJavaLangObjectNull = false;



            createViewModelJavaLangObjectNull = (createViewModel) != (null);
            if (createViewModelJavaLangObjectNull) {


                createViewModelTitle = createViewModel.getTitle();

                createViewModelTitleJavaLangObjectNull = (createViewModelTitle) != (null);
                if (createViewModelTitleJavaLangObjectNull) {




                    createViewModelTitle.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityCreateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityCreateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.ProgressBar) bindings[14]
            , (android.view.View) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            );
        this.etCreateCardContent.setTag(null);
        this.etCreateCardTitle.setTag(null);
        this.ivCreateRecord.setTag(null);
        this.ivCreateSaveRecord.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.good.mycuseme.generated.callback.OnClickListener(this, 1);
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
        if (BR.createViewModel == variableId) {
            setCreateViewModel((com.good.mycuseme.ui.card.CreateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCreateViewModel(@Nullable com.good.mycuseme.ui.card.CreateViewModel CreateViewModel) {
        this.mCreateViewModel = CreateViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.createViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCreateViewModelContent((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeCreateViewModelTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeCreateViewModelIsSaveRecordClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCreateViewModelContent(androidx.lifecycle.MutableLiveData<java.lang.String> CreateViewModelContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCreateViewModelTitle(androidx.lifecycle.MutableLiveData<java.lang.String> CreateViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCreateViewModelIsSaveRecordClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CreateViewModelIsSaveRecordClickable, int fieldId) {
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
        com.good.mycuseme.ui.card.CreateViewModel createViewModel = mCreateViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> createViewModelContent = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> createViewModelTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCreateViewModelIsSaveRecordClickableGetValue = false;
        java.lang.String createViewModelTitleGetValue = null;
        java.lang.String createViewModelContentGetValue = null;
        java.lang.Boolean createViewModelIsSaveRecordClickableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> createViewModelIsSaveRecordClickable = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (createViewModel != null) {
                        // read createViewModel.content
                        createViewModelContent = createViewModel.getContent();
                    }
                    updateLiveDataRegistration(0, createViewModelContent);


                    if (createViewModelContent != null) {
                        // read createViewModel.content.getValue()
                        createViewModelContentGetValue = createViewModelContent.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (createViewModel != null) {
                        // read createViewModel.title
                        createViewModelTitle = createViewModel.getTitle();
                    }
                    updateLiveDataRegistration(1, createViewModelTitle);


                    if (createViewModelTitle != null) {
                        // read createViewModel.title.getValue()
                        createViewModelTitleGetValue = createViewModelTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (createViewModel != null) {
                        // read createViewModel.isSaveRecordClickable()
                        createViewModelIsSaveRecordClickable = createViewModel.isSaveRecordClickable();
                    }
                    updateLiveDataRegistration(2, createViewModelIsSaveRecordClickable);


                    if (createViewModelIsSaveRecordClickable != null) {
                        // read createViewModel.isSaveRecordClickable().getValue()
                        createViewModelIsSaveRecordClickableGetValue = createViewModelIsSaveRecordClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(createViewModel.isSaveRecordClickable().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCreateViewModelIsSaveRecordClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(createViewModelIsSaveRecordClickableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCreateCardContent, createViewModelContentGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCreateCardContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCreateCardContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCreateCardTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCreateCardTitleandroidTextAttrChanged);
            this.ivCreateRecord.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCreateCardTitle, createViewModelTitleGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.ivCreateSaveRecord.setClickable(androidxDatabindingViewDataBindingSafeUnboxCreateViewModelIsSaveRecordClickableGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // createViewModel
        com.good.mycuseme.ui.card.CreateViewModel createViewModel = mCreateViewModel;
        // createViewModel != null
        boolean createViewModelJavaLangObjectNull = false;



        createViewModelJavaLangObjectNull = (createViewModel) != (null);
        if (createViewModelJavaLangObjectNull) {



            createViewModel.clickAutoSpeak(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): createViewModel.content
        flag 1 (0x2L): createViewModel.title
        flag 2 (0x3L): createViewModel.isSaveRecordClickable()
        flag 3 (0x4L): createViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}