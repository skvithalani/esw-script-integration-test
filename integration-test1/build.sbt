import Libs._
inThisBuild(
  Seq(
    scalaVersion := "2.13.0",
    version := "0.1.0-SNAPSHOT",
    organization := "com.github.skvithalani.esw-script-integration-test",
    organizationName := "ThoughtWorks",
    resolvers ++= Seq(Resolver.jcenterRepo, "jitpack" at "https://jitpack.io"),
    scalafmtOnCompile := true,
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-Xlint:_,-missing-interpolator",
      "-Ywarn-dead-code"
      //      "-Xprint:typer"
    ),
    libraryDependencies ++= Seq(
      compilerPlugin(`silencer-plugin`),
      `silencer-lib` % Provided
    )
  )
)

lazy val `esw-script-integration-test` = project
  .in(file("."))
  .aggregate(`integration-test`)

lazy val `integration-test` = project
  .in(file("integration-test"))
