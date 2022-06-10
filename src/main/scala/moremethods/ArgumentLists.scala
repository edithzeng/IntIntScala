package moremethods

object ArgumentLists {
  def oneArg(a: Int): Int = a * 2

  def twoArgs(a: Int)(b: Int): Int = a * b
//  def twoArgs(a: Int, b: Int): Int = a * b

  //
//  def twoArgs(a: Int): Int = a * 2

  def lazyVal:Unit = {
    lazy val a = {
      println("calculating.... gosh that was hard work, value determined")
      99
    }
    if (math.random > 0.5) {
      println(s"Using value a... as ${a}")
      println(s"Using value a again... as ${a}")
    }
  }
  def main(args: Array[String]): Unit = {
    // explicit partial applicatoin
//    val timesTwo = twoArgs(2)(_)
    // implicit partial application (needs explicitly
    // type varialble)
    val timesTwo: Int => Int = twoArgs(2)

//    println(twoArgs(2, 3))
    println(twoArgs(2)(3))

    println(timesTwo(3))
    val res = oneArg {3 * 2}
    println(res)
    val res2 = twoArgs {
      println("calculating first argument")
      (3 * math.random()).toInt
    }{
      5
    }
    println(res2)
    println("-------- lazy?? ---------")
    lazyVal
  }
}
