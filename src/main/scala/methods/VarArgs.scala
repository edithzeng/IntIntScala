package methods

object VarArgs {
  def addUp(x:Int *): Int = {
    println(s"type of x is ${x.getClass}")
    99
  }

  def main(args: Array[String]): Unit = {
    addUp(1,2,3)
  }
}
