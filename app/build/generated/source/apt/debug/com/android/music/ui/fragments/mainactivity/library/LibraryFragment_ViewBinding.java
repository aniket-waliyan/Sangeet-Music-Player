// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.mainactivity.library;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LibraryFragment_ViewBinding implements Unbinder {
  private LibraryFragment target;

  @UiThread
  public LibraryFragment_ViewBinding(LibraryFragment target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.tabs = Utils.findRequiredViewAsType(source, R.id.tabs, "field 'tabs'", TabLayout.class);
    target.appbar = Utils.findRequiredViewAsType(source, R.id.appbar, "field 'appbar'", AppBarLayout.class);
    target.pager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'pager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LibraryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.tabs = null;
    target.appbar = null;
    target.pager = null;
  }
}
