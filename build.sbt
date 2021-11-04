import Dependencies._

ThisBuild / scalaVersion := "2.13.7"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= all
  )
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(DockerPlugin)
