package date

object Date {
  // formal parameters are val, not var (i.e. they're final)
  def dayOfWeek(day: Int, month: Int, year: Int = 2000): Int = {
//    val m = if (month < 3) month + 13 else month
//    val y = if (month < 3) year - 1 else year
//    val (m, y) = if (month < 3) (month+13, year-1) else (month, year)
//    val t:(Int, Int) = if (month < 3) (month+13, year-1) else (month, year)
    val t = if (month < 3) (month+12, year-1) else (month, year)

    val m = t._1 // in Scala 3, can also use t(0)...
    val y = t._2

    (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7

  }
}

object UseDate {
  def main(args: Array[String]): Unit = {
    println("Day of week of Jan 1 2000 " +
      s"${Date.dayOfWeek(1, 1, 2000)}")
    println("Day of week of Feb 1 2000 " +
      s"${Date.dayOfWeek(month =2, day = 1, year = 2000)}")
    println("Day of week of Feb 1 2000 " +
      s"${Date.dayOfWeek(month =2, day = 1)}")
  }
}