buildscript {
    dependencies {
        classpath("io.github.remen:code-generation-plugin:latest")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm") version("1.3.11")
}

apply(plugin = "codegeneration-example-plugin")

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
