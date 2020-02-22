package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityManageBindingImpl extends ActivityManageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_manage_opaque, 1);
        sViewsWithIds.put(R.id.fl_manage, 2);
        sViewsWithIds.put(R.id.fb_manage_add_card, 3);
        sViewsWithIds.put(R.id.ll_manage_new_card, 4);
        sViewsWithIds.put(R.id.iv_manage_newcard, 5);
        sViewsWithIds.put(R.id.tv_manage_newcard, 6);
        sViewsWithIds.put(R.id.ll_manage_hidden, 7);
        sViewsWithIds.put(R.id.iv_manage_hidden, 8);
        sViewsWithIds.put(R.id.tv_manage_hidden, 9);
        sViewsWithIds.put(R.id.cv_bottom_bar, 10);
        sViewsWithIds.put(R.id.ll_bottom_preview, 11);
        sViewsWithIds.put(R.id.iv_bottom_preview, 12);
        sViewsWithIds.put(R.id.tv_preview, 13);
        sViewsWithIds.put(R.id.ll_bottom_search, 14);
        sViewsWithIds.put(R.id.iv_bottom_search, 15);
        sViewsWithIds.put(R.id.tv_search, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityManageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityManageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[10]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.view.View) bindings[1]
            );
        this.mlManage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.manageViewModel == variableId) {
            setManageViewModel((com.good.mycuseme.ui.manage.ManageCardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setManageViewModel(@Nullable com.good.mycuseme.ui.manage.ManageCardViewModel ManageViewModel) {
        this.mManageViewModel = ManageViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): manageViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}