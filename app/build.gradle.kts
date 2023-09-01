plugins {
    id("snapshot.android.application")
    alias(libs.plugins.detekt)
}

android {
    namespace = "com.snapmind.snapshot"

    defaultConfig {
        applicationId = "com.snapmind.snapshot"
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.core.data)
}