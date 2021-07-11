package com.atdev.news.ui.newsactivity

import android.view.ViewGroup
import com.atdev.core.IOnItemClickListener
import com.atdev.core.entities.news.ArticleResponse
import com.atdev.presentation.ui.recycler.BaseRecyclerAdapter
import com.atdev.presentation.ui.recycler.BaseViewHolder

class AdapterNews(val onItemClickListener: IOnItemClickListener) :
    BaseRecyclerAdapter<ArticleResponse, BaseViewHolder<ArticleResponse>>
        (mutableListOf()) {

    private val timelineViewHolderFactory by lazy {
        TimelineViewHolderFactory(this)
    }

    override fun getViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder<ArticleResponse> {
        timelineViewHolderFactory.viewGroup = viewGroup
        return timelineViewHolderFactory.create(viewType)
    }

    override fun getItemViewType(position: Int): Int {
        return when (list[position].type) { //TODO replace
            0 -> 0
            else -> 1
        }
    }
}