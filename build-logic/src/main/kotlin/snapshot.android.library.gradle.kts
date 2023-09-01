import com.snapmind.snapshot.configureComposeAndroid
import com.snapmind.snapshot.configureHiltAndroid
import com.snapmind.snapshot.configureKotlinAndroid
import com.snapmind.snapshot.libraryExtension

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

configureKotlinAndroid(libraryExtension)
configureComposeAndroid(libraryExtension)
configureHiltAndroid()