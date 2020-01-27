package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerUserItemBindingImpl extends RecyclerUserItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_masking, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerUserItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RecyclerUserItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.cardViewCardContainer.setTag(null);
        this.imageviewUserItem.setTag(null);
        this.textviewUserItem.setTag(null);
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
        if (BR.vm == variableId) {
            setVm((com.good.mycuseme.ui.user.UserViewModel) variable);
        }
        else if (BR.cardData == variableId) {
            setCardData((com.good.mycuseme.data.card.CardData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.good.mycuseme.ui.user.UserViewModel Vm) {
        this.mVm = Vm;
    }
    public void setCardData(@Nullable com.good.mycuseme.data.card.CardData CardData) {
        this.mCardData = CardData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cardData);
        super.requestRebind();
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
        com.good.mycuseme.data.card.CardData cardData = mCardData;
        java.lang.String cardDataTitle = null;
        java.lang.String cardDataImage = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (cardData != null) {
                    // read cardData.title
                    cardDataTitle = cardData.getTitle();
                    // read cardData.image
                    cardDataImage = cardData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.setImageUrl(this.imageviewUserItem, cardDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textviewUserItem, cardDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): cardData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}