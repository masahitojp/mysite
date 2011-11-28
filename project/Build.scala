import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "mine"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "postgresql" % "postgresql" % "8.4-701.jdbc4"
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
      // Add your own project settings here      
    )

}
