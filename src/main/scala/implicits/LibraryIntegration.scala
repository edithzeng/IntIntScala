package implicits

object Converter {
  implicit def bladyBlah(i: Int): Tenths = new Tenths(i * 10)
}

object Tenths {
  // this is the companion, it does not have to have the
  // associated converstion imported, as would otherwise be the case
  implicit def bladyBlah(i: Int): Tenths = new Tenths(i * 10)
}

/* implicit only valid to label a class implicit
 if it is NOT a top-level class */
class Tenths(val value: Int) {
  def toInt: Int = value / 10
  def toDouble: Double = value / 10.0

  def +(other:Tenths): Tenths = new Tenths(value + other.value)

  def +(other: Int): Tenths = new Tenths(value + 10 * other)

  override def toString: String = f"Tenths: ${this.toDouble}%1.1f"
}

object LibraryIntegration {
//  implicit /* only valid to label a class implicit
//   if it is NOT a top-level class */
//  class Tenths(val value: Int) {
//    def toInt: Int = value / 10
//    def toDouble: Double = value / 10.0
//
//    def +(other:Tenths): Tenths = new Tenths(value + other.value)
//
//    def +(other: Int): Tenths = new Tenths(value + 10 * other)
//
//    override def toString: String = f"Tenths: ${this.toDouble}%1.1f"
//  }

  def main(args: Array[String]): Unit = {
    val threePointOne = new Tenths(31)
    println(threePointOne)

    val fourAndABit = new Tenths(44)
    val result = fourAndABit + threePointOne
    println(result)

    println(fourAndABit + threePointOne)

    println(fourAndABit + 5)

//    import Converter.bladyBlah
    println(5 + fourAndABit)

  }
}
