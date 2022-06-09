package sequences

object UseArrays {
  def apply(x: Int): Unit = println(s"You called my apply method with ${x}")
  def update(x: Int, y: String): Unit =
    println(s"You called update with x=${x}, y=${y}")

  def main(args: Array[String]): Unit = {
    // length is known, and fixed at creation
    // indexes are zero-based contiguous Int
    println(s"There are ${args.length} cmd line args")
    println(s"the first argument is ${args(0)}")

    var idx = 0
    while (idx < args.length) {
      println(s"args(${idx}) is ${args(idx)}")
      // object reference immediately followed by parens
      // is equivalent to (shorthand for) object reference dot apply (...)
      println(s"args(${idx}) is ${args.apply(idx)}")
      idx += 1
    }
//    args(2) = "san"
    args.update(2, "san")
    idx = 0
    while (idx < args.length) {
      println(s"args(${idx}) is ${args(idx)}")
      idx += 1
    }

    UseArrays.apply(10)
    UseArrays(10)
    UseArrays(10) = "Banana"
    UseArrays.update(10, "Banana")

    println("------------------------------------")
//    val names = Array.apply("Fred", "Jim", "Sheila")
//    val names = Array("Fred", "Jim", "Sheila")
    val names = new Array[String](3)
    println(s"names is ${names}")
    println(s"type of names is ${names.getClass}")
    println(s"first name in array is ${names(0)}")
  }
}
