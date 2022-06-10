package classes

// some syntax (which I forget!, sorry) allows constraining
// a trait to be used ONLY in creating subtypes of certain types
// in which case, we can refer to the elements of *that* type
// in the trait
trait Stringable {
  def asText:String
}

class Strange {
  def wobble:Unit = println("Strange.wobble!")
  override def toString: String = "Strange!!"
}

// first "generalized type" (i.e. the parent class, or the first
// trait we specify) is "extends", subsequent traits (only traits
// allow multiple inheritance) are "with"
object Date extends Strange with Stringable {
  override def toString: String = "I'm the singleton Date object" +
    super.toString

  def apply(day: Int, month: Int, year: Int): Date =
    new Date(day, month, year)

  def asText:String = "I'm a Stringable Date!"
}

class Date protected (val day: Int, val month: Int, val year: Int) {
  override def toString: String = s"Date ${day}/${month}/${year}"
}

class Holiday(day: Int, month: Int, year: Int, val name: String)
  extends Date(day, month, year) {

  override def toString: String = s"Holiday called ${name} on" +
    super.toString
}

object TryThis {
  def showIt(x: Any): Unit = println(x.toString)

  def main(args: Array[String]): Unit = {
    println(Date.toString)

    showIt(Date)
    Date.wobble

//    val d1 = new Date(1, 1, 2000)
    val d2 = Date(1, 2, 2000)
  }
}
