import sbt._
/*
This is project level dependency file
 */
object Dependencies {

  val scalaRequests = "com.lihaoyi" %% "requests" % "0.8.0"
  val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.15"

  val commonDependencies: Seq[ModuleID] = Seq(scalaTest % Test)

  val apiDependencies: Seq[ModuleID] = Seq(scalaRequests,
    scalaXml ) ++ commonDependencies

  val calculatorDependencies: Seq[ModuleID] = commonDependencies
}
