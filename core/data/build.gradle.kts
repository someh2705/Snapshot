plugins {
    id("snapshot.android.library")
}

android {
    namespace = "com.snapmind.snapshot.core.data"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}
