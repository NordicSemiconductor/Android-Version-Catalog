pluginManagement {
    repositories {
        // No plugins used.
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
