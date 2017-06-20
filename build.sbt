import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "CLU Lab University of Arizon",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "SortFeatureSubsets",
    libraryDependencies ++= Seq(
      //"org.scalatest" %% "scalatest" % "2.2.4" % "test",
      //"org.clulab" % "bioresources" % "1.1.19",
        "org.clulab" %% "processors-main" % "6.0.1",
      //"org.clulab" %% "processors-corenlp" % "6.0.1",
      //"org.clulab" %% "processors-models" % "6.0.1",
      "com.typesafe" % "config" % "1.2.1"
      //"commons-io" % "commons-io" % "2.4",
      //"org.biopax.paxtools" % "paxtools-core" % "4.3.1",
      //"jline" % "jline" % "2.12.1",
      //"org.apache.lucene" % "lucene-core" % "5.3.1",
      //"org.apache.lucene" % "lucene-analyzers-common" % "5.3.1",
      //"org.apache.lucene" % "lucene-queryparser" % "5.3.1",
      //"ai.lum" %% "nxmlreader" % "0.0.7",
      // logging
      //"ch.qos.logback" %  "logback-classic" % "1.1.7",
      //"com.typesafe.scala-logging" %%  "scala-logging" % "3.4.0"
  ),
  // mandatory stuff to add to the pom for publishing
  pomExtra :=
    <url>https://github.com/repo/not/created/yet</url>
    <licenses>
      <license>
        <name>Apache License, Version 2.0</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/repo/not/created/yet</url>
      <connection>https://github.com/repo/not/created/yet</connection>
    </scm>
    <developers>
      <developer>
        <id>SMHendryx</id>
        <name>Sean Hendryx</name>
        <email>seanmhendryx@email.arizona.edu</email>
      </developer>
    </developers>

  //
  // end publishing settings
  //
)
