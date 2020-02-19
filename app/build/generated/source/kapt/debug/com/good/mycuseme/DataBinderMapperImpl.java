package com.good.mycuseme;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.good.mycuseme.databinding.ActivityContentCardBindingImpl;
import com.good.mycuseme.databinding.ActivityCreateBindingImpl;
import com.good.mycuseme.databinding.ActivityDownloadBindingImpl;
import com.good.mycuseme.databinding.ActivityEditBindingImpl;
import com.good.mycuseme.databinding.ActivityHiddenCardBindingImpl;
import com.good.mycuseme.databinding.ActivityHomeBindingImpl;
import com.good.mycuseme.databinding.ActivityHomeEndBindingImpl;
import com.good.mycuseme.databinding.ActivityLoginBindingImpl;
import com.good.mycuseme.databinding.ActivityManageBindingImpl;
import com.good.mycuseme.databinding.ActivityPasswordBindingImpl;
import com.good.mycuseme.databinding.ActivityPhoneNumberBindingImpl;
import com.good.mycuseme.databinding.ActivitySettingBindingImpl;
import com.good.mycuseme.databinding.FragmentArrayPreviewBindingImpl;
import com.good.mycuseme.databinding.FragmentPreviewBindingImpl;
import com.good.mycuseme.databinding.FragmentReorderPreviewBindingImpl;
import com.good.mycuseme.databinding.FragmentSearchBindingImpl;
import com.good.mycuseme.databinding.RecyclerCardItemBindingImpl;
import com.good.mycuseme.databinding.RecyclerHiddenItemBindingImpl;
import com.good.mycuseme.databinding.RecyclerOrderItemBindingImpl;
import com.good.mycuseme.databinding.RecyclerReorderItemBindingImpl;
import com.good.mycuseme.databinding.RecyclerSearchItemBindingImpl;
import com.good.mycuseme.databinding.TestBindingImpl;
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
  private static final int LAYOUT_ACTIVITYCONTENTCARD = 1;

  private static final int LAYOUT_ACTIVITYCREATE = 2;

  private static final int LAYOUT_ACTIVITYDOWNLOAD = 3;

  private static final int LAYOUT_ACTIVITYEDIT = 4;

  private static final int LAYOUT_ACTIVITYHIDDENCARD = 5;

  private static final int LAYOUT_ACTIVITYHOME = 6;

  private static final int LAYOUT_ACTIVITYHOMEEND = 7;

  private static final int LAYOUT_ACTIVITYLOGIN = 8;

  private static final int LAYOUT_ACTIVITYMANAGE = 9;

  private static final int LAYOUT_ACTIVITYPASSWORD = 10;

  private static final int LAYOUT_ACTIVITYPHONENUMBER = 11;

  private static final int LAYOUT_ACTIVITYSETTING = 12;

  private static final int LAYOUT_FRAGMENTARRAYPREVIEW = 13;

  private static final int LAYOUT_FRAGMENTPREVIEW = 14;

  private static final int LAYOUT_FRAGMENTREORDERPREVIEW = 15;

  private static final int LAYOUT_FRAGMENTSEARCH = 16;

  private static final int LAYOUT_RECYCLERCARDITEM = 17;

  private static final int LAYOUT_RECYCLERHIDDENITEM = 18;

  private static final int LAYOUT_RECYCLERORDERITEM = 19;

  private static final int LAYOUT_RECYCLERREORDERITEM = 20;

  private static final int LAYOUT_RECYCLERSEARCHITEM = 21;

  private static final int LAYOUT_TEST = 22;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(22);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_content_card, LAYOUT_ACTIVITYCONTENTCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_create, LAYOUT_ACTIVITYCREATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_download, LAYOUT_ACTIVITYDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_edit, LAYOUT_ACTIVITYEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_hidden_card, LAYOUT_ACTIVITYHIDDENCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_home_end, LAYOUT_ACTIVITYHOMEEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_manage, LAYOUT_ACTIVITYMANAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_password, LAYOUT_ACTIVITYPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_phone_number, LAYOUT_ACTIVITYPHONENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_array_preview, LAYOUT_FRAGMENTARRAYPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_preview, LAYOUT_FRAGMENTPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_reorder_preview, LAYOUT_FRAGMENTREORDERPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_card_item, LAYOUT_RECYCLERCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_hidden_item, LAYOUT_RECYCLERHIDDENITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_order_item, LAYOUT_RECYCLERORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_reorder_item, LAYOUT_RECYCLERREORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.recycler_search_item, LAYOUT_RECYCLERSEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.good.mycuseme.R.layout.test, LAYOUT_TEST);
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
        case  LAYOUT_ACTIVITYCONTENTCARD: {
          if ("layout/activity_content_card_0".equals(tag)) {
            return new ActivityContentCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_content_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCREATE: {
          if ("layout/activity_create_0".equals(tag)) {
            return new ActivityCreateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_create is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDOWNLOAD: {
          if ("layout/activity_download_0".equals(tag)) {
            return new ActivityDownloadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_download is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDIT: {
          if ("layout/activity_edit_0".equals(tag)) {
            return new ActivityEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHIDDENCARD: {
          if ("layout/activity_hidden_card_0".equals(tag)) {
            return new ActivityHiddenCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_hidden_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOMEEND: {
          if ("layout/activity_home_end_0".equals(tag)) {
            return new ActivityHomeEndBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home_end is invalid. Received: " + tag);
        }
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
        case  LAYOUT_ACTIVITYPASSWORD: {
          if ("layout/activity_password_0".equals(tag)) {
            return new ActivityPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPHONENUMBER: {
          if ("layout/activity_phone_number_0".equals(tag)) {
            return new ActivityPhoneNumberBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_phone_number is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTING: {
          if ("layout/activity_setting_0".equals(tag)) {
            return new ActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARRAYPREVIEW: {
          if ("layout/fragment_array_preview_0".equals(tag)) {
            return new FragmentArrayPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_array_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPREVIEW: {
          if ("layout/fragment_preview_0".equals(tag)) {
            return new FragmentPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREORDERPREVIEW: {
          if ("layout/fragment_reorder_preview_0".equals(tag)) {
            return new FragmentReorderPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_reorder_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERCARDITEM: {
          if ("layout/recycler_card_item_0".equals(tag)) {
            return new RecyclerCardItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_card_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERHIDDENITEM: {
          if ("layout/recycler_hidden_item_0".equals(tag)) {
            return new RecyclerHiddenItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_hidden_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERORDERITEM: {
          if ("layout/recycler_order_item_0".equals(tag)) {
            return new RecyclerOrderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_order_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERREORDERITEM: {
          if ("layout/recycler_reorder_item_0".equals(tag)) {
            return new RecyclerReorderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_reorder_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERSEARCHITEM: {
          if ("layout/recycler_search_item_0".equals(tag)) {
            return new RecyclerSearchItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_search_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TEST: {
          if ("layout/test_0".equals(tag)) {
            return new TestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for test is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(16);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "cardData");
      sKeys.put(2, "contentViewModel");
      sKeys.put(3, "createViewModel");
      sKeys.put(4, "downloadViewModel");
      sKeys.put(5, "editViewModel");
      sKeys.put(6, "hiddenCardViewModel");
      sKeys.put(7, "homeViewModel");
      sKeys.put(8, "loginViewModel");
      sKeys.put(9, "manageViewModel");
      sKeys.put(10, "passwordViewModel");
      sKeys.put(11, "phoneNumberViewModel");
      sKeys.put(12, "previewArrayViewModel");
      sKeys.put(13, "previewReorderViewModel");
      sKeys.put(14, "previewViewModel");
      sKeys.put(15, "searchViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(22);

    static {
      sKeys.put("layout/activity_content_card_0", com.good.mycuseme.R.layout.activity_content_card);
      sKeys.put("layout/activity_create_0", com.good.mycuseme.R.layout.activity_create);
      sKeys.put("layout/activity_download_0", com.good.mycuseme.R.layout.activity_download);
      sKeys.put("layout/activity_edit_0", com.good.mycuseme.R.layout.activity_edit);
      sKeys.put("layout/activity_hidden_card_0", com.good.mycuseme.R.layout.activity_hidden_card);
      sKeys.put("layout/activity_home_0", com.good.mycuseme.R.layout.activity_home);
      sKeys.put("layout/activity_home_end_0", com.good.mycuseme.R.layout.activity_home_end);
      sKeys.put("layout/activity_login_0", com.good.mycuseme.R.layout.activity_login);
      sKeys.put("layout/activity_manage_0", com.good.mycuseme.R.layout.activity_manage);
      sKeys.put("layout/activity_password_0", com.good.mycuseme.R.layout.activity_password);
      sKeys.put("layout/activity_phone_number_0", com.good.mycuseme.R.layout.activity_phone_number);
      sKeys.put("layout/activity_setting_0", com.good.mycuseme.R.layout.activity_setting);
      sKeys.put("layout/fragment_array_preview_0", com.good.mycuseme.R.layout.fragment_array_preview);
      sKeys.put("layout/fragment_preview_0", com.good.mycuseme.R.layout.fragment_preview);
      sKeys.put("layout/fragment_reorder_preview_0", com.good.mycuseme.R.layout.fragment_reorder_preview);
      sKeys.put("layout/fragment_search_0", com.good.mycuseme.R.layout.fragment_search);
      sKeys.put("layout/recycler_card_item_0", com.good.mycuseme.R.layout.recycler_card_item);
      sKeys.put("layout/recycler_hidden_item_0", com.good.mycuseme.R.layout.recycler_hidden_item);
      sKeys.put("layout/recycler_order_item_0", com.good.mycuseme.R.layout.recycler_order_item);
      sKeys.put("layout/recycler_reorder_item_0", com.good.mycuseme.R.layout.recycler_reorder_item);
      sKeys.put("layout/recycler_search_item_0", com.good.mycuseme.R.layout.recycler_search_item);
      sKeys.put("layout/test_0", com.good.mycuseme.R.layout.test);
    }
  }
}
