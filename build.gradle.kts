import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

plugins {
    kotlin("jvm") version "1.3.61"
    application
}

tasks.withType<KotlinJvmCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven { setUrl("https://oss.jfrog.org/artifactory/oss-snapshot-local") }
}

dependencies {
    implementation("com.github.ajalt:clikt:2.3.0")
    implementation("org.sonar.plsqlopen:zpa-core:3.0.0-SNAPSHOT")
    implementation("org.sonar.plsqlopen:plsql-checks:3.0.0-SNAPSHOT")
    implementation("com.google.guava:guava:28.2-jre")
    testImplementation(kotlin("test"))
}

application {
    mainClassName = "br.com.felipezorzo.zpa.cli.MainKt"
}
