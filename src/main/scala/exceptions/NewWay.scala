package exceptions

import java.sql.SQLException
import scala.util.{Failure, Success, Try}

class BadNumberException(msg: String) extends Exception(msg)

object NewWay {
  def dodgy:String =
    if (math.random() > 0.5) "Hello"
    else {
      println("I broke")
      throw new SQLException("Bad database!")
    }

  def main(args: Array[String]): Unit = {
    val res = Try(dodgy)
    res match {
      case Success(value) => println(s"it worked producing ${value}")
      case Failure(exception) => println(s"it failed with ${exception}")
    }

    println("successful:")
    res.foreach(println)
    println("recovering:")
    res.recover(t => t.getMessage).foreach(println)
  }
}
