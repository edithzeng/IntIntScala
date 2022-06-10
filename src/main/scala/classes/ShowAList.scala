package classes

object ShowAList {
  def show(items:List[String]):Unit = items match {
    case Nil => ()
//    case List() => ()
    case h :: t => println(h)
      show(t)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    show(names)
  }

}
