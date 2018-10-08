// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.player;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayerAlbumCoverFragment_ViewBinding implements Unbinder {
  private PlayerAlbumCoverFragment target;

  @UiThread
  public PlayerAlbumCoverFragment_ViewBinding(PlayerAlbumCoverFragment target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.player_album_cover_viewpager, "field 'viewPager'", ViewPager.class);
    target.favoriteIcon = Utils.findRequiredViewAsType(source, R.id.player_favorite_icon, "field 'favoriteIcon'", ImageView.class);
    target.lyricsLayout = Utils.findRequiredViewAsType(source, R.id.player_lyrics, "field 'lyricsLayout'", FrameLayout.class);
    target.lyricsLine1 = Utils.findRequiredViewAsType(source, R.id.player_lyrics_line1, "field 'lyricsLine1'", TextView.class);
    target.lyricsLine2 = Utils.findRequiredViewAsType(source, R.id.player_lyrics_line2, "field 'lyricsLine2'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayerAlbumCoverFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.favoriteIcon = null;
    target.lyricsLayout = null;
    target.lyricsLine1 = null;
    target.lyricsLine2 = null;
  }
}
