// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.fragments.player.flat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FlatPlayerPlaybackControlsFragment_ViewBinding implements Unbinder {
  private FlatPlayerPlaybackControlsFragment target;

  @UiThread
  public FlatPlayerPlaybackControlsFragment_ViewBinding(FlatPlayerPlaybackControlsFragment target,
      View source) {
    this.target = target;

    target.playPauseButton = Utils.findRequiredViewAsType(source, R.id.player_play_pause__button, "field 'playPauseButton'", ImageButton.class);
    target.prevButton = Utils.findRequiredViewAsType(source, R.id.player_prev_button, "field 'prevButton'", ImageButton.class);
    target.nextButton = Utils.findRequiredViewAsType(source, R.id.player_next_button, "field 'nextButton'", ImageButton.class);
    target.repeatButton = Utils.findRequiredViewAsType(source, R.id.player_repeat_button, "field 'repeatButton'", ImageButton.class);
    target.shuffleButton = Utils.findRequiredViewAsType(source, R.id.player_shuffle_button, "field 'shuffleButton'", ImageButton.class);
    target.progressSlider = Utils.findRequiredViewAsType(source, R.id.player_progress_slider, "field 'progressSlider'", SeekBar.class);
    target.songTotalTime = Utils.findRequiredViewAsType(source, R.id.player_song_total_time, "field 'songTotalTime'", TextView.class);
    target.songCurrentProgress = Utils.findRequiredViewAsType(source, R.id.player_song_current_progress, "field 'songCurrentProgress'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FlatPlayerPlaybackControlsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.playPauseButton = null;
    target.prevButton = null;
    target.nextButton = null;
    target.repeatButton = null;
    target.shuffleButton = null;
    target.progressSlider = null;
    target.songTotalTime = null;
    target.songCurrentProgress = null;
  }
}
