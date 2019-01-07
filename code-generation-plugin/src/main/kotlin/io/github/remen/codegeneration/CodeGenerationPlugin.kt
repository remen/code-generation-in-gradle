package io.github.remen.codegeneration

import org.gradle.api.Plugin
import org.gradle.api.Project

class CodeGenerationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("hello", CodeGenerationTask::class.java)
    }
}
