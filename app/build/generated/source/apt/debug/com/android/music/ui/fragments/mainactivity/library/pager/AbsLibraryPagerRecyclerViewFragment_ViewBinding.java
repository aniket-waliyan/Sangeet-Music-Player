// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.mainactivity.library.pager;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AbsLibraryPagerRecyclerViewFragment_ViewBinding implements Unbinder {
  private AbsLibraryPagerRecyclerViewFragment target;

  @UiThread
  public AbsLibraryPagerRecyclerViewFragment_ViewBinding(AbsLibraryPagerRecyclerViewFragment target,
      View source) {
    this.target = target;

    target.container = Utils.findRequiredView(source, R.id.container, "field 'container'");
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.empty = Utils.findOptionalViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsLibraryPagerRecyclerViewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.container = null;
    target.recyclerView = null;
    target.empty = null;
  }
}
