package exceptions

import java.sql.SQLException

object OldWay {
  // scala does not care about checked/unchecked exceptions
  def dodgy:String =
    if (math.random() > 0.5) "Hello" else throw new SQLException

  def main(args: Array[String]): Unit = {
    try {
      dodgy
    } catch {
      case s:SQLException => println("Got an SQL exception")
      case x:Throwable => println(s"Some other problem  ${x.getMessage}")
    } finally {
      println("in finally")
    }
    println("still here")
  }
}
