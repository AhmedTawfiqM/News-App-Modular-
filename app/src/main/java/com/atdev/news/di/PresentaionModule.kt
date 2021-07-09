package com.atdev.news.di

import com.atdev.presentation.vm.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

fun injectPresModules() = loadPresentationModules

val loadPresentationModules by lazy {
    loadKoinModules(
        listOf(
            newsViewModel
        )
    )
}
val newsViewModel = module {
    viewModel { NewsViewModel(get()) }
}