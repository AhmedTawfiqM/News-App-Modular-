package com.atdev.presentation.glide

import android.content.Context
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

fun ImageView.load(activity: Context, url: String) {
    Glide.with(activity)
        .load(url)
        .into(this)
}