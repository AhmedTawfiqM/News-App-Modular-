package com.atdev.news.ui.newsactivity

import android.view.ViewGroup
import com.atdev.core.entities.news.ArticleResponse
import com.atdev.news.ui.NewsViewHolderV1
import com.atdev.presentation.ui.recycler.BaseViewHolder

class TimelineViewHolderFactory(private val adapterNews: AdapterNews) {

    lateinit var viewGroup: ViewGroup

    fun create(viewType: Int): BaseViewHolder<ArticleResponse> {
        return NewsViewHolderV1(viewGroup, adapterNews.onItemClickListener)
    }
}