package ayush.kathoke.com.qrcode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ayush.kathoke.com.qrcode.databinding.ActivityAboutUsBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivityGeneratedCodeBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivityHomeBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivityPickedFromGalleryBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivityPrivayPolicyBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivityScanResultBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ActivitySettingsBindingImpl;
import ayush.kathoke.com.qrcode.databinding.FragmentGenerateBindingImpl;
import ayush.kathoke.com.qrcode.databinding.FragmentHistoryBindingImpl;
import ayush.kathoke.com.qrcode.databinding.FragmentScanBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ItemHistoryBindingImpl;
import ayush.kathoke.com.qrcode.databinding.ProgresssDialogLayoutBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUTUS = 1;

  private static final int LAYOUT_ACTIVITYGENERATEDCODE = 2;

  private static final int LAYOUT_ACTIVITYHOME = 3;

  private static final int LAYOUT_ACTIVITYPICKEDFROMGALLERY = 4;

  private static final int LAYOUT_ACTIVITYPRIVAYPOLICY = 5;

  private static final int LAYOUT_ACTIVITYSCANRESULT = 6;

  private static final int LAYOUT_ACTIVITYSETTINGS = 7;

  private static final int LAYOUT_FRAGMENTGENERATE = 8;

  private static final int LAYOUT_FRAGMENTHISTORY = 9;

  private static final int LAYOUT_FRAGMENTSCAN = 10;

  private static final int LAYOUT_ITEMHISTORY = 11;

  private static final int LAYOUT_PROGRESSSDIALOGLAYOUT = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_about_us, LAYOUT_ACTIVITYABOUTUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_generated_code, LAYOUT_ACTIVITYGENERATEDCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_picked_from_gallery, LAYOUT_ACTIVITYPICKEDFROMGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_privay_policy, LAYOUT_ACTIVITYPRIVAYPOLICY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_scan_result, LAYOUT_ACTIVITYSCANRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.activity_settings, LAYOUT_ACTIVITYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.fragment_generate, LAYOUT_FRAGMENTGENERATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.fragment_history, LAYOUT_FRAGMENTHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.fragment_scan, LAYOUT_FRAGMENTSCAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.item_history, LAYOUT_ITEMHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ayush.kathoke.com.qrcode.R.layout.progresss_dialog_layout, LAYOUT_PROGRESSSDIALOGLAYOUT);
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
        case  LAYOUT_ACTIVITYABOUTUS: {
          if ("layout/activity_about_us_0".equals(tag)) {
            return new ActivityAboutUsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_about_us is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGENERATEDCODE: {
          if ("layout/activity_generated_code_0".equals(tag)) {
            return new ActivityGeneratedCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_generated_code is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPICKEDFROMGALLERY: {
          if ("layout/activity_picked_from_gallery_0".equals(tag)) {
            return new ActivityPickedFromGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_picked_from_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRIVAYPOLICY: {
          if ("layout/activity_privay_policy_0".equals(tag)) {
            return new ActivityPrivayPolicyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_privay_policy is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSCANRESULT: {
          if ("layout/activity_scan_result_0".equals(tag)) {
            return new ActivityScanResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_scan_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTINGS: {
          if ("layout/activity_settings_0".equals(tag)) {
            return new ActivitySettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGENERATE: {
          if ("layout/fragment_generate_0".equals(tag)) {
            return new FragmentGenerateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_generate is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHISTORY: {
          if ("layout/fragment_history_0".equals(tag)) {
            return new FragmentHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCAN: {
          if ("layout/fragment_scan_0".equals(tag)) {
            return new FragmentScanBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_scan is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHISTORY: {
          if ("layout/item_history_0".equals(tag)) {
            return new ItemHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_history is invalid. Received: " + tag);
        }
        case  LAYOUT_PROGRESSSDIALOGLAYOUT: {
          if ("layout/progresss_dialog_layout_0".equals(tag)) {
            return new ProgresssDialogLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for progresss_dialog_layout is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_about_us_0", ayush.kathoke.com.qrcode.R.layout.activity_about_us);
      sKeys.put("layout/activity_generated_code_0", ayush.kathoke.com.qrcode.R.layout.activity_generated_code);
      sKeys.put("layout/activity_home_0", ayush.kathoke.com.qrcode.R.layout.activity_home);
      sKeys.put("layout/activity_picked_from_gallery_0", ayush.kathoke.com.qrcode.R.layout.activity_picked_from_gallery);
      sKeys.put("layout/activity_privay_policy_0", ayush.kathoke.com.qrcode.R.layout.activity_privay_policy);
      sKeys.put("layout/activity_scan_result_0", ayush.kathoke.com.qrcode.R.layout.activity_scan_result);
      sKeys.put("layout/activity_settings_0", ayush.kathoke.com.qrcode.R.layout.activity_settings);
      sKeys.put("layout/fragment_generate_0", ayush.kathoke.com.qrcode.R.layout.fragment_generate);
      sKeys.put("layout/fragment_history_0", ayush.kathoke.com.qrcode.R.layout.fragment_history);
      sKeys.put("layout/fragment_scan_0", ayush.kathoke.com.qrcode.R.layout.fragment_scan);
      sKeys.put("layout/item_history_0", ayush.kathoke.com.qrcode.R.layout.item_history);
      sKeys.put("layout/progresss_dialog_layout_0", ayush.kathoke.com.qrcode.R.layout.progresss_dialog_layout);
    }
  }
}
