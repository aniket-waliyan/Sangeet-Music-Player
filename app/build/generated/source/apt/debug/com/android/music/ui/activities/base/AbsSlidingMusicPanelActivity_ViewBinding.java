// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AbsSlidingMusicPanelActivity_ViewBinding implements Unbinder {
  private AbsSlidingMusicPanelActivity target;

  @UiThread
  public AbsSlidingMusicPanelActivity_ViewBinding(AbsSlidingMusicPanelActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AbsSlidingMusicPanelActivity_ViewBinding(AbsSlidingMusicPanelActivity target,
      View source) {
    this.target = target;

    target.slidingUpPanelLayout = Utils.findRequiredViewAsType(source, R.id.sliding_layout, "field 'slidingUpPanelLayout'", SlidingUpPanelLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsSlidingMusicPanelActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.slidingUpPanelLayout = null;
  }
}
