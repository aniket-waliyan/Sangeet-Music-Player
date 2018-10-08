// Generated code from Butter Knife. Do not modify!
package com.android.music.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumCoverPagerAdapter$AlbumCoverFragment_ViewBinding implements Unbinder {
  private AlbumCoverPagerAdapter.AlbumCoverFragment target;

  @UiThread
  public AlbumCoverPagerAdapter$AlbumCoverFragment_ViewBinding(AlbumCoverPagerAdapter.AlbumCoverFragment target,
      View source) {
    this.target = target;

    target.albumCover = Utils.findRequiredViewAsType(source, R.id.player_image, "field 'albumCover'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumCoverPagerAdapter.AlbumCoverFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumCover = null;
  }
}
