package com.atdev.modular_architecture.di

import android.app.Application
import com.atdev.news.di.injectAppModule
import com.atdev.news.di.injectDataModule
import com.atdev.news.di.injectPresModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

object AppInjector {

    fun inject(app: Application) {
        startKoin {
            androidContext(app)
        }
        injectAppModule()
        injectDataModule()
        injectPresModules()
    }
}