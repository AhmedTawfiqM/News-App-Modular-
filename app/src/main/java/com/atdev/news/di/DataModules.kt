package com.atdev.news.di

import com.atdev.data.apiservice.NewsApiService
import com.atdev.data.datamanager.DataManager
import com.atdev.data.datamanager.DataRepos
import com.atdev.data.datasources.NewsLocalDataSrc
import com.atdev.data.datasources.NewsRemoteDatSrc
import com.atdev.data.network.InterceptorBuilder
import com.atdev.data.network.TokenInterceptor
import com.atdev.data.network.RetrofitHelper
import com.atdev.data.pref.SharedPref
import com.atdev.data.repos.NewsRepo
import com.atdev.news.BuildConfig
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

fun injectDataModule() = loadDataModules

val loadDataModules by lazy {
    loadKoinModules(
        listOf(
            okHttpModule,
            newsModule,
            dataManager
        )
    )
}

val dataManager = module {
    single { DataManager(shared = get(), dataRepos = get()) }
    single { SharedPref() }
    single { DataRepos(newsRepo = get()) }
}

val okHttpModule = module {
    single { TokenInterceptor() }
    single {
        InterceptorBuilder(get()).build()
    }
}

val newsModule = module {
    single {
        RetrofitHelper.createService(BuildConfig.API_BASE_URL, get(), NewsApiService::class.java)
    }
    factory { NewsLocalDataSrc() }
    factory { NewsRemoteDatSrc(api = get()) }
    factory {
        NewsRepo(newsLocalDataSrc = get(), newsRemoteDatSrc = get())
    }
}
