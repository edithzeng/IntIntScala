package classes

object ListMatching {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(s"Head of list is ${names.head}")
    println(s"Head of tail is ${names.tail}")
    names match {
//      case s: String => println("That's a surprise")
      case h :: t => println(s"Head is ${h}, tail is ${t}")
      case List(a, b, c, d) => println(s"list with ${a}, ${b}, ${c}, ${d}")
      case List(a, b, c) => println(s"list with ${a}, ${b}, ${c}")
    }
  }
}
