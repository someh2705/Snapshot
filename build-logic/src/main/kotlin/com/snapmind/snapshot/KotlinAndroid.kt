package com.snapmind.snapshot

import com.android.build.api.dsl.CommonExtension
import gradle.kotlin.dsl.accessors._9885c8525475a2a77e0b650bdf1e3c81.check
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.configureKotlinAndroid(extension: CommonExtension<*, *, *, *, *>) {
    with(pluginManager) {
        apply("org.jetbrains.kotlin.android")
        apply("io.gitlab.arturbosch.detekt")
    }

    extension.apply {
        compileSdk = 34

        defaultConfig {
            minSdk = 28

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }

        configureKotlin()

        dependencies {
            implementation(libs.androidx.core)
            implementation(libs.androidx.appcompat)
            implementation(libs.androidx.activity.compose)
            implementation(libs.bundles.coroutines)
            implementation(libs.bundles.lifecycle)
            detektPlugins(libs.detekt.compose)
        }
    }
}

internal fun Project.configureKotlin() {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            // Treat all Kotlin warnings as errors (disabled by default)
            // Override by setting warningsAsErrors=true in your ~/.gradle/gradle.properties
            val warningsAsErrors: String? by project
            allWarningsAsErrors = warningsAsErrors.toBoolean()
            freeCompilerArgs = freeCompilerArgs + listOf(
                "-opt-in=kotlin.RequiresOptIn",
            )
        }
    }
}