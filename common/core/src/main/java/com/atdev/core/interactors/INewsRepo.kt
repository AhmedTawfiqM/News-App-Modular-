package com.atdev.core.interactors

import com.atdev.core.entities.LoadType
import com.atdev.core.entities.news.NewsResponse
import retrofit2.Response

interface INewsRepo {
    fun postItem()
    suspend fun getData(loadType: LoadType): Response<NewsResponse>?
}