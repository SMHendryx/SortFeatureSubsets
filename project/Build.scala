import sbt._

object contextDependencies extends Build {

  lazy val root = Project("root", file(".")) dependsOn(LinearContextEngineProject)
  lazy val LinearContextEngineProject = RootProject(uri("git://github.com/clulab/reach/tree/LinearContextEngine.git"))

}