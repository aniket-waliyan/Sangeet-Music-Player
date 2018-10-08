// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.android.music.R;
import com.android.music.ui.activities.base.AbsSlidingMusicPanelActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistDetailActivity_ViewBinding extends AbsSlidingMusicPanelActivity_ViewBinding {
  private PlaylistDetailActivity target;

  @UiThread
  public PlaylistDetailActivity_ViewBinding(PlaylistDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaylistDetailActivity_ViewBinding(PlaylistDetailActivity target, View source) {
    super(target, source);

    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.empty = Utils.findRequiredViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
  }

  @Override
  public void unbind() {
    PlaylistDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.toolbar = null;
    target.empty = null;

    super.unbind();
  }
}
