package com.atdev

import android.util.Log

fun log(msg: String) {
    Log.e("DEBUG", msg)
}

fun log(clazz: Class<Any>, msg: String) {
    Log.e(clazz.simpleName, msg)
}