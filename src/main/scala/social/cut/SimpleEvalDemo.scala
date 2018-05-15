package social.cut

import org.graalvm.polyglot._

object SimpleEvalDemo extends App {
  val context = Context.create("R")
  val result: Value = context.eval("R", "2^3").execute()
  println(s"Result from FastR is ${result.asString}")
}
