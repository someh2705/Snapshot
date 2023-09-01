import com.snapmind.snapshot.applicationExtension
import com.snapmind.snapshot.configureComposeAndroid
import com.snapmind.snapshot.configureHiltAndroid
import com.snapmind.snapshot.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid(applicationExtension)
configureComposeAndroid(applicationExtension)
configureHiltAndroid()