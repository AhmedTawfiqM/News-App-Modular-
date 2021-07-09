package com.atdev.modular_architecture

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.annotation.StringRes
import com.atdev.modular_architecture.di.AppInjector

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
        AppInjector.inject(this)
    }

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        @JvmStatic
        fun string(@StringRes res: Int): String {
            return context.getString(res)
        }

    }
}