package moremethods.byname

object PassByName {
//  def logThis(level:Int, msg: () => String): Unit = {
//    println("in logThis")
//    if (level > 3) println(msg())
//  }

  def logThis(level:Int)(msg: => String): Unit = {
    println("in logThis")
    if (level > 3) {
      println(msg)
      // RE-evaluates the msg parameter
      // avoid this by assigning msg to a lazy val
      // and then refer to that lazy val when needed
      println(s"really, ${msg}")
    }
  }

  def createMessage(x:Int):String = {
    println(s"Calculating message ${x}")
    "stuff broke"
  }

  def main(args: Array[String]): Unit = {
    println("About to log")
//    logThis(4, () => createMessage) // Java calls this a "Supplier"
    // this is called Pass By Name (not named parameter passing)
    // both this and the above Supplier, are sometimes referred to
    // as a "thunk"
    // exception in pass-by-name parameter will show up INSIDE
    // the called function, not outside
    logThis(4)(createMessage(3))
    println("Finished logging")
    logThis(2){
      println("calculating complex expression")
      "the value is 99!!"
    }
  }
}
