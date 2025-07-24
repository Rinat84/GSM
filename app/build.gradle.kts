plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.tomilov.gsm"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.tomilov.gsm"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isJniDebuggable =false
            isShrinkResources =true
            isDebuggable = false
            isRenderscriptDebuggable = false
            renderscriptOptimLevel = 3
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            packaging {
                resources.excludes.addAll(
                    listOf(
                        "**/*.kotlin_metadata",
                        "DebugProbesKt.bin",
                        "META-INF/*.kotlin_module",
                        "META-INF/*.version",
                        "META-INF/android.arch**",
                        "META-INF/androidx**",
                        "META-INF/com.android**",
                        "META-INF/com.google.android.material_material.version",
                        "META-INF/com.google.dagger_dagger.version",
                        "build-data.properties",
                        "core.properties",
                        "firebase-**.properties",
                        "kotlin-tooling-metadata.json",
                        "kotlin/**",
                        "play-services-**.properties",
                        "protolite-well-known-types.properties",
                        "transport-api.properties",
                        "transport-backend-cct.properties",
                        "transport-runtime.properties"
                    )
                )
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}