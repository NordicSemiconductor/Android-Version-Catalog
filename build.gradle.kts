// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

apply(from = rootProject.file("gradle/publish-root.gradle"))