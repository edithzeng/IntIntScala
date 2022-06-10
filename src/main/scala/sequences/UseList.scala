package sequences

//class Thing(v: Int) {
// same as taking constructor arg and copying to a field
class Thing(val v: Int) { // this could be a var for a mutable field..
  def this() = {
    this(-1)
  }
  // constructor body is simply body of the class!
  println(s"Constructing a Thing with v = ${v}")
//  val value = v

  def =+=+(v2: Int): Unit = println(s"=+=+ invoked, v is ${v}, v2 is ${v2}")
  def =+=+:(v2: Int): Unit = println(s"=+=+: (right!) invoked, v is ${v}, v2 is ${v2}")
  def and(v2: Int): Unit = println(s"and invoked, v is ${v}, v2 is ${v2}")

  override def toString: String = s"I'm a Thing with v = ${v}"
}

object UseList {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(s"item count is ${names.length}")
    println(s"item at index zero is ${names(0)}")

    // nope! unmodifiable
//    names.update(0) = "Frederick"
    // but "can" add more elements
    val names2 = "Alice" :: names // "cons" operator
    println(s"names is ${names}, and names2 is ${names2}")

    val names3 = "Alice" :: "Bob" :: "Trent" :: Nil
    val names4 = Nil.::("Trent").::("Bob").::("Alice")

//    val t = new Thing(99)
    val t = new Thing
    println(t)
    t.=+=+(99)
    t =+=+ 99 // "infix" invocation
    t and 99 // "infix" invocation

    99 =+=+: t
  }
}
