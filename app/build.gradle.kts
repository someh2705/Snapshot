plugins {
    id("snapshot.android.application")
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