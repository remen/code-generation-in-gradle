package io.github.remen.codegeneration

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class CodeGenerationTask : DefaultTask() {
    @TaskAction
    fun run() {
        println("Hello World")
    }
}
