name := "sbt-scala-test"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.2"
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.1"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
