// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities;

import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import butterknife.internal.Utils;
import com.android.music.R;
import com.android.music.ui.activities.base.AbsSlidingMusicPanelActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding extends AbsSlidingMusicPanelActivity_ViewBinding {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    super(target, source);

    this.target = target;

    target.navigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'navigationView'", NavigationView.class);
    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
  }

  @Override
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationView = null;
    target.drawerLayout = null;

    super.unbind();
  }
}
