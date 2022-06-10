package recursion

import scala.annotation.tailrec

object Infinite {
  @tailrec
  def count(c: Long): Unit = {
    println(c);
    if (c > 0) count(c - 1)
  }

  def sum(c: Int): Int = {
    @tailrec
    def sum(c1: Int, acc: Int): Int =
      if (c1 == 0) acc
      else sum(c1 - 1, acc + c1)

    sum(c, 0)
  }

//  @tailrec // causes compilation error because this is NOT tailrecursive :)
  def sum(nums:List[Int]): Int = nums match {
    case Nil => 0
    case h :: t => h + sum(t)
  }

  def main(args: Array[String]): Unit = {
//    count(10_000_000_000L)
    println(s"Sum from 10 is ${sum(10)}")

    println(s"sum of list with ten numbers is ${sum((1 to 10_000).toList)}")
  }
}
