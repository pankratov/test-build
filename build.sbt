
name := "test-build"
version := "0.1"
scalaVersion := "2.12.4"

fork in run := true
connectInput in run := true
outputStrategy in run := Some(OutputStrategy.StdoutOutput)

resolvers += "jitpack" at "https://jitpack.io"

enablePlugins(JavaAppPackaging)

testFrameworks += new TestFramework("utest.runner.Framework")
libraryDependencies ++= Seq(
  "com.lihaoyi" %% "utest" % "0.6.3" % "test"
)
