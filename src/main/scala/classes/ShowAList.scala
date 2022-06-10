package classes

import java.time.LocalDate

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

    val stuff = List(1, 3.14, "Hello", LocalDate.now)
  }
}
