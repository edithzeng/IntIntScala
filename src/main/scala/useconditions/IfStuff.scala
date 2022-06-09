package useconditions

object IfStuff {
  def main(args: Array[String]): Unit = {
    val n = math.random()
    val res = if (n > 0.5) {
      println("It's large")
      100
    } else {
      println("it's small")
      3.14
    }
    println(s"res is ${res}")
  }
}
