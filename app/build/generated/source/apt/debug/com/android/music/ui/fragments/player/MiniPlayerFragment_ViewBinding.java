// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.player;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public class MiniPlayerFragment_ViewBinding implements Unbinder {
  private MiniPlayerFragment target;

  @UiThread
  public MiniPlayerFragment_ViewBinding(MiniPlayerFragment target, View source) {
    this.target = target;

    target.miniPlayerTitle = Utils.findRequiredViewAsType(source, R.id.mini_player_title, "field 'miniPlayerTitle'", TextView.class);
    target.miniPlayerPlayPauseButton = Utils.findRequiredViewAsType(source, R.id.mini_player_play_pause_button, "field 'miniPlayerPlayPauseButton'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", MaterialProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MiniPlayerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.miniPlayerTitle = null;
    target.miniPlayerPlayPauseButton = null;
    target.progressBar = null;
  }
}
