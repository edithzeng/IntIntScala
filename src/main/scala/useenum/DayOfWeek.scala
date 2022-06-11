package useenum

object DayOfWeek extends Enumeration {
  type Type = Value
  val MONDAY, TUESDAY, WEDESDAY = Value
}

object TryIt {
  def isMonday(dayOfWeek: DayOfWeek.Type): Boolean =
    dayOfWeek == DayOfWeek.MONDAY

  def main(args: Array[String]): Unit = {
    println(DayOfWeek.MONDAY)
    val m1 = DayOfWeek.MONDAY
    val m2 = DayOfWeek.values.toList(0)
    println(m2)
    println(m1 == m2)

    println(s"is Monday? ${isMonday(m2)}")
    println(s"is Monday? ${isMonday(DayOfWeek.TUESDAY)}")
  }
}