package com.atdev.data.network

import com.atdev.data.Api_KEY
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        val url = request.url.newBuilder()
            .addQueryParameter("q", "tesla")
            .addQueryParameter("apikey", Api_KEY)
            .build()

        request = request.newBuilder()
            .url(url)
            //.removeHeader("User-Agent")
            //.addHeader("User-Agent", "Mozilla/5.0.....")
            .build()

        return chain.proceed(request)
    }
}