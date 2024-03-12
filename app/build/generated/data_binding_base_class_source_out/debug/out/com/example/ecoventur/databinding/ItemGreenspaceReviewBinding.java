// Generated by view binder compiler. Do not edit!
package com.example.ecoventur.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecoventur.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGreenspaceReviewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView IVReviewImage;

  @NonNull
  public final TextView TVReviewDesc;

  @NonNull
  public final TextView TVReviewRating;

  @NonNull
  public final TextView TVReviewTimestamp;

  @NonNull
  public final TextView TVReviewerName;

  private ItemGreenspaceReviewBinding(@NonNull CardView rootView, @NonNull ImageView IVReviewImage,
      @NonNull TextView TVReviewDesc, @NonNull TextView TVReviewRating,
      @NonNull TextView TVReviewTimestamp, @NonNull TextView TVReviewerName) {
    this.rootView = rootView;
    this.IVReviewImage = IVReviewImage;
    this.TVReviewDesc = TVReviewDesc;
    this.TVReviewRating = TVReviewRating;
    this.TVReviewTimestamp = TVReviewTimestamp;
    this.TVReviewerName = TVReviewerName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGreenspaceReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGreenspaceReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_greenspace_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGreenspaceReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.IVReviewImage;
      ImageView IVReviewImage = ViewBindings.findChildViewById(rootView, id);
      if (IVReviewImage == null) {
        break missingId;
      }

      id = R.id.TVReviewDesc;
      TextView TVReviewDesc = ViewBindings.findChildViewById(rootView, id);
      if (TVReviewDesc == null) {
        break missingId;
      }

      id = R.id.TVReviewRating;
      TextView TVReviewRating = ViewBindings.findChildViewById(rootView, id);
      if (TVReviewRating == null) {
        break missingId;
      }

      id = R.id.TVReviewTimestamp;
      TextView TVReviewTimestamp = ViewBindings.findChildViewById(rootView, id);
      if (TVReviewTimestamp == null) {
        break missingId;
      }

      id = R.id.TVReviewerName;
      TextView TVReviewerName = ViewBindings.findChildViewById(rootView, id);
      if (TVReviewerName == null) {
        break missingId;
      }

      return new ItemGreenspaceReviewBinding((CardView) rootView, IVReviewImage, TVReviewDesc,
          TVReviewRating, TVReviewTimestamp, TVReviewerName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
