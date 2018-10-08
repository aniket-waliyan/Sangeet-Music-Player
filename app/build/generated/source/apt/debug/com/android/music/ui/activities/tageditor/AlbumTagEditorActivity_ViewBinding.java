// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities.tageditor;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumTagEditorActivity_ViewBinding extends AbsTagEditorActivity_ViewBinding {
  private AlbumTagEditorActivity target;

  @UiThread
  public AlbumTagEditorActivity_ViewBinding(AlbumTagEditorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlbumTagEditorActivity_ViewBinding(AlbumTagEditorActivity target, View source) {
    super(target, source);

    this.target = target;

    target.albumTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'albumTitle'", EditText.class);
    target.albumArtist = Utils.findRequiredViewAsType(source, R.id.album_artist, "field 'albumArtist'", EditText.class);
    target.genre = Utils.findRequiredViewAsType(source, R.id.genre, "field 'genre'", EditText.class);
    target.year = Utils.findRequiredViewAsType(source, R.id.year, "field 'year'", EditText.class);
  }

  @Override
  public void unbind() {
    AlbumTagEditorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumTitle = null;
    target.albumArtist = null;
    target.genre = null;
    target.year = null;

    super.unbind();
  }
}
