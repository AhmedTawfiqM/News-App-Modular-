package com.atdev.news.ui

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.atdev.core.IOnItemClickListener
import com.atdev.core.entities.news.ArticleResponse
import com.atdev.core.entities.news.NewsResponse
import com.atdev.news.R
import com.atdev.presentation.glide.load
import com.atdev.presentation.ui.recycler.BaseViewHolder

class NewsViewHolder(
    view: View,
    private val iOnItemClickListener: IOnItemClickListener
) : RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {
            iOnItemClickListener.onItemClick(adapterPosition)
        }

    }
}

class NewsViewHolderV1(
    viewGroup: ViewGroup,
    iOnItemClickListener: IOnItemClickListener
) : BaseViewHolder<ArticleResponse>(
    viewGroup,
    R.layout.single_new,
    iOnItemClickListener
) {

    private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    private val ivArticle = itemView.findViewById<ImageView>(R.id.ivArticle)

    override fun bindView(item: ArticleResponse) {
        tvTitle.text = item.title
        ivArticle.load(itemView.context, item.urlToImage)
    }
}