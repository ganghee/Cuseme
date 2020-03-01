package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditBindingImpl extends ActivityEditBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tb_update_card, 2);
        sViewsWithIds.put(R.id.cardView, 3);
        sViewsWithIds.put(R.id.ll_update_default_picture, 4);
        sViewsWithIds.put(R.id.iv_update_card, 5);
        sViewsWithIds.put(R.id.et_update_card_title, 6);
        sViewsWithIds.put(R.id.et_update_card_content, 7);
        sViewsWithIds.put(R.id.textView_edit, 8);
        sViewsWithIds.put(R.id.iv_update_record, 9);
        sViewsWithIds.put(R.id.tv_update_save_record, 10);
        sViewsWithIds.put(R.id.tv_update_no_record, 11);
        sViewsWithIds.put(R.id.cl_update, 12);
        sViewsWithIds.put(R.id.iv_update_stop, 13);
        sViewsWithIds.put(R.id.progressbar_edit, 14);
        sViewsWithIds.put(R.id.tv_update_timer, 15);
        sViewsWithIds.put(R.id.cv_update_record, 16);
        sViewsWithIds.put(R.id.iv_update_start, 17);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.Button) bindings[1]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[14]
            , (android.view.View) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            );
        this.ivUpdateSaveRecord.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEditViewModelIsSaveRecordClickable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEditViewModelIsSaveRecordClickable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> EditViewModelIsSaveRecordClickable, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> editViewModelIsSaveRecordClickable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsSaveRecordClickableGetValue = false;
        java.lang.Boolean editViewModelIsSaveRecordClickableGetValue = null;
        com.good.mycuseme.ui.card.EditViewModel editViewModel = mEditViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (editViewModel != null) {
                    // read editViewModel.isSaveRecordClickable
                    editViewModelIsSaveRecordClickable = editViewModel.isSaveRecordClickable();
                }
                updateLiveDataRegistration(0, editViewModelIsSaveRecordClickable);


                if (editViewModelIsSaveRecordClickable != null) {
                    // read editViewModel.isSaveRecordClickable.getValue()
                    editViewModelIsSaveRecordClickableGetValue = editViewModelIsSaveRecordClickable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(editViewModel.isSaveRecordClickable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsSaveRecordClickableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(editViewModelIsSaveRecordClickableGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.ivUpdateSaveRecord.setClickable(androidxDatabindingViewDataBindingSafeUnboxEditViewModelIsSaveRecordClickableGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): editViewModel.isSaveRecordClickable
        flag 1 (0x2L): editViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}