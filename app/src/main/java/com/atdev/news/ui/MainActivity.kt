package com.atdev.news.ui

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.atdev.core.entities.LoadType
import com.atdev.modular_architecture.App
import com.atdev.news.BuildConfig
import com.atdev.news.R
import com.atdev.presentation.ui.BaseActivity
import com.atdev.presentation.vm.NewsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private val newsViewModel: NewsViewModel by viewModel()
    //private lateinit var newsViewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val build = BuildConfig.API_BASE_URL
        Toast.makeText(this, build, Toast.LENGTH_LONG).show()

        getNews()
        newsViewModel.newsResponse().observe(this,
            {
                Toast.makeText(this, "${it?.body()}", Toast.LENGTH_LONG).show()
            })
    }


    private fun getNews() {
       // newsViewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
        newsViewModel.getNews(App.context, LoadType.Remote)
    }
}