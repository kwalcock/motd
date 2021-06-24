name := "plugin-motd"

organization := "keithalcock.com"

scalaVersion := "2.12.10"

libraryDependencies ++= {
  Seq(
    "ai.lum" %% "plugin-motd" % "0.4.1-SNAPSHOT"
  )
}

lazy val core = project in file(".")

lazy val hello = project
    .dependsOn(core)

lazy val welcome = project
    .dependsOn(core)
