import sbt._

object Dependencies {

  val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.6"
  )

  val specs2Version = "4.13.0"
  val specs2 = Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "test"
  )

  val all: Seq[ModuleID] = logging ++ specs2
}
