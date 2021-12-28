ThisBuild / organization := "com.meetup"

ThisBuild / version := "0.4.0"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "archery"
  )

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.1" % "test",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test"
)
