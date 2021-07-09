package com.atdev.presentation.vm

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.atdev.core.entities.LoadType
import com.atdev.core.entities.news.NewsResponse
import com.atdev.data.datamanager.DataManager
import com.atdev.presentation.ui.BaseViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(dataManager: DataManager) : BaseViewModel(dataManager) {

    private val newsResponse = MutableLiveData<Response<NewsResponse>?>()

    fun getNews(context: Context, loadType: LoadType) {
        GlobalScope.launch {
            newsResponse.postValue(
                request(context) {
                    dm.dataRepos.newsRepo.getData(loadType)
                }
            )
        }
    }

    fun newsResponse() = newsResponse
}