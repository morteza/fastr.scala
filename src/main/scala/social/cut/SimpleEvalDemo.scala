package social.cut

import org.graalvm.polyglot._

object SimpleEvalDemo extends App {
  val context = Context.newBuilder("R").allowAllAccess(true).build()
  val result: Value = context.eval("R", "2^3")
  println(s"Result from FastR is ${result.asDouble}")
}
