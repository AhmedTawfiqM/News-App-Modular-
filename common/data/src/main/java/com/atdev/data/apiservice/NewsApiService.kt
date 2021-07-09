package com.atdev.data.apiservice

import com.atdev.core.entities.news.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsApiService {

    @GET("everything")
   suspend fun getNews(): Response<NewsResponse>?
}