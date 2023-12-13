plugins {
  `java-library`
}

dependencies {
  api("org.mongodb:mongodb-driver-sync:4.1.1")
  api("org.mongodb:mongodb-driver-legacy:4.1.1")
  implementation("com.thoughtworks.proxytoys:proxytoys:1.0")
  implementation("io.github.classgraph:classgraph:4.8.78")
  implementation("org.slf4j:slf4j-api")

  compileOnly("cglib:cglib-nodep:3.3.0")
  compileOnly("com.sun.activation:javax.activation:1.2.0")

  testImplementation("org.zeroturnaround:zt-exec:1.10")
  testImplementation("com.jayway.awaitility:awaitility:1.7.0")
  testImplementation("junit:junit:4.13")
  testImplementation("org.skyscreamer:jsonassert:1.5.0")
  testImplementation("org.apache.logging.log4j:log4j-slf4j18-impl:2.11.1")
}
