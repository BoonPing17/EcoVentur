// Generated by view binder compiler. Do not edit!
package com.example.ecoventur.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecoventur.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditProfilePictureBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backprofile;

  @NonNull
  public final Button btnApplyChanges;

  @NonNull
  public final Button btnChoosePhoto;

  @NonNull
  public final Button btnRemovePhoto;

  @NonNull
  public final Button btnTakePhoto;

  @NonNull
  public final ImageView picture;

  private ActivityEditProfilePictureBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView backprofile, @NonNull Button btnApplyChanges,
      @NonNull Button btnChoosePhoto, @NonNull Button btnRemovePhoto, @NonNull Button btnTakePhoto,
      @NonNull ImageView picture) {
    this.rootView = rootView;
    this.backprofile = backprofile;
    this.btnApplyChanges = btnApplyChanges;
    this.btnChoosePhoto = btnChoosePhoto;
    this.btnRemovePhoto = btnRemovePhoto;
    this.btnTakePhoto = btnTakePhoto;
    this.picture = picture;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditProfilePictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_profile_picture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditProfilePictureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backprofile;
      ImageView backprofile = ViewBindings.findChildViewById(rootView, id);
      if (backprofile == null) {
        break missingId;
      }

      id = R.id.btnApplyChanges;
      Button btnApplyChanges = ViewBindings.findChildViewById(rootView, id);
      if (btnApplyChanges == null) {
        break missingId;
      }

      id = R.id.btnChoosePhoto;
      Button btnChoosePhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnChoosePhoto == null) {
        break missingId;
      }

      id = R.id.btnRemovePhoto;
      Button btnRemovePhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnRemovePhoto == null) {
        break missingId;
      }

      id = R.id.btnTakePhoto;
      Button btnTakePhoto = ViewBindings.findChildViewById(rootView, id);
      if (btnTakePhoto == null) {
        break missingId;
      }

      id = R.id.picture;
      ImageView picture = ViewBindings.findChildViewById(rootView, id);
      if (picture == null) {
        break missingId;
      }

      return new ActivityEditProfilePictureBinding((LinearLayout) rootView, backprofile,
          btnApplyChanges, btnChoosePhoto, btnRemovePhoto, btnTakePhoto, picture);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
