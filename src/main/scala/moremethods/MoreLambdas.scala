package moremethods

object MoreLambdas {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")

    val doIt: String => Unit = (s:String) => println(s)
    names.foreach(doIt)

    names.foreach((s:String) => println(s))
    names.foreach((s) => println(s))
    names.foreach(s => println(s))
    names.foreach(println(_))
    names.foreach(println)
    names foreach println

    println(names.reduce((a, b) => a + ", " + b))
    // nope, probably because s"" and f"" are compiler macros
//    println(names.reduce(s"${_} , ${_}"))
    println(names.reduce((a:String, b:String) => a + ", " + b))
    println(names.reduce("%9s".format(_) + ", " + _))
  }
}
