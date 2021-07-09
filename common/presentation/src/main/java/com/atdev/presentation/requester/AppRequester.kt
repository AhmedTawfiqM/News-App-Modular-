package com.atdev.presentation.requester

import android.content.Context
import com.atdev.presentation.NetworkVisibility
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AppRequester {


    companion object {

        fun <T> requestCall(context: Context, task: (() -> T)): T? {

            if (!NetworkVisibility.isOnline(context))
                return null  //TODO 'custom login'

            return task.invoke()
        }

        suspend fun <T> request(context: Context, repoCall: suspend () -> T): T? {

            if (!NetworkVisibility.isOnline(context))
                return null  //TODO 'custom login'

            val job = coroutineScope {
                async {
                    repoCall
                }
            }
            println("result starting...")
            val result = job.await()
            job.cancel()

            return result.invoke()
        }
    }

}