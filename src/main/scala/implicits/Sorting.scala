package implicits

object MyUsefulStuff {
  implicit val x:String = "Guten Tag"
  implicit val y:Ordering[String] = (a, b) => b.compareTo(a)
}

object Sorting {
  def showIt(implicit x: String): Unit = println(s"it's ${x}")

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila", "Alice", "Bob")
    names foreach println
    println("------------------")
    implicit val theOrder: Ordering[String] = (a:String, b: String) => b.compareTo(a)

    names
//      .sorted((a:String, b: String) => b.compareTo(a))
//      .sorted((a:String, b: String) => a.compareTo(b))
//      .sorted(theOrder)
      .sorted
      .foreach(println)
//    names.sorted((a, b) => b.compareTo(a)).foreach(println)

    {
//      implicit val banana = "Bonjour"
      import implicits.MyUsefulStuff._
      showIt("Hello")
      showIt
    }
    showIt("Fruit")
  }
}
