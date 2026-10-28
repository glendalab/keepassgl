plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.glendalab.keepassgl"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.glendalab.keepassgl"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = true
            }
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.androidx.activity.compose)
}
