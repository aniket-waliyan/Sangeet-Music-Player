package com.heinrichreimersoftware.materialintro.databinding;
import com.heinrichreimersoftware.materialintro.R;
import com.heinrichreimersoftware.materialintro.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MiActivityIntroBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mi_pager, 1);
        sViewsWithIds.put(R.id.mi_button_back, 2);
        sViewsWithIds.put(R.id.mi_button_next, 3);
        sViewsWithIds.put(R.id.mi_pager_indicator, 4);
        sViewsWithIds.put(R.id.mi_button_cta, 5);
    }
    // views
    @NonNull
    public final android.widget.ImageButton miButtonBack;
    @NonNull
    public final android.widget.TextSwitcher miButtonCta;
    @NonNull
    public final android.widget.ImageButton miButtonNext;
    @NonNull
    public final android.support.constraint.ConstraintLayout miFrame;
    @NonNull
    public final com.heinrichreimersoftware.materialintro.view.FadeableViewPager miPager;
    @NonNull
    public final com.heinrichreimersoftware.materialintro.view.InkPageIndicator miPagerIndicator;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MiActivityIntroBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.miButtonBack = (android.widget.ImageButton) bindings[2];
        this.miButtonCta = (android.widget.TextSwitcher) bindings[5];
        this.miButtonNext = (android.widget.ImageButton) bindings[3];
        this.miFrame = (android.support.constraint.ConstraintLayout) bindings[0];
        this.miFrame.setTag(null);
        this.miPager = (com.heinrichreimersoftware.materialintro.view.FadeableViewPager) bindings[1];
        this.miPagerIndicator = (com.heinrichreimersoftware.materialintro.view.InkPageIndicator) bindings[4];
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

    @NonNull
    public static MiActivityIntroBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiActivityIntroBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<MiActivityIntroBinding>inflate(inflater, com.heinrichreimersoftware.materialintro.R.layout.mi_activity_intro, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static MiActivityIntroBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiActivityIntroBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.heinrichreimersoftware.materialintro.R.layout.mi_activity_intro, null, false), bindingComponent);
    }
    @NonNull
    public static MiActivityIntroBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiActivityIntroBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/mi_activity_intro_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new MiActivityIntroBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}