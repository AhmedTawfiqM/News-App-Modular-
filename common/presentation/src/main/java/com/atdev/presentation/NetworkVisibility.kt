package com.atdev.presentation

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager

class NetworkVisibility {

    companion object{

        fun isOnline(context: Context) : Boolean{
            val cm =  context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            return netInfo != null && netInfo.isConnectedOrConnecting
        }
    }

}