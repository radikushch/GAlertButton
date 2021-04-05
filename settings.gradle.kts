pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }
}
includeBuild("dependencies")
include(":app")
rootProject.name = "GAlertButton"