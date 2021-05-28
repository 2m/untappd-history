organization := "lt.dvim.untappd"
name := "untappd-history"
description := "History and statistics of Untappd checkins"

scalaVersion := "2.13.6"

val Akka = "2.6.14"
val Circe = "0.14.1"

libraryDependencies ++= Seq(
  "is.cir"              %% "ciris-core"             % "0.13.0-RC1",
  "lt.dvim.ciris-hocon" %% "ciris-hocon"            % "1.0.0",
  "io.circe"            %% "circe-optics"           % "0.14.1",
  "io.circe"            %% "circe-parser"           % Circe,
  "io.circe"            %% "circe-generic"          % Circe,
  "com.typesafe.akka"   %% "akka-stream"            % Akka,
  "com.typesafe.akka"   %% "akka-slf4j"             % Akka,
  "com.typesafe.akka"   %% "akka-http"              % "10.2.4",
  "de.heikoseeberger"   %% "akka-http-circe"        % "1.36.0",
  "ch.megard"           %% "akka-http-cors"         % "1.1.1",
  "ch.qos.logback"       % "logback-classic"        % "1.2.3",
  "com.google.cloud"     % "google-cloud-firestore" % "2.4.0"
)

enablePlugins(JavaAppPackaging)

dockerUpdateLatest := true
Docker / packageName := "gcr.io/untappd-263504/untappd-history"
ThisBuild / dynverSeparator := "-"

scalafmtOnCompile := true

ThisBuild / scalafixDependencies ++= Seq(
  "com.nequissimus" %% "sort-imports" % "0.5.5"
)

enablePlugins(AutomateHeaderPlugin)
startYear := Some(2018)
organizationName := "Untappd History"
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))
