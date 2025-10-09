pluginManagement {
    repositories {
        mavenCentral()
        exclusiveContent {
            forRepository { gradlePluginPortal() }
            filter {
                includeGroupAndSubgroups("com.gradle")
                includeGroupAndSubgroups("no.nordicsemi")
                includeGroupAndSubgroups("org.jetbrains")
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "Version Catalog"

include(":bom")
include(":version-catalog")
