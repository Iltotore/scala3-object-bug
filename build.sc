import mill._, scalalib._
import coursier.maven.MavenRepository

object versions {
    val scala = "3.3.0"
}

object main extends ScalaModule {

    def scalaVersion = versions.scala
}

object dependent extends ScalaModule {

    def scalaVersion = versions.scala

    def moduleDeps = Seq(main)
}