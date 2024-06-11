plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.poisonedyouth.konsist"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    testImplementation("com.lemonappdev:konsist:0.15.1")
    testImplementation("com.poisonedyouth.konsist:rules:0.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}