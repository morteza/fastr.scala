package social.cut.examples


import org.graalvm.polyglot._

object PlotDemo extends App {
  val src = Source.newBuilder("R", getClass.getClassLoader.getResource("plot_demo.r")).build()
  val context = Context.newBuilder("R").allowAllAccess(true).build()
  val result: Value = context.eval(src)
  println(s"SVG image content from FastR is:\n$result")


  /* // in case of png/jpg images it can be shown
  import java.awt.Dimension
  import javax.swing.{ImageIcon, JFrame, JLabel, JPanel}
  def showImage(filePath: String): Unit = {
    val img = new ImageIcon(filePath)
    val frm = new JFrame().add(new JPanel().add(new JLabel(img)))
    frm.setVisible(true)
    frm.setPreferredSize(new Dimension(200, 200))
  }*/
}
