package com.good.mycuseme;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.good.mycuseme.databinding.ActivityLoginBindingImpl;
import com.good.mycuseme.databinding.ActivityManageBindingImpl;
import com.good.mycuseme.databinding.ActivityUserBindingImpl;
import com.good.mycuseme.databinding.FragmentPreviewBindingImpl;
import com.good.mycuseme.databinding.FragmentSearchBindingImpl;
import com.good.mycuseme.databinding.FragmentSearchListBindingImpl;
import com.good.mycuseme.databinding.RecyclerUserItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMANAGE = 2;

  private static final int LAYOUT_ACTIVITYUSER = 3;

  private static final int LAYOUT_FRAGMENTPREVIEW = 4;

  private static final int LAYOUT_FRAGMENTSEARCH = 5;

  private static final int LAYOUT_FRAGMENTSEARCHLIST = 6;

  private static final int LAYOUT_RECYCLERUSERITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_manage, LAYOUT_ACTIVITYMANAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_user, LAYOUT_ACTIVITYUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_preview, LAYOUT_FRAGMENTPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_search_list, LAYOUT_FRAGMENTSEARCHLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_user_item, LAYOUT_RECYCLERUSERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMANAGE: {
          if ("layout/activity_manage_0".equals(tag)) {
            return new ActivityManageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_manage is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSER: {
          if ("layout/activity_user_0".equals(tag)) {
            return new ActivityUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPREVIEW: {
          if ("layout/fragment_preview_0".equals(tag)) {
            return new FragmentPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHLIST: {
          if ("layout/fragment_search_list_0".equals(tag)) {
            return new FragmentSearchListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_list is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERUSERITEM: {
          if ("layout/recycler_user_item_0".equals(tag)) {
            return new RecyclerUserItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_user_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "cardData");
      sKeys.put(2, "loginViewModel");
      sKeys.put(3, "manageViewModel");
      sKeys.put(4, "previewViewModel");
      sKeys.put(5, "searchListViewModel");
      sKeys.put(6, "searchViewModel");
      sKeys.put(7, "userViewModel");
      sKeys.put(8, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_login_0", com.good.mycuseme.R.layout.activity_login);
      sKeys.put("layout/activity_manage_0", com.good.mycuseme.R.layout.activity_manage);
      sKeys.put("layout/activity_user_0", com.good.mycuseme.R.layout.activity_user);
      sKeys.put("layout/fragment_preview_0", com.good.mycuseme.R.layout.fragment_preview);
      sKeys.put("layout/fragment_search_0", com.good.mycuseme.R.layout.fragment_search);
      sKeys.put("layout/fragment_search_list_0", com.good.mycuseme.R.layout.fragment_search_list);
      sKeys.put("layout/recycler_user_item_0", com.good.mycuseme.R.layout.recycler_user_item);
    }
  }
}
