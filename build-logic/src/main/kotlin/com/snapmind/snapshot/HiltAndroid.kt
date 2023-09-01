package com.snapmind.snapshot

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureHiltAndroid() {
    with(pluginManager) {
        apply("dagger.hilt.android.plugin")
        apply("com.google.devtools.ksp")
    }

    dependencies {
        implementation(libs.hilt.android)
        ksp(libs.hilt.android.compiler)
    }
}