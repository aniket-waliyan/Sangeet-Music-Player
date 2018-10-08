// Generated code from Butter Knife. Do not modify!
package com.android.music.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import com.triggertrap.seekarc.SeekArc;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SleepTimerDialog_ViewBinding implements Unbinder {
  private SleepTimerDialog target;

  @UiThread
  public SleepTimerDialog_ViewBinding(SleepTimerDialog target, View source) {
    this.target = target;

    target.seekArc = Utils.findRequiredViewAsType(source, R.id.seek_arc, "field 'seekArc'", SeekArc.class);
    target.timerDisplay = Utils.findRequiredViewAsType(source, R.id.timer_display, "field 'timerDisplay'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SleepTimerDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.seekArc = null;
    target.timerDisplay = null;
  }
}
