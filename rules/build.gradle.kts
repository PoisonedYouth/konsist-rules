plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}

group = "com.poisonedyouth.konsist.rules"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.0")
    implementation("com.lemonappdev:konsist:0.15.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("Maven") {
            groupId = "com.poisonedyouth.konsist"
            artifactId = "rules"
            version = "0.1"

            from(components["java"])
        }
    }
}