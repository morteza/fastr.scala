# FastR/Scala InterOp in GraalVM

1. First install GraalVM
2. Then set up the `JAVA_HOME`
3. Use GraalVM Updater to install FastR: `gu -c install org.graalvm.r`
4. And finally run Scala examples using `sbt run`.

**Note:** The demo uses `ggplot2` package for plotting; in FastR, run `install.packages("ggplot2")` to install it. Compiling all the dependencies takes a bit of time, so feel free to have your coffee while it's getting installed.
