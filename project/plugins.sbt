// Automate file headers
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.6.0")

// Code formatting
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

// Release to Sonatype
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.7")

// Scala 3 support
addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.5")
