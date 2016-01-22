name := "algorithms"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.7" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")