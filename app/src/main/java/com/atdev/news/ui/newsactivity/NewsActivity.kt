package com.atdev.news.ui.newsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atdev.core.entities.LoadType
import com.atdev.core.entities.news.NewsResponse
import com.atdev.modular_architecture.App
import com.atdev.news.R
import com.atdev.presentation.vm.NewsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsActivity : AppCompatActivity() {

    private val newsViewModel: NewsViewModel by viewModel()
    private lateinit var rvTimeLine: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        rvTimeLine = findViewById(R.id.rvTimeLine)

        getNews()
        observeNews()
    }

    private fun observeNews() {
        newsViewModel.newsResponse().observe(this,
            {
                Toast.makeText(this, "${it?.body()}", Toast.LENGTH_LONG).show()
                setupAdapter(it!!.body())
            })
    }

    private fun setupAdapter(body: NewsResponse?) {
        val adapterNews = AdapterNews(AdapterNewsClickListener(this))
        adapterNews.add(body!!.articles)

        rvTimeLine.layoutManager = LinearLayoutManager(this)
        rvTimeLine.adapter = adapterNews
    }

    private fun getNews() {
        newsViewModel.getNews(App.context, LoadType.Remote)
    }
}