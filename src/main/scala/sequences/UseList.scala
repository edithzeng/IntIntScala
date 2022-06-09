package sequences

object UseList {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(s"item count is ${names.length}")
    println(s"item at index zero is ${names(0)}")

    // nope! unmodifiable
//    names.update(0) = "Frederick"
    // but "can" add more elements
    val names2 = "Alice" :: names
    println(s"names is ${names}, and names2 is ${names2}")
  }
}
