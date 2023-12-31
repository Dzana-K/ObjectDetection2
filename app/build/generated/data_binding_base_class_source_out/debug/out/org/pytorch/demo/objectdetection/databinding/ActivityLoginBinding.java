// Generated by view binder compiler. Do not edit!
package org.pytorch.demo.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.pytorch.demo.objectdetection.R;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout contentLayout;

  @NonNull
  public final EditText emailField;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final LinearLayout loginLayout;

  @NonNull
  public final ImageView myImageView;

  @NonNull
  public final EditText passwordField;

  @NonNull
  public final TextView registerLink;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout contentLayout,
      @NonNull EditText emailField, @NonNull Button loginButton, @NonNull LinearLayout loginLayout,
      @NonNull ImageView myImageView, @NonNull EditText passwordField,
      @NonNull TextView registerLink) {
    this.rootView = rootView;
    this.contentLayout = contentLayout;
    this.emailField = emailField;
    this.loginButton = loginButton;
    this.loginLayout = loginLayout;
    this.myImageView = myImageView;
    this.passwordField = passwordField;
    this.registerLink = registerLink;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content_layout;
      LinearLayout contentLayout = rootView.findViewById(id);
      if (contentLayout == null) {
        break missingId;
      }

      id = R.id.email_field;
      EditText emailField = rootView.findViewById(id);
      if (emailField == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = rootView.findViewById(id);
      if (loginButton == null) {
        break missingId;
      }

      LinearLayout loginLayout = (LinearLayout) rootView;

      id = R.id.my_image_view;
      ImageView myImageView = rootView.findViewById(id);
      if (myImageView == null) {
        break missingId;
      }

      id = R.id.password_field;
      EditText passwordField = rootView.findViewById(id);
      if (passwordField == null) {
        break missingId;
      }

      id = R.id.register_link;
      TextView registerLink = rootView.findViewById(id);
      if (registerLink == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, contentLayout, emailField,
          loginButton, loginLayout, myImageView, passwordField, registerLink);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
