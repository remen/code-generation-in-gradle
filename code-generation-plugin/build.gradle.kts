plugins {
    `java-gradle-plugin`
    id("org.jetbrains.kotlin.jvm") version("1.3.11")
}

group = "io.github.remen"
version = "latest"

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
