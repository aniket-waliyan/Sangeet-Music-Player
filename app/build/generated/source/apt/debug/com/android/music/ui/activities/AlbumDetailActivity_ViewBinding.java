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
import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumDetailActivity_ViewBinding extends AbsSlidingMusicPanelActivity_ViewBinding {
  private AlbumDetailActivity target;

  @UiThread
  public AlbumDetailActivity_ViewBinding(AlbumDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlbumDetailActivity_ViewBinding(AlbumDetailActivity target, View source) {
    super(target, source);

    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.list, "field 'recyclerView'", ObservableRecyclerView.class);
    target.albumArtImageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'albumArtImageView'", ImageView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.headerView = Utils.findRequiredView(source, R.id.header, "field 'headerView'");
    target.headerOverlay = Utils.findRequiredView(source, R.id.header_overlay, "field 'headerOverlay'");
    target.artistIconImageView = Utils.findRequiredViewAsType(source, R.id.artist_icon, "field 'artistIconImageView'", ImageView.class);
    target.durationIconImageView = Utils.findRequiredViewAsType(source, R.id.duration_icon, "field 'durationIconImageView'", ImageView.class);
    target.songCountIconImageView = Utils.findRequiredViewAsType(source, R.id.song_count_icon, "field 'songCountIconImageView'", ImageView.class);
    target.albumYearIconImageView = Utils.findRequiredViewAsType(source, R.id.album_year_icon, "field 'albumYearIconImageView'", ImageView.class);
    target.artistTextView = Utils.findRequiredViewAsType(source, R.id.artist_text, "field 'artistTextView'", TextView.class);
    target.durationTextView = Utils.findRequiredViewAsType(source, R.id.duration_text, "field 'durationTextView'", TextView.class);
    target.songCountTextView = Utils.findRequiredViewAsType(source, R.id.song_count_text, "field 'songCountTextView'", TextView.class);
    target.albumYearTextView = Utils.findRequiredViewAsType(source, R.id.album_year_text, "field 'albumYearTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    AlbumDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.albumArtImageView = null;
    target.toolbar = null;
    target.headerView = null;
    target.headerOverlay = null;
    target.artistIconImageView = null;
    target.durationIconImageView = null;
    target.songCountIconImageView = null;
    target.albumYearIconImageView = null;
    target.artistTextView = null;
    target.durationTextView = null;
    target.songCountTextView = null;
    target.albumYearTextView = null;

    super.unbind();
  }
}
