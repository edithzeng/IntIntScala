package classes

class Strange {
  def wobble:Unit = println("Strange.wobble!")
  override def toString: String = "Strange!!"
}

object Date extends Strange {
  override def toString: String = "I'm the singleton Date object" +
    super.toString
}

class Date(val day: Int, val month: Int, val year: Int) {
  override def toString: String = s"Date ${day}/${month}/${year}"
}

object TryThis {
  def showIt(x: Any): Unit = println(x.toString)

  def main(args: Array[String]): Unit = {
    println(Date.toString)

    showIt(Date)
    Date.wobble
  }
}
