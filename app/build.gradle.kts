/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("piotrbo.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
}

application {
    // Define the main class for the application.
    mainClass.set("piotrbo.sample.LocalVariablesSample")
}
