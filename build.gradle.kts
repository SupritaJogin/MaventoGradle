plugins {
    java
}

group = "com.example1"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:3.8.1")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.example1.App"
    }
}
