buildscript {
    dependencies {
        classpath("org.gradle.sample:url-verifier-plugin:1.0")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm") version("1.3.11")
}

apply(plugin = "io.github.remen:code-generation-plugin:latest")

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
