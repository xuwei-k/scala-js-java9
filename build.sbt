val testJava9 = crossProject.in(file(".")).settings(
  scalaVersion := "2.12.1"
).jsSettings(
  scalaJSOptimizerOptions ~= { _.withParallel(false) }
)

val testJava9JVM = testJava9.jvm
val testJava9JS = testJava9.js
