package useconditions

import scala.io.Source

object SimpleMatch {
  def add(a: Int, b: Int): Int = a + b

  def main(args: Array[String]): Unit = {
//    val x: Any = "Hello"
    val x: Any = 99.9
    val res = x match {
      case "Hello" => println("It's a greeting")
      case 99 =>
        println("it's a number")
        println("really, it's 99")
        101
      case _ => println("it's something else")
    }
    println(s"res is ${res}")

    println(s"sum of 1 and 2 is ${add(1, 2)}")

    val input = Source.stdin.getLines()
    val txt = input.next()
    println(s"I read ${txt}")
  }
}
