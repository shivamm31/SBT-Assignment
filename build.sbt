name := "SBT-Assignment"

version := "0.1"

scalaVersion := "2.13.6"

lazy val Common = project.in(file("Common"))

  .settings(

    libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.3",
    libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2",
    libraryDependencies += "com.typesafe" % "config" % "1.2.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "Test",
    libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test

  )

lazy val Persistence = project.in(file("Persistence"))

  .settings(

    libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.3",
    libraryDependencies += "org.postgresql" % "postgresql" % "42.1.1",
    libraryDependencies += "com.h2database" % "h2" % "1.4.192",
  )















lazy val Root = project.in(file(".")).aggregate(Common, Persistence)