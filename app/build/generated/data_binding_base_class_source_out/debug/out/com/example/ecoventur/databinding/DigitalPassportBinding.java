// Generated by view binder compiler. Do not edit!
package com.example.ecoventur.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecoventur.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DigitalPassportBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView appreciationMessage;

  @NonNull
  public final GridLayout badgeSection;

  @NonNull
  public final ImageView closeButton;

  @NonNull
  public final ImageView cyclingIcon;

  @NonNull
  public final RelativeLayout digitalPassport;

  @NonNull
  public final TextView emailTextView;

  @NonNull
  public final RelativeLayout passportInfoSection;

  @NonNull
  public final RelativeLayout passportTitle;

  @NonNull
  public final LinearLayout personalInfoSection;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final ImageView userImage;

  @NonNull
  public final RelativeLayout userSection;

  @NonNull
  public final TextView usernameTextView;

  private DigitalPassportBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView appreciationMessage, @NonNull GridLayout badgeSection,
      @NonNull ImageView closeButton, @NonNull ImageView cyclingIcon,
      @NonNull RelativeLayout digitalPassport, @NonNull TextView emailTextView,
      @NonNull RelativeLayout passportInfoSection, @NonNull RelativeLayout passportTitle,
      @NonNull LinearLayout personalInfoSection, @NonNull TextView titleTextView,
      @NonNull ImageView userImage, @NonNull RelativeLayout userSection,
      @NonNull TextView usernameTextView) {
    this.rootView = rootView;
    this.appreciationMessage = appreciationMessage;
    this.badgeSection = badgeSection;
    this.closeButton = closeButton;
    this.cyclingIcon = cyclingIcon;
    this.digitalPassport = digitalPassport;
    this.emailTextView = emailTextView;
    this.passportInfoSection = passportInfoSection;
    this.passportTitle = passportTitle;
    this.personalInfoSection = personalInfoSection;
    this.titleTextView = titleTextView;
    this.userImage = userImage;
    this.userSection = userSection;
    this.usernameTextView = usernameTextView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DigitalPassportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DigitalPassportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.digital_passport, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DigitalPassportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appreciationMessage;
      TextView appreciationMessage = ViewBindings.findChildViewById(rootView, id);
      if (appreciationMessage == null) {
        break missingId;
      }

      id = R.id.badgeSection;
      GridLayout badgeSection = ViewBindings.findChildViewById(rootView, id);
      if (badgeSection == null) {
        break missingId;
      }

      id = R.id.closeButton;
      ImageView closeButton = ViewBindings.findChildViewById(rootView, id);
      if (closeButton == null) {
        break missingId;
      }

      id = R.id.cyclingIcon;
      ImageView cyclingIcon = ViewBindings.findChildViewById(rootView, id);
      if (cyclingIcon == null) {
        break missingId;
      }

      RelativeLayout digitalPassport = (RelativeLayout) rootView;

      id = R.id.emailTextView;
      TextView emailTextView = ViewBindings.findChildViewById(rootView, id);
      if (emailTextView == null) {
        break missingId;
      }

      id = R.id.passportInfoSection;
      RelativeLayout passportInfoSection = ViewBindings.findChildViewById(rootView, id);
      if (passportInfoSection == null) {
        break missingId;
      }

      id = R.id.passportTitle;
      RelativeLayout passportTitle = ViewBindings.findChildViewById(rootView, id);
      if (passportTitle == null) {
        break missingId;
      }

      id = R.id.personalInfoSection;
      LinearLayout personalInfoSection = ViewBindings.findChildViewById(rootView, id);
      if (personalInfoSection == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.userImage;
      ImageView userImage = ViewBindings.findChildViewById(rootView, id);
      if (userImage == null) {
        break missingId;
      }

      id = R.id.userSection;
      RelativeLayout userSection = ViewBindings.findChildViewById(rootView, id);
      if (userSection == null) {
        break missingId;
      }

      id = R.id.usernameTextView;
      TextView usernameTextView = ViewBindings.findChildViewById(rootView, id);
      if (usernameTextView == null) {
        break missingId;
      }

      return new DigitalPassportBinding((RelativeLayout) rootView, appreciationMessage,
          badgeSection, closeButton, cyclingIcon, digitalPassport, emailTextView,
          passportInfoSection, passportTitle, personalInfoSection, titleTextView, userImage,
          userSection, usernameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
