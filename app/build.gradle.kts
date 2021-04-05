import com.example.dependencies.*

plugins {
  id("dependencies")
  id("com.android.application")
  id("kotlin-android")
  id("kotlin-kapt")
}

android {
  compileSdkVersion(GlobalVersions.compileSdkVersion)
  buildToolsVersion(GlobalVersions.buildToolsVersion)

  defaultConfig {
    applicationId(GlobalVersions.applicationId)
    minSdkVersion(GlobalVersions.minSdkVersion)
    targetSdkVersion(GlobalVersions.targetSdkVersion)
    versionCode(GlobalVersions.versionCode)
    versionName(GlobalVersions.versionName)

    testInstrumentationRunner(GlobalVersions.testInstrumentationRunner)
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-tules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = GlobalVersions.jvmTarget
  }
}

dependencies {
  implementation(Dependencies.App.Impl.stdlib)
  implementation(Dependencies.App.Impl.ktx)
  implementation(Dependencies.App.Impl.appcompat)
  implementation(Dependencies.App.Impl.material)
  implementation(Dependencies.App.Impl.constraintLayout)
  implementation(Dependencies.App.Impl.lifecycle)
  implementation(Dependencies.App.Impl.livedata)
  implementation(Dependencies.App.Impl.viewmodel)
  implementation(Dependencies.App.Impl.coroutines)
  implementation(Dependencies.App.Impl.room)
  implementation(Dependencies.App.Impl.roomCoroutines)
  implementation(Dependencies.App.Impl.navigation)
  kapt(Dependencies.App.Kapt.roomCompiler)
  testImplementation(Dependencies.App.TestImpl.junit)
  testImplementation(Dependencies.App.TestImpl.roomTest)
  testImplementation(Dependencies.App.AndroidTestImpl.junitExt)
  testImplementation(Dependencies.App.AndroidTestImpl.espresso)
}