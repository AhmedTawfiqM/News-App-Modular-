package com.atdev.data.repos

import com.atdev.core.entities.LoadType
import com.atdev.core.entities.news.NewsResponse
import com.atdev.core.interactors.INewsRepo
import com.atdev.data.datasources.NewsLocalDataSrc
import com.atdev.data.datasources.NewsRemoteDatSrc
import retrofit2.Response

class NewsRepo(
    private val newsLocalDataSrc: NewsLocalDataSrc,
    private val newsRemoteDatSrc: NewsRemoteDatSrc
) : INewsRepo {

    override suspend fun getData(loadType: LoadType): Response<NewsResponse>? {
        return when (loadType) {
            LoadType.Local -> newsLocalDataSrc.get()
            LoadType.Remote -> newsRemoteDatSrc.getNews()
        }
    }

    override fun postItem() {

    }

    fun save() {
        newsLocalDataSrc.save()
    }

    fun deleteAll() {
        newsLocalDataSrc.delete()
    }
}