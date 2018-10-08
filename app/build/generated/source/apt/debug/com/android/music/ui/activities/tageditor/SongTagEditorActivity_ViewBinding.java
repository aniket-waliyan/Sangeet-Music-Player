// Generated code from Butter Knife. Do not modify!
package com.android.music.ui.activities.tageditor;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.internal.Utils;
import com.android.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SongTagEditorActivity_ViewBinding extends AbsTagEditorActivity_ViewBinding {
  private SongTagEditorActivity target;

  @UiThread
  public SongTagEditorActivity_ViewBinding(SongTagEditorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SongTagEditorActivity_ViewBinding(SongTagEditorActivity target, View source) {
    super(target, source);

    this.target = target;

    target.songTitle = Utils.findRequiredViewAsType(source, R.id.title1, "field 'songTitle'", EditText.class);
    target.albumTitle = Utils.findRequiredViewAsType(source, R.id.title2, "field 'albumTitle'", EditText.class);
    target.artist = Utils.findRequiredViewAsType(source, R.id.artist, "field 'artist'", EditText.class);
    target.genre = Utils.findRequiredViewAsType(source, R.id.genre, "field 'genre'", EditText.class);
    target.year = Utils.findRequiredViewAsType(source, R.id.year, "field 'year'", EditText.class);
    target.songNumber = Utils.findRequiredViewAsType(source, R.id.image_text, "field 'songNumber'", EditText.class);
    target.lyrics = Utils.findRequiredViewAsType(source, R.id.lyrics, "field 'lyrics'", EditText.class);
  }

  @Override
  public void unbind() {
    SongTagEditorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.songTitle = null;
    target.albumTitle = null;
    target.artist = null;
    target.genre = null;
    target.year = null;
    target.songNumber = null;
    target.lyrics = null;

    super.unbind();
  }
}
