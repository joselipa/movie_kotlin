// Generated by view binder compiler. Do not edit!
package com.example.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.movies.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout cardMovie;

  @NonNull
  public final CollapsingToolbarLayout collapsing;

  @NonNull
  public final ImageView imageDetail;

  @NonNull
  public final ImageView imagePost;

  @NonNull
  public final TextView originalTitle;

  @NonNull
  public final TextView overview;

  @NonNull
  public final RecyclerView recycleCharacter;

  @NonNull
  public final TextView title;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView value;

  private ActivityDetailBinding(@NonNull CoordinatorLayout rootView, @NonNull AppBarLayout appbar,
      @NonNull LinearLayout cardMovie, @NonNull CollapsingToolbarLayout collapsing,
      @NonNull ImageView imageDetail, @NonNull ImageView imagePost, @NonNull TextView originalTitle,
      @NonNull TextView overview, @NonNull RecyclerView recycleCharacter, @NonNull TextView title,
      @NonNull Toolbar toolbar, @NonNull TextView value) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.cardMovie = cardMovie;
    this.collapsing = collapsing;
    this.imageDetail = imageDetail;
    this.imagePost = imagePost;
    this.originalTitle = originalTitle;
    this.overview = overview;
    this.recycleCharacter = recycleCharacter;
    this.title = title;
    this.toolbar = toolbar;
    this.value = value;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.cardMovie;
      LinearLayout cardMovie = ViewBindings.findChildViewById(rootView, id);
      if (cardMovie == null) {
        break missingId;
      }

      id = R.id.collapsing;
      CollapsingToolbarLayout collapsing = ViewBindings.findChildViewById(rootView, id);
      if (collapsing == null) {
        break missingId;
      }

      id = R.id.imageDetail;
      ImageView imageDetail = ViewBindings.findChildViewById(rootView, id);
      if (imageDetail == null) {
        break missingId;
      }

      id = R.id.imagePost;
      ImageView imagePost = ViewBindings.findChildViewById(rootView, id);
      if (imagePost == null) {
        break missingId;
      }

      id = R.id.original_title;
      TextView originalTitle = ViewBindings.findChildViewById(rootView, id);
      if (originalTitle == null) {
        break missingId;
      }

      id = R.id.overview;
      TextView overview = ViewBindings.findChildViewById(rootView, id);
      if (overview == null) {
        break missingId;
      }

      id = R.id.recycleCharacter;
      RecyclerView recycleCharacter = ViewBindings.findChildViewById(rootView, id);
      if (recycleCharacter == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.value;
      TextView value = ViewBindings.findChildViewById(rootView, id);
      if (value == null) {
        break missingId;
      }

      return new ActivityDetailBinding((CoordinatorLayout) rootView, appbar, cardMovie, collapsing,
          imageDetail, imagePost, originalTitle, overview, recycleCharacter, title, toolbar, value);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
