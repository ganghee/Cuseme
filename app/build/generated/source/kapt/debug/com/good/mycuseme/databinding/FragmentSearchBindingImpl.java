package com.good.mycuseme.databinding;
import com.good.mycuseme.R;
import com.good.mycuseme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView2, 2);
        sViewsWithIds.put(R.id.iv_search_download, 3);
        sViewsWithIds.put(R.id.sv_card, 4);
        sViewsWithIds.put(R.id.srl_search, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[5]
            , (androidx.appcompat.widget.SearchView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvSearch.setTag(null);
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
        if (BR.searchViewModel == variableId) {
            setSearchViewModel((com.good.mycuseme.ui.manage.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchViewModel(@Nullable com.good.mycuseme.ui.manage.SearchViewModel SearchViewModel) {
        this.mSearchViewModel = SearchViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.searchViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchViewModelCardList((androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchViewModelCardList(androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> SearchViewModelCardList, int fieldId) {
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
        com.good.mycuseme.ui.manage.SearchViewModel searchViewModel = mSearchViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<com.good.mycuseme.data.card.CardData>> searchViewModelCardList = null;
        java.util.List<com.good.mycuseme.data.card.CardData> searchViewModelCardListGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (searchViewModel != null) {
                    // read searchViewModel.cardList
                    searchViewModelCardList = searchViewModel.getCardList();
                }
                updateLiveDataRegistration(0, searchViewModelCardList);


                if (searchViewModelCardList != null) {
                    // read searchViewModel.cardList.getValue()
                    searchViewModelCardListGetValue = searchViewModelCardList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.good.mycuseme.util.AdapterUilKt.replaceAll(this.rvSearch, searchViewModelCardListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchViewModel.cardList
        flag 1 (0x2L): searchViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}