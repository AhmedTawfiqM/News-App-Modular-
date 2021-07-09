package com.atdev.data.datamanager

import com.atdev.data.pref.SharedPref

data class DataManager(
    val shared: SharedPref,
    val dataRepos: DataRepos
)