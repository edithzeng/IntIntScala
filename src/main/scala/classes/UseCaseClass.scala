package classes

case class Automobile(seats: Int, color: String)

object UseCaseClass {
  def main(args: Array[String]): Unit = {
    val c1 = /*new */Automobile(5, "Red")
    val c2 = /*new */Automobile(5, "Red")
    println(c1)
    println(c1 == c2)

    val c3 = /*new */Automobile(2, "Blue")

    val thing: Any = c3
    thing match {
      case x:String => println("It's a String")
//      case x:Automobile =>
//        println(s"it's an automobile, with ${x.seats} seats")
      case x:Automobile if x.seats < 3 =>
        println(s"it's a small automobile, and it's ${x.color}")
//      case Automobile(2, color) =>
//        println(s"it's a small automobile, and it's ${color}")
      case Automobile(seats, color)/* if seats >= 3*/ =>
        println(s"it's an automobile, with ${seats} seats, and it's ${color}")
    }
  }
}

/*
if (x instanceof Automobile) {
  Automobile y = (Automobile)x;
  ...
}
 */