// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutActivity_ViewBinding implements Unbinder {
  private AboutActivity target;

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.appVersion = Utils.findRequiredViewAsType(source, R.id.app_version, "field 'appVersion'", TextView.class);
    target.intro = Utils.findRequiredViewAsType(source, R.id.intro, "field 'intro'", LinearLayout.class);
    target.writeAnEmail = Utils.findRequiredViewAsType(source, R.id.write_an_email, "field 'writeAnEmail'", LinearLayout.class);
    target.forkOnGitHub = Utils.findRequiredViewAsType(source, R.id.fork_on_github, "field 'forkOnGitHub'", LinearLayout.class);
    target.donate = Utils.findRequiredViewAsType(source, R.id.donate, "field 'donate'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.appVersion = null;
    target.intro = null;
    target.writeAnEmail = null;
    target.forkOnGitHub = null;
    target.donate = null;
  }
}
