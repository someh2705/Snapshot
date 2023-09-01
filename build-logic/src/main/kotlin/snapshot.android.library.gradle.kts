import com.snapmind.snapshot.configureComposeAndroid
import com.snapmind.snapshot.configureHiltAndroid
import com.snapmind.snapshot.configureKotlinAndroid
import com.snapmind.snapshot.libraryExtension

plugins {
    id("com.android.library")
}

configureKotlinAndroid(libraryExtension)
configureComposeAndroid(libraryExtension)
configureHiltAndroid()