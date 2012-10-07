name := "Scala Guice"

organization := "uk.me.lings"

version := "0.1"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "2.0",

  // Test-only dependencies
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)

crossScalaVersions := Seq("2.8.0", "2.8.1", "2.9.1")
