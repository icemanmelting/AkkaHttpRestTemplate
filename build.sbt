name := "Akka-Http-Template"

version := "1.0"

scalaVersion := "2.12.1"

scalaVersion := "2.12.1"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.4.14"
  val akkaHttpV = "10.0.0"

  Seq(
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV % "test",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "com.datastax.cassandra" % "cassandra-driver-core" % "3.1.0"
  )
}