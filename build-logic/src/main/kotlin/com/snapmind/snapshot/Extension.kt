package com.snapmind.snapshot

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.the

internal val Project.applicationExtension: CommonExtension<*, *, *, *, *>
    get() = extensions.getByType<ApplicationExtension>()

internal val Project.libraryExtension: CommonExtension<*, *, *, *, *>
    get() = extensions.getByType<LibraryExtension>()

internal val Project.libs: LibrariesForLibs
    get() = the<LibrariesForLibs>()

fun DependencyHandler.implementation(notation: Any) {
    add("implementation", notation)
}

fun DependencyHandler.debugImplementation(notation: Any) {
    add("debugImplementation", notation)
}

fun DependencyHandler.ksp(notation: Any) {
    add("ksp", notation)
}
