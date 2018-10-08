
package android.databinding;
import com.android.music.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/mi_fragment_simple_slide_0".equals(tag)) {
                            return new com.heinrichreimersoftware.materialintro.databinding.MiFragmentSimpleSlideBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/mi_fragment_simple_slide_0".equals(tag)) {
                            return new com.heinrichreimersoftware.materialintro.databinding.MiFragmentSimpleSlideBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for mi_fragment_simple_slide is invalid. Received: " + tag);
                }
                case com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/mi_fragment_simple_slide_scrollable_0".equals(tag)) {
                            return new com.heinrichreimersoftware.materialintro.databinding.MiFragmentSimpleSlideScrollableBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/mi_fragment_simple_slide_scrollable_0".equals(tag)) {
                            return new com.heinrichreimersoftware.materialintro.databinding.MiFragmentSimpleSlideScrollableBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for mi_fragment_simple_slide_scrollable is invalid. Received: " + tag);
                }
                case com.heinrichreimersoftware.materialintro.R.layout.mi_activity_intro:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/mi_activity_intro_0".equals(tag)) {
                            return new com.heinrichreimersoftware.materialintro.databinding.MiActivityIntroBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for mi_activity_intro is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 25343430: {
                if(tag.equals("layout/mi_fragment_simple_slide_0")) {
                    return com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide;
                }
                break;
            }
            case -104662078: {
                if(tag.equals("layout-land/mi_fragment_simple_slide_0")) {
                    return com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide;
                }
                break;
            }
            case 1612553282: {
                if(tag.equals("layout/mi_fragment_simple_slide_scrollable_0")) {
                    return com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable;
                }
                break;
            }
            case 877592774: {
                if(tag.equals("layout-land/mi_fragment_simple_slide_scrollable_0")) {
                    return com.heinrichreimersoftware.materialintro.R.layout.mi_fragment_simple_slide_scrollable;
                }
                break;
            }
            case -960528437: {
                if(tag.equals("layout/mi_activity_intro_0")) {
                    return com.heinrichreimersoftware.materialintro.R.layout.mi_activity_intro;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}