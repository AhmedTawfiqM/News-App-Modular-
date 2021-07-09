package com.atdev.data.datasources

import com.atdev.core.entities.news.NewsResponse
import com.atdev.core.interactors.INewsRemoteDataSrc
import com.atdev.data.apiservice.NewsApiService
import retrofit2.Response

class NewsRemoteDatSrc(val api: NewsApiService) : INewsRemoteDataSrc {

    override suspend fun getNews(): Response<NewsResponse>? {
        return api.getNews()
    }
}