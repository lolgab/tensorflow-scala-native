 import scala.sys.process._

enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.12"

lazy val make = taskKey[Unit]("Building C code")

make := {
  "gcc -m64 -static -c src/main/c/tensorflow.c -o target/libtensorflowscalanative.a" !
}

nativeLinkingOptions ++= Seq(
  "-L" ++ 
  baseDirectory.value.getAbsolutePath() ++ "/target")

Compile / compile := (Compile / compile dependsOn make).value

