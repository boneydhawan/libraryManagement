name := """test-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
   "mysql" % "mysql-connector-java" % "5.1.18",
   "org.hibernate" % "hibernate-core" % "5.2.5.Final",
    "dom4j" % "dom4j" % "1.6",
    filters
)

enablePlugins(JavaAppPackaging)
fork in run := false


fork in run := true