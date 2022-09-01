pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val owaspDependencyCheckVersion: String by settings

    plugins {
        kotlin("jvm").version(kotlinVersion)
        kotlin("plugin.spring").version(kotlinVersion)
        id("org.springframework.boot").version(springBootVersion)
        id("io.spring.dependency-management").version(springDependencyManagementVersion)
        id("org.owasp.dependencycheck").version(owaspDependencyCheckVersion)
    }
}
