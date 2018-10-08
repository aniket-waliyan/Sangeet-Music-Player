// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.mainactivity.folders;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import com.android.music.views.BreadCrumbLayout;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FoldersFragment_ViewBinding implements Unbinder {
  private FoldersFragment target;

  @UiThread
  public FoldersFragment_ViewBinding(FoldersFragment target, View source) {
    this.target = target;

    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.coordinator_layout, "field 'coordinatorLayout'", CoordinatorLayout.class);
    target.container = Utils.findRequiredView(source, R.id.container, "field 'container'");
    target.empty = Utils.findRequiredView(source, android.R.id.empty, "field 'empty'");
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.breadCrumbs = Utils.findRequiredViewAsType(source, R.id.bread_crumbs, "field 'breadCrumbs'", BreadCrumbLayout.class);
    target.appbar = Utils.findRequiredViewAsType(source, R.id.appbar, "field 'appbar'", AppBarLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", FastScrollRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FoldersFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.coordinatorLayout = null;
    target.container = null;
    target.empty = null;
    target.toolbar = null;
    target.breadCrumbs = null;
    target.appbar = null;
    target.recyclerView = null;
  }
}
