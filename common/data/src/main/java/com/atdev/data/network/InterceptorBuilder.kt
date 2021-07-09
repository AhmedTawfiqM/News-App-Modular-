package com.atdev.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class InterceptorBuilder(private val tokenInterceptor: TokenInterceptor) {

    fun build() : OkHttpClient{
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY


        val builder = OkHttpClient.Builder()
            .addNetworkInterceptor(loggingInterceptor)
            .addInterceptor(tokenInterceptor)
        return  builder.build()
    }
}