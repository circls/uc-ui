import _root_.sbt.Keys._

name := "circls-akka"

version := "1.0"

scalaVersion := "2.10.5"


libraryDependencies ++= Seq(
  "com.googlecode.json-simple" % "json-simple" % "1.1.1",
  "org.mongodb" % "mongo-java-driver" % "3.2.2",
  "com.typesafe.play" % "play-json_2.11" % "2.3.9",
  "org.slf4j" % "slf4j-log4j12" % "1.7.16",
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "commons-io" % "commons-io" % "2.4",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.7.1",
  "net.sf.opencsv" % "opencsv" % "2.3",
  "commons-codec" % "commons-codec" % "1.10",
  "com.google.code.simple-spring-memcached" % "spymemcached" % "2.8.4",
  "com.typesafe.akka" % "akka-actor_2.10" % "2.3.14",
  "com.typesafe.akka" % "akka-remote_2.10" % "2.3.14",
  "com.typesafe.akka" % "akka-testkit_2.10" % "2.3.14",
  "com.thenewmotion.akka" % "akka-rabbitmq_2.10" % "2.2",
  "com.h2database" % "h2" % "1.4.191",
  "org.apache.commons" % "commons-lang3" % "3.4"
)