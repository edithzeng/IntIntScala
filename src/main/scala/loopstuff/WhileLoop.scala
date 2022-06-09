package loopstuff

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var x = 3
    while (x > 0) {
      val y = x * 2
      println(s"x is now ${x} and y is ${y}")
      x -= 1 // ++/-- do not exist in Scala
    }

    for {
      v <- 1 to 10
    } println(s"v is ${v}")
  }
}
