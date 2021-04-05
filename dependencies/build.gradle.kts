plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "com.example.dependencies.DependenciesPlugin"
    }
}