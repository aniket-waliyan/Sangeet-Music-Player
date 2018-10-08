package com.heinrichreimersoftware.materialintro.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class MiFragmentSimpleSlideScrollableBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.TextView miDescription;
    @NonNull
    public final android.widget.ImageView miImage;
    @NonNull
    public final android.widget.TextView miTitle;
    // variables
    protected MiFragmentSimpleSlideScrollableBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.TextView miDescription1
        , android.widget.ImageView miImage1
        , android.widget.TextView miTitle1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.miDescription = miDescription1;
        this.miImage = miImage1;
        this.miTitle = miTitle1;
    }
    //getters and abstract setters
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<MiFragmentSimpleSlideScrollableBinding>inflate(inflater, com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<MiFragmentSimpleSlideScrollableBinding>inflate(inflater, com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable, null, false, bindingComponent);
    }
    @NonNull
    public static MiFragmentSimpleSlideScrollableBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (MiFragmentSimpleSlideScrollableBinding)bind(bindingComponent, view, com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable);
    }
}