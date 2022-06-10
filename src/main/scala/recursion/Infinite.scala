package recursion

object Infinite {
  def count(c: Long): Unit = {
    println(c);
    if (c > 0) count(c - 1)
  }

  def sum(c: Int): Int = {
    def sum(c1: Int, acc: Int): Int =
      if (c1 == 0) acc
      else sum(c1 - 1, acc + c1)

    sum(c, 0)
  }

  def main(args: Array[String]): Unit = {
//    count(10_000_000_000L)
    println(s"Sum from 10 is ${sum(10)}")
  }
}
