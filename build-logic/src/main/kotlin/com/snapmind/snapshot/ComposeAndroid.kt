package com.snapmind.snapshot

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureComposeAndroid(extension: CommonExtension<*, *, *, *, *>) {
    extension.apply {
        buildFeatures {
            compose = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = "1.5.3"
        }

        dependencies {
            implementation(platform(libs.compose.bom))
            implementation(libs.bundles.compose)
            implementation(libs.compose.preview)
            debugImplementation(libs.bundles.compose.debug)
        }
    }
}