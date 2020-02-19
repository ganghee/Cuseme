package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditBindingImpl extends ActivityEditBinding implements com.good.mycuseme.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tb_update_card, 5);
        sViewsWithIds.put(R.id.cardView, 6);
        sViewsWithIds.put(R.id.ll_update_default_picture, 7);
        sViewsWithIds.put(R.id.iv_update_card, 8);
        sViewsWithIds.put(R.id.et_update_card_title, 9);
        sViewsWithIds.put(R.id.et_update_card_content, 10);
        sViewsWithIds.put(R.id.textView, 11);
        sViewsWithIds.put(R.id.tv_update_save_record, 12);
        sViewsWithIds.put(R.id.tv_update_no_record, 13);
        sViewsWithIds.put(R.id.ll_update_record, 14);
        sViewsWithIds.put(R.id.iv_update_start, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.view.View) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            );
        this.cvUpdateRecord.setTag(null);
        this.ivUpdateRecord.setTag(null);
        this.ivUpdateSaveRecord.setTag(null);
        this.ivUpdateStop.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.good.mycuseme.generated.callback.OnClickListener(this, 1);
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
        if (BR.editViewModel == variableId) {
            setEditViewModel((com.good.mycuseme.ui.card.EditViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditViewModel(@Nullable com.good.mycuseme.ui.card.EditViewModel EditViewModel) {
        this.mEditViewModel = EditViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.editViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEditViewModelIsStartClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeEditViewModelIsRecordClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeEditViewModelIsStopClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEditViewModelIsStartClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> EditViewModelIsStartClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEditViewModelIsRecordClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> EditViewModelIsRecordClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEditViewModelIsStopClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> EditViewModelIsStopClickable, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> editViewModelIsStartClickable = null;
        com.good.mycuseme.ui.card.EditViewModel editViewModel = mEditViewModel;
        java.lang.Boolean editViewModelIsRecordClickableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsRecordClickableGetValue = false;
        java.lang.Boolean editViewModelIsStartClickableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStopClickableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStartClickableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> editViewModelIsRecordClickable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> editViewModelIsStopClickable = null;
        java.lang.Boolean editViewModelIsStopClickableGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (editViewModel != null) {
                        // read editViewModel.isStartClickable
                        editViewModelIsStartClickable = editViewModel.isStartClickable();
                    }
                    updateLiveDataRegistration(0, editViewModelIsStartClickable);


                    if (editViewModelIsStartClickable != null) {
                        // read editViewModel.isStartClickable.getValue()
                        editViewModelIsStartClickableGetValue = editViewModelIsStartClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(editViewModel.isStartClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStartClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(editViewModelIsStartClickableGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (editViewModel != null) {
                        // read editViewModel.isRecordClickable
                        editViewModelIsRecordClickable = editViewModel.isRecordClickable();
                    }
                    updateLiveDataRegistration(1, editViewModelIsRecordClickable);


                    if (editViewModelIsRecordClickable != null) {
                        // read editViewModel.isRecordClickable.getValue()
                        editViewModelIsRecordClickableGetValue = editViewModelIsRecordClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(editViewModel.isRecordClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsRecordClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(editViewModelIsRecordClickableGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (editViewModel != null) {
                        // read editViewModel.isStopClickable
                        editViewModelIsStopClickable = editViewModel.isStopClickable();
                    }
                    updateLiveDataRegistration(2, editViewModelIsStopClickable);


                    if (editViewModelIsStopClickable != null) {
                        // read editViewModel.isStopClickable.getValue()
                        editViewModelIsStopClickableGetValue = editViewModelIsStopClickable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(editViewModel.isStopClickable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStopClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(editViewModelIsStopClickableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.cvUpdateRecord.setClickable(androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStartClickableGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.ivUpdateRecord.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.ivUpdateSaveRecord.setClickable(androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsRecordClickableGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.ivUpdateStop.setClickable(androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsStopClickableGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // editViewModel != null
        boolean editViewModelJavaLangObjectNull = false;
        // editViewModel
        com.good.mycuseme.ui.card.EditViewModel editViewModel = mEditViewModel;



        editViewModelJavaLangObjectNull = (editViewModel) != (null);
        if (editViewModelJavaLangObjectNull) {



            editViewModel.clickAutoSpeak(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): editViewModel.isStartClickable
        flag 1 (0x2L): editViewModel.isRecordClickable
        flag 2 (0x3L): editViewModel.isStopClickable
        flag 3 (0x4L): editViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}