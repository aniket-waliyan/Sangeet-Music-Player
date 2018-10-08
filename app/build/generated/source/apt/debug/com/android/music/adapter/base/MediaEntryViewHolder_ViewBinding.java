// Generated code from Butter Knife. Do not modify!
package com.android.music.adapter.base;

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

public class MediaEntryViewHolder_ViewBinding implements Unbinder {
  private MediaEntryViewHolder target;

  @UiThread
  public MediaEntryViewHolder_ViewBinding(MediaEntryViewHolder target, View source) {
    this.target = target;

    target.image = Utils.findOptionalViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.imageText = Utils.findOptionalViewAsType(source, R.id.image_text, "field 'imageText'", TextView.class);
    target.title = Utils.findOptionalViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.text = Utils.findOptionalViewAsType(source, R.id.text, "field 'text'", TextView.class);
    target.menu = source.findViewById(R.id.menu);
    target.separator = source.findViewById(R.id.separator);
    target.shortSeparator = source.findViewById(R.id.short_separator);
    target.dragView = source.findViewById(R.id.drag_view);
    target.paletteColorContainer = source.findViewById(R.id.palette_color_container);
  }

  @Override
  @CallSuper
  public void unbind() {
    MediaEntryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.imageText = null;
    target.title = null;
    target.text = null;
    target.menu = null;
    target.separator = null;
    target.shortSeparator = null;
    target.dragView = null;
    target.paletteColorContainer = null;
  }
}
