package com.example.dependencies

object Dependencies {

    private const val kotlinVersion = "1.4.32"

    object Project {
        private const val gradleVersion = "4.1.3"

        const val androidGradlePlugin = "com.android.tools.build:gradle:$gradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object App {

        private const val roomVersion = "2.2.6"
        private const val lifecycleVersion = "2.3.1"
        private const val navigationVersion = "2.3.4"

        object Impl {

            const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
            const val ktx = "androidx.core:core-ktx:1.3.2"
            const val appcompat = "androidx.appcompat:appcompat:1.2.0"
            const val material = "com.google.android.material:material:1.3.0"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
            const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
            const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
            const val room = "androidx.room:room-runtime:$roomVersion"
            const val roomCoroutines = "androidx.room:room-ktx:$roomVersion"
            const val navigation = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
        }

        object Kapt {
            const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        }

        object TestImpl {
            const val junit = "junit:junit:4+"
            const val roomTest = "androidx.room:room-testing:$roomVersion"

        }

        object AndroidTestImpl {
            const val junitExt = "androidx.test.ext:junit:1.1.2"
            const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }
}


