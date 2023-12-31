// Generated by data binding compiler. Do not edit!
package wasakey.w3apps.com.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.lang.Deprecated;
import java.lang.Object;
import wasakey.w3apps.com.qrcode.R;

public abstract class FragmentScanBinding extends ViewDataBinding {
  @NonNull
  public final DecoratedBarcodeView barcodeView;

  @NonNull
  public final TextView textViewScanGallery;

  @NonNull
  public final TextView textViewSetFlash;

  protected FragmentScanBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DecoratedBarcodeView barcodeView, TextView textViewScanGallery, TextView textViewSetFlash) {
    super(_bindingComponent, _root, _localFieldCount);
    this.barcodeView = barcodeView;
    this.textViewScanGallery = textViewScanGallery;
    this.textViewSetFlash = textViewSetFlash;
  }

  @NonNull
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_scan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentScanBinding>inflateInternal(inflater, R.layout.fragment_scan, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_scan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentScanBinding>inflateInternal(inflater, R.layout.fragment_scan, null, false, component);
  }

  public static FragmentScanBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentScanBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentScanBinding)bind(component, view, R.layout.fragment_scan);
  }
}
