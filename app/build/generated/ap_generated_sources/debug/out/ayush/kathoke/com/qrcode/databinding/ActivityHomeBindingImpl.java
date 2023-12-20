package ayush.kathoke.com.qrcode.databinding;
import ayush.kathoke.com.qrcode.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.adView, 1);
        sViewsWithIds.put(R.id.coordinator_layout_icon_extra_part_container, 2);
        sViewsWithIds.put(R.id.constraint_layout_generate_container, 3);
        sViewsWithIds.put(R.id.constraint_layout_scan_container, 4);
        sViewsWithIds.put(R.id.constraint_layout_history_container, 5);
        sViewsWithIds.put(R.id.image_view_generate, 6);
        sViewsWithIds.put(R.id.text_view_generate, 7);
        sViewsWithIds.put(R.id.image_view_scan, 8);
        sViewsWithIds.put(R.id.text_view_scan, 9);
        sViewsWithIds.put(R.id.image_view_history, 10);
        sViewsWithIds.put(R.id.text_view_history, 11);
        sViewsWithIds.put(R.id.view_drop_shadow, 12);
        sViewsWithIds.put(R.id.image_view_generate_active, 13);
        sViewsWithIds.put(R.id.image_view_scan_active, 14);
        sViewsWithIds.put(R.id.image_view_history_active, 15);
        sViewsWithIds.put(R.id.status_bar, 16);
        sViewsWithIds.put(R.id.toolbar, 17);
        sViewsWithIds.put(R.id.coordinator_layout_fragment_container, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.gms.ads.AdView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[18]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (ayush.kathoke.com.qrcode.helpers.widget.BaseStatusBar) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (androidx.appcompat.widget.Toolbar) bindings[17]
            , (android.view.View) bindings[12]
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