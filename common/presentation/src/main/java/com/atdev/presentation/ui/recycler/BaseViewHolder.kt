package com.atdev.presentation.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import com.atdev.core.IOnItemClickListener

abstract class BaseViewHolder<T>(
    viewGroup: ViewGroup,
    @LayoutRes val layoutRes: Int,
    private val onItemClickListener: IOnItemClickListener
) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(layoutRes, viewGroup, false)
) {

    var item: T? = null
    abstract fun bindView(item: T)

    init {
        itemView.setOnClickListener {
            onItemClickListener.onItemClick(adapterPosition)
        }
    }
    //fun getString(@StringRes resId: Int): String = itemView.context.getString(resId)
}