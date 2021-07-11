package com.atdev.news.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atdev.core.entities.LoadType
import com.atdev.core.entities.news.NewsResponse
import com.atdev.modular_architecture.App
import com.atdev.news.BuildConfig
import com.atdev.news.R
import com.atdev.news.ui.newsactivity.AdapterNews
import com.atdev.news.ui.newsactivity.AdapterNewsClickListener
import com.atdev.news.ui.newsactivity.NewsActivity
import com.atdev.presentation.ui.BaseActivity
import com.atdev.presentation.vm.NewsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("API_BASE_URL", BuildConfig.API_BASE_URL)
    }

    fun onClickShowNews(view: View) {
        startActivity(Intent(this, NewsActivity::class.java))
    }
}