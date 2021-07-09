package com.atdev.core.interactors

import com.atdev.core.entities.news.NewsResponse
import retrofit2.Response

interface INewsRemoteDataSrc {
    suspend fun getNews(): Response<NewsResponse>?
}