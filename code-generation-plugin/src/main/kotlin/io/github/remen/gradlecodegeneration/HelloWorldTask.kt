package io.github.remen.gradlecodegeneration

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class HelloWorldTask : DefaultTask() {
    @TaskAction
    fun taskAction() {
        println("Hello World")
    }
}
