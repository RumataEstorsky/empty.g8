name := "$name$"
scalaVersion := "2.13.3"

val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
)

val specs2Version = "4.10.1"
val specs2= Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "test"
)

libraryDependencies ++= logging ++ specs2
scalacOptions in Test ++= Seq("-Yrangepos")

