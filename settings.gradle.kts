pluginManagement {
  val quarkusVersion: String by settings
  val quarkusPluginId: String by settings
  repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
  }
  plugins {
    id(quarkusPluginId) version quarkusVersion
  }
}
rootProject.name = "quarkus-demo"
