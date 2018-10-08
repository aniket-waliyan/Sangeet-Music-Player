// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities;

import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.android.music.R;
import com.android.music.ui.activities.base.AbsSlidingMusicPanelActivity_ViewBinding;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistDetailActivity_ViewBinding extends AbsSlidingMusicPanelActivity_ViewBinding {
  private ArtistDetailActivity target;

  @UiThread
  public ArtistDetailActivity_ViewBinding(ArtistDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ArtistDetailActivity_ViewBinding(ArtistDetailActivity target, View source) {
    super(target, source);

    this.target = target;

    target.songListView = Utils.findRequiredViewAsType(source, R.id.list, "field 'songListView'", ObservableListView.class);
    target.artistImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'artistImage'", ImageView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.headerView = Utils.findRequiredView(source, R.id.header, "field 'headerView'");
    target.headerOverlay = Utils.findRequiredView(source, R.id.header_overlay, "field 'headerOverlay'");
    target.durationIconImageView = Utils.findRequiredViewAsType(source, R.id.duration_icon, "field 'durationIconImageView'", ImageView.class);
    target.songCountIconImageView = Utils.findRequiredViewAsType(source, R.id.song_count_icon, "field 'songCountIconImageView'", ImageView.class);
    target.albumCountIconImageView = Utils.findRequiredViewAsType(source, R.id.album_count_icon, "field 'albumCountIconImageView'", ImageView.class);
    target.durationTextView = Utils.findRequiredViewAsType(source, R.id.duration_text, "field 'durationTextView'", TextView.class);
    target.songCountTextView = Utils.findRequiredViewAsType(source, R.id.song_count_text, "field 'songCountTextView'", TextView.class);
    target.albumCountTextView = Utils.findRequiredViewAsType(source, R.id.album_count_text, "field 'albumCountTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    ArtistDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.songListView = null;
    target.artistImage = null;
    target.toolbar = null;
    target.headerView = null;
    target.headerOverlay = null;
    target.durationIconImageView = null;
    target.songCountIconImageView = null;
    target.albumCountIconImageView = null;
    target.durationTextView = null;
    target.songCountTextView = null;
    target.albumCountTextView = null;

    super.unbind();
  }
}
