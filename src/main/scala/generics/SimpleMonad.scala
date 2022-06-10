package generics

object SimpleMonad {
//  def forEvery(ss:List[String], op:String => Unit): Unit = ss match {
//  def forEvery(ss:List[_], op: Any => Unit): Unit = ss match {
  // this kinda fails (at call site) -- type inferencing isn't good enough
//  def forEvery[T](ss:List[T], op: T => Unit): Unit = ss match {
  def forEvery[T](ss:List[T])(implicit op: T => Unit): Unit = ss match {
    case Nil =>
//    case h :: t => op(h) ; forEvery(t, op)
//    case h :: t => op(h) ; forEvery(t)(op)
    case h :: t => op(h) ; forEvery(t)
  }

  def map[T, U](xs:List[T])(implicit op: T => U): List[U] = xs match {
    case Nil => Nil
    case h :: t => op(h) :: map(t)(op)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
//    forEvery(names, x => println(x))
    forEvery(names)(x => println(x))
    val nums = List(1,3,5,7,9)
//    forEvery(nums, x => println(s"number is ${x}"))
    // explicit type in lambda param can help type inferencer
//    forEvery(nums, (x: Int) => println(s"number is ${x}"))
    forEvery(nums)(x => println(s"number is ${x}"))

    forEvery(map(names)(x => x.length))(x => println(x))
    forEvery(map(names)(x => x.length))(println)
  }
}
