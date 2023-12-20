package ayush.kathoke.com.qrcode.databinding;
import ayush.kathoke.com.qrcode.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySettingsBindingImpl extends ActivitySettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.status_bar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.text_view_play_sound, 3);
        sViewsWithIds.put(R.id.switch_compat_play_sound, 4);
        sViewsWithIds.put(R.id.view_separator_play_sound, 5);
        sViewsWithIds.put(R.id.text_view_vibrate, 6);
        sViewsWithIds.put(R.id.switch_compat_vibrate, 7);
        sViewsWithIds.put(R.id.view_separator_vibrate, 8);
        sViewsWithIds.put(R.id.text_view_save_history, 9);
        sViewsWithIds.put(R.id.switch_compat_save_history, 10);
        sViewsWithIds.put(R.id.view_separator_save_history, 11);
        sViewsWithIds.put(R.id.text_view_copy_to_clipboard, 12);
        sViewsWithIds.put(R.id.switch_compat_copy_to_clipboard, 13);
        sViewsWithIds.put(R.id.view_separator_copy_to_clipboard, 14);
        sViewsWithIds.put(R.id.text_view_about_us, 15);
        sViewsWithIds.put(R.id.view_separator_about_us, 16);
        sViewsWithIds.put(R.id.text_view_privacy_policy, 17);
        sViewsWithIds.put(R.id.view_separator_privacy_policy, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivitySettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (ayush.kathoke.com.qrcode.helpers.widget.BaseStatusBar) bindings[1]
            , (androidx.appcompat.widget.SwitchCompat) bindings[13]
            , (androidx.appcompat.widget.SwitchCompat) bindings[4]
            , (androidx.appcompat.widget.SwitchCompat) bindings[10]
            , (androidx.appcompat.widget.SwitchCompat) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}