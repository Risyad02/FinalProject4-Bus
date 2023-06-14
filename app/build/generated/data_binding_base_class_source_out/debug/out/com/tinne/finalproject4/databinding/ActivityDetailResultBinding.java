// Generated by view binder compiler. Do not edit!
package com.tinne.finalproject4.databinding;

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
import com.tinne.finalproject4.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailResultBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnFindNow;

  @NonNull
  public final Button btnSeat;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imgBus;

  @NonNull
  public final ImageView imgGaris;

  @NonNull
  public final ImageView imgsampai;

  @NonNull
  public final LinearLayout lldua;

  @NonNull
  public final LinearLayout llsatu;

  @NonNull
  public final LinearLayout lltiga;

  @NonNull
  public final ImageView loBookNowsmall;

  @NonNull
  public final TextView tvDarimana;

  @NonNull
  public final TextView tvFromTo;

  @NonNull
  public final TextView tvJamDarimana;

  @NonNull
  public final TextView tvJamKemana;

  @NonNull
  public final TextView tvKemana;

  @NonNull
  public final TextView tvKodeBus;

  @NonNull
  public final TextView tvNamaBus;

  @NonNull
  public final TextView tvTerminal;

  @NonNull
  public final TextView tvTerminal1;

  private ActivityDetailResultBinding(@NonNull RelativeLayout rootView, @NonNull Button btnBack,
      @NonNull Button btnFindNow, @NonNull Button btnSeat, @NonNull ImageView imageView,
      @NonNull ImageView imageView3, @NonNull ImageView imgBus, @NonNull ImageView imgGaris,
      @NonNull ImageView imgsampai, @NonNull LinearLayout lldua, @NonNull LinearLayout llsatu,
      @NonNull LinearLayout lltiga, @NonNull ImageView loBookNowsmall, @NonNull TextView tvDarimana,
      @NonNull TextView tvFromTo, @NonNull TextView tvJamDarimana, @NonNull TextView tvJamKemana,
      @NonNull TextView tvKemana, @NonNull TextView tvKodeBus, @NonNull TextView tvNamaBus,
      @NonNull TextView tvTerminal, @NonNull TextView tvTerminal1) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnFindNow = btnFindNow;
    this.btnSeat = btnSeat;
    this.imageView = imageView;
    this.imageView3 = imageView3;
    this.imgBus = imgBus;
    this.imgGaris = imgGaris;
    this.imgsampai = imgsampai;
    this.lldua = lldua;
    this.llsatu = llsatu;
    this.lltiga = lltiga;
    this.loBookNowsmall = loBookNowsmall;
    this.tvDarimana = tvDarimana;
    this.tvFromTo = tvFromTo;
    this.tvJamDarimana = tvJamDarimana;
    this.tvJamKemana = tvJamKemana;
    this.tvKemana = tvKemana;
    this.tvKodeBus = tvKodeBus;
    this.tvNamaBus = tvNamaBus;
    this.tvTerminal = tvTerminal;
    this.tvTerminal1 = tvTerminal1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      Button btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnFindNow;
      Button btnFindNow = ViewBindings.findChildViewById(rootView, id);
      if (btnFindNow == null) {
        break missingId;
      }

      id = R.id.btnSeat;
      Button btnSeat = ViewBindings.findChildViewById(rootView, id);
      if (btnSeat == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imgBus;
      ImageView imgBus = ViewBindings.findChildViewById(rootView, id);
      if (imgBus == null) {
        break missingId;
      }

      id = R.id.imgGaris;
      ImageView imgGaris = ViewBindings.findChildViewById(rootView, id);
      if (imgGaris == null) {
        break missingId;
      }

      id = R.id.imgsampai;
      ImageView imgsampai = ViewBindings.findChildViewById(rootView, id);
      if (imgsampai == null) {
        break missingId;
      }

      id = R.id.lldua;
      LinearLayout lldua = ViewBindings.findChildViewById(rootView, id);
      if (lldua == null) {
        break missingId;
      }

      id = R.id.llsatu;
      LinearLayout llsatu = ViewBindings.findChildViewById(rootView, id);
      if (llsatu == null) {
        break missingId;
      }

      id = R.id.lltiga;
      LinearLayout lltiga = ViewBindings.findChildViewById(rootView, id);
      if (lltiga == null) {
        break missingId;
      }

      id = R.id.loBookNowsmall;
      ImageView loBookNowsmall = ViewBindings.findChildViewById(rootView, id);
      if (loBookNowsmall == null) {
        break missingId;
      }

      id = R.id.tvDarimana;
      TextView tvDarimana = ViewBindings.findChildViewById(rootView, id);
      if (tvDarimana == null) {
        break missingId;
      }

      id = R.id.tvFromTo;
      TextView tvFromTo = ViewBindings.findChildViewById(rootView, id);
      if (tvFromTo == null) {
        break missingId;
      }

      id = R.id.tvJamDarimana;
      TextView tvJamDarimana = ViewBindings.findChildViewById(rootView, id);
      if (tvJamDarimana == null) {
        break missingId;
      }

      id = R.id.tvJamKemana;
      TextView tvJamKemana = ViewBindings.findChildViewById(rootView, id);
      if (tvJamKemana == null) {
        break missingId;
      }

      id = R.id.tvKemana;
      TextView tvKemana = ViewBindings.findChildViewById(rootView, id);
      if (tvKemana == null) {
        break missingId;
      }

      id = R.id.tvKodeBus;
      TextView tvKodeBus = ViewBindings.findChildViewById(rootView, id);
      if (tvKodeBus == null) {
        break missingId;
      }

      id = R.id.tvNamaBus;
      TextView tvNamaBus = ViewBindings.findChildViewById(rootView, id);
      if (tvNamaBus == null) {
        break missingId;
      }

      id = R.id.tvTerminal;
      TextView tvTerminal = ViewBindings.findChildViewById(rootView, id);
      if (tvTerminal == null) {
        break missingId;
      }

      id = R.id.tvTerminal1;
      TextView tvTerminal1 = ViewBindings.findChildViewById(rootView, id);
      if (tvTerminal1 == null) {
        break missingId;
      }

      return new ActivityDetailResultBinding((RelativeLayout) rootView, btnBack, btnFindNow,
          btnSeat, imageView, imageView3, imgBus, imgGaris, imgsampai, lldua, llsatu, lltiga,
          loBookNowsmall, tvDarimana, tvFromTo, tvJamDarimana, tvJamKemana, tvKemana, tvKodeBus,
          tvNamaBus, tvTerminal, tvTerminal1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}