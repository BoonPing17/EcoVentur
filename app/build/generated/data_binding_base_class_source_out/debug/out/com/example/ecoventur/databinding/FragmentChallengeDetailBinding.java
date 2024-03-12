// Generated by view binder compiler. Do not edit!
package com.example.ecoventur.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecoventur.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChallengeDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RoundedImageView challengeImage;

  @NonNull
  public final LinearLayout challengeOverview;

  @NonNull
  public final TextView challengeTitle;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView ecocoins;

  @NonNull
  public final ImageView ecocoinsImage;

  @NonNull
  public final Button joinButton;

  @NonNull
  public final TextView rule1;

  @NonNull
  public final TextView rule2;

  @NonNull
  public final TextView rule3;

  @NonNull
  public final TextView rules;

  private FragmentChallengeDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull RoundedImageView challengeImage, @NonNull LinearLayout challengeOverview,
      @NonNull TextView challengeTitle, @NonNull TextView date, @NonNull TextView description,
      @NonNull TextView ecocoins, @NonNull ImageView ecocoinsImage, @NonNull Button joinButton,
      @NonNull TextView rule1, @NonNull TextView rule2, @NonNull TextView rule3,
      @NonNull TextView rules) {
    this.rootView = rootView;
    this.challengeImage = challengeImage;
    this.challengeOverview = challengeOverview;
    this.challengeTitle = challengeTitle;
    this.date = date;
    this.description = description;
    this.ecocoins = ecocoins;
    this.ecocoinsImage = ecocoinsImage;
    this.joinButton = joinButton;
    this.rule1 = rule1;
    this.rule2 = rule2;
    this.rule3 = rule3;
    this.rules = rules;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChallengeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChallengeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_challenge_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChallengeDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.challengeImage;
      RoundedImageView challengeImage = ViewBindings.findChildViewById(rootView, id);
      if (challengeImage == null) {
        break missingId;
      }

      id = R.id.challengeOverview;
      LinearLayout challengeOverview = ViewBindings.findChildViewById(rootView, id);
      if (challengeOverview == null) {
        break missingId;
      }

      id = R.id.challengeTitle;
      TextView challengeTitle = ViewBindings.findChildViewById(rootView, id);
      if (challengeTitle == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.ecocoins;
      TextView ecocoins = ViewBindings.findChildViewById(rootView, id);
      if (ecocoins == null) {
        break missingId;
      }

      id = R.id.ecocoinsImage;
      ImageView ecocoinsImage = ViewBindings.findChildViewById(rootView, id);
      if (ecocoinsImage == null) {
        break missingId;
      }

      id = R.id.joinButton;
      Button joinButton = ViewBindings.findChildViewById(rootView, id);
      if (joinButton == null) {
        break missingId;
      }

      id = R.id.rule1;
      TextView rule1 = ViewBindings.findChildViewById(rootView, id);
      if (rule1 == null) {
        break missingId;
      }

      id = R.id.rule2;
      TextView rule2 = ViewBindings.findChildViewById(rootView, id);
      if (rule2 == null) {
        break missingId;
      }

      id = R.id.rule3;
      TextView rule3 = ViewBindings.findChildViewById(rootView, id);
      if (rule3 == null) {
        break missingId;
      }

      id = R.id.rules;
      TextView rules = ViewBindings.findChildViewById(rootView, id);
      if (rules == null) {
        break missingId;
      }

      return new FragmentChallengeDetailBinding((RelativeLayout) rootView, challengeImage,
          challengeOverview, challengeTitle, date, description, ecocoins, ecocoinsImage, joinButton,
          rule1, rule2, rule3, rules);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
