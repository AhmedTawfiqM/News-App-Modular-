package dependencies

import Versions

object Deps {
    const val kotlin_jetbrains = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val android_core = "androidx.core:core-ktx:${Versions.androidx_core}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
    const val android_material = "com.google.android.material:material:${Versions.android_material}"
    const val androidx_constraint =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint}"

    // retrofit
    const val retrofit_runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofit_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val gson_google = "com.google.code.gson:gson:${Versions.gson}"

    //okHttp
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"

    //coroutines
    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_core}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_core}"

    //koin
    const val koin = "io.insert-koin:koin-android:${Versions.koin}"
}

