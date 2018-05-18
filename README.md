# FastR/Scala InterOp in GraalVM

1. Install GraalVM
2. Setup `JAVA_HOME`
3. Install FastR with GraalVM Updater using the following command: `gu -c install org.graalvm.r`
4. Run examples using `sbt run`.

- Plot demo depends on `ggplot2` package in FastR to run. Since it takes time to compile dependencies and install `ggplot2`, make sure you install it before running the demo, with `install.packages("ggplot2")` command in FastR. 
