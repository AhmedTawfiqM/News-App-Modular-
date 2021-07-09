package com.atdev.presentation.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import com.atdev.data.datamanager.DataManager
import com.atdev.presentation.requester.AppRequester

open class BaseViewModel(val dm: DataManager) : ViewModel() {

    suspend fun <T> request(context: Context, task: (suspend () -> T)): T? {
        return AppRequester.request(context, task)
    }

    override fun onCleared() {
        super.onCleared()
    }
}