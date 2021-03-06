package org.jetbrains.ktor.application

import org.jetbrains.ktor.config.*
import org.slf4j.*

/**
 * Represents an environment in which [Application] runs
 */
interface ApplicationEnvironment {
    /**
     * [ClassLoader] used to load application.
     * Useful for various reflection-based services, like dependency injection.
     */
    val classLoader: ClassLoader

    /**
     * Instance of [Logger] to be used for logging.
     */
    val log: Logger

    /**
     * Configuration for [Application]
     */
    val config: ApplicationConfig

    /**
     * Provides events on Application lifecycle
     */
    val monitor: ApplicationMonitor
}

