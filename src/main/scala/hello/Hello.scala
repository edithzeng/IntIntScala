package hello

/*
class Date {
  int day, month, year;
  static int MONTHS_IN_YEAR = 12;
}
 */
object Hello {
  // in a "pure function" add(1, 2) should be
  // mathematically identical to 1 + 2
  // "referential transparency" i.e. invocation and implementation
  // are equivalent (and therefore, must have no SIDE EFFECTS)

  // singleton value () of type Unit
  // right side of = in function declaration is an expression.
//  def main(args: Array[String]): Unit = println("Hello Scala World!")

  // curlies create an expression with compound elements.
  // value of curlies IS value of LAST expression they contain
//  def main(args: Array[String]): Unit = {println("Hello Scala World!")}

  // where an expression is the body of a function, we CAN (but usually
  // do NOT, use "return" (use return for "premature exit") -- probably
  // avoid this (stylistically)
//  def main(args: Array[String]): Unit = {return println("Hello Scala World!")}

  def main(args: Array[String]): Unit = {
    println("Hello Scala World!")
    println("Bonjour monde Scala!")

//    var x:Double = {
    // Any <-- AnyVal <-- Int... (can create user defined!)
    //     <-- AnyRef (java.lang.Object) <-- String etc.
    var x:Any = {
      println("calculating value")
      99 + 100
    }
    println("x is " + x)
    x = "Hello";
    println("x is " + x)
    //    println(s"x is ${x}")
//    println(f"x is ${x}%5.2f")
    // unqualified expression (no "dot") can leave out curlies
//    println(s"x is $x")

    println(s"type of Hello is ${Hello.getClass}")
    var h = new Hello
    println(s"h is ${h}")
    println(s"type of h is ${h.getClass}")

    var n: Int = 99
//    n = 3.14
    n = 3.14.toInt
    println(s"n is ${n}")

    // most operators as expected for Java etc.

    // val is preferred to var...
    // val is effectively final var in Java or const in JavaScript and C#
    // BUT NOT const in C/C++
    // Scala highly encourages using val instead of var

  }
}

class Hello {

}
