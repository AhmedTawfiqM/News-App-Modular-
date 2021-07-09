package dependencies

import Versions

object TestDeps {
    const  val junit = "junit:junit:${Versions.junit}"
    const  val ext_junit = "androidx.test.ext:junit:${Versions.junit_ext}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}