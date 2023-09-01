plugins {
    id("snapshot.android.library")
}

android {
    namespace = "com.snapmind.snapshot.core.design"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}
