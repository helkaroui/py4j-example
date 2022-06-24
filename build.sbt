ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "py4j-example",
    libraryDependencies ++= Seq(
      "net.sf.py4j" % "py4j" % "0.10.9.5"
    )
  )
