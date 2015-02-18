import org.sonatype.maven.polyglot.scala.model._

Model(
  "com.example" % "minimal-scala" % "0.0.1-SNAPSHOT",
  dependencies = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  )
)