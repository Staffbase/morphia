/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.5/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
  api("org.mongodb:mongodb-driver-sync:4.1.1")
  api("org.mongodb:mongodb-driver-legacy:4.1.1")
  implementation("com.thoughtworks.proxytoys:proxytoys:1.0")
  implementation("io.github.classgraph:classgraph:4.8.78")
  implementation("org.slf4j:slf4j-api:2.0.9")

  compileOnly("cglib:cglib-nodep:3.3.0")
  compileOnly("com.sun.activation:javax.activation:1.2.0")

  testImplementation("org.zeroturnaround:zt-exec:1.10")
  testImplementation("com.jayway.awaitility:awaitility:1.7.0")
  testImplementation("junit:junit:4.13")
  testImplementation("org.skyscreamer:jsonassert:1.5.0")
  testImplementation("org.apache.logging.log4j:log4j-slf4j18-impl:2.11.1")
}

group = "com.staffbase.morphia"
version = "sb-1.6.1"

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks {
  withType<Test> {
    enabled = false
  }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
