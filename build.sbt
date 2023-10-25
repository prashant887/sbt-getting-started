ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

publish/skip := true

lazy val root = (project in file("."))
  .settings(
    name := "sbt-getting-started"
  ).aggregate(calculators)

lazy val calculators=project//subproject
  .dependsOn(api).settings(
  libraryDependencies++=Dependencies.calculatorDependencies
) //So in main project class can be imported easily
  .enablePlugins(JavaAppPackaging)

lazy val api=project.settings(
  libraryDependencies++=Dependencies.apiDependencies
).enablePlugins(JavaAppPackaging)

//Define Depnecies in Dependceny Object at Project Level