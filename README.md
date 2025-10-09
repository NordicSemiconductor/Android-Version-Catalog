# Nordic Version Catalog

Version Catalog with Android libraries by Nordic.

## Usage

Add the following section to *settings.gradle.kt*:
```kotlin
pluginManagement {
    // [...]
    repositories {
        // [...]
        mavenCentral()
    }
}

dependencyResolutionManagement {
    // [...]
    versionCatalogs {
        create("nordic") {
            from("no.nordicsemi.android:version-catalog:<VERSION>")
        }
    }
}
```

Then, use it in your *build.gradle.kts*:
```kotlin
dependencies {
    implementation(nordic.blek.client.android)
    implementation(nordic.mcumgr.ble)
    // [...]
}
```

See full list of libraries in [libs.versions.toml](gradle/libs.versions.toml).