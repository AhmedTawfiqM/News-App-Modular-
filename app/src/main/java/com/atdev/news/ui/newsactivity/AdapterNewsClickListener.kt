package com.atdev.news.ui.newsactivity

import androidx.appcompat.app.AppCompatActivity
import com.atdev.core.IOnItemClickListener
import com.atdev.presentation.ui.notify.AppToast

class AdapterNewsClickListener(private val activity: AppCompatActivity) :
    IOnItemClickListener {

    private val appToast = AppToast()

    override fun onItemClick(position: Int) {
        appToast.showLong(activity, "Clicked: $position")
    }
}