organization := "lt.dvim.untappd"
name := "untappd-history"
description := "History and statistics of Untappd checkins"

scalaVersion := "2.13.8"

val Akka = "2.6.18"
val Circe = "0.14.1"

libraryDependencies ++= Seq(
  "is.cir"              %% "ciris-core"             % "0.13.0-RC1",
  "lt.dvim.ciris-hocon" %% "ciris-hocon"            % "0.2.1",
  "io.circe"            %% "circe-optics"           % "0.14.1",
  "io.circe"            %% "circe-parser"           % Circe,
  "io.circe"            %% "circe-generic"          % Circe,
  "com.typesafe.akka"   %% "akka-stream"            % Akka,
  "com.typesafe.akka"   %% "akka-slf4j"             % Akka,
  "com.typesafe.akka"   %% "akka-http"              % "10.2.8",
  "de.heikoseeberger"   %% "akka-http-circe"        % "1.39.2",
  "ch.megard"           %% "akka-http-cors"         % "1.1.3",
  "ch.qos.logback"       % "logback-classic"        % "1.2.10",
  "com.google.cloud"     % "google-cloud-firestore" % "3.0.12"
)

enablePlugins(JavaAppPackaging)

dockerUpdateLatest := true
Docker / packageName := "gcr.io/untappd-263504/untappd-history"
ThisBuild / dynverSeparator := "-"

scalafmtOnCompile := true

ThisBuild / scalafixDependencies ++= Seq(
  "com.nequissimus" %% "sort-imports" % "0.6.1"
)

enablePlugins(AutomateHeaderPlugin)
startYear := Some(2018)
organizationName := "Untappd History"
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))
