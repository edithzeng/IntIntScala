package classes

trait WeightCarrier { // very similar to interface in Java
  def canCarry(w: Int): Boolean // abstract method :)
}

case class Truck(payload: Int) extends WeightCarrier {
  override def canCarry(w: Int): Boolean = payload >= w
}

case class Car(seats: Int) extends WeightCarrier {
  override def canCarry(w: Int): Boolean = (seats - 1) * 170 >= w
}

object Bicycle extends WeightCarrier {
  override def canCarry(w: Int): Boolean = 30 >= w
}

object Logistics {
//  def canCarry(resource:AnyRef, weight: Int): Boolean = {
////    println(s"testing ${resource} against ${weight}")
//    resource match {
//      case Truck(w) => w >= weight
//      case Car(s) => (s - 1) * 170 >= weight
//      case Bicycle => 30 >= weight
//    }
//  }

//  def testPossibleCarriers(resources: List[Any], weight: Int): Unit = {
  def testPossibleCarriers(resources: List[WeightCarrier], weight: Int): Unit = {
//    resources.filter(r => canCarry(r, weight)).foreach(r => println(r))
    resources.filter(r => r.canCarry(weight)).foreach(r => println(r))
  }

  def main(args: Array[String]): Unit = {
    val resources = List[WeightCarrier](Truck(10_000), Truck(5_000),
      Car(5), Car(2), Bicycle)

    val weight = 300 // parcel to be carried

    testPossibleCarriers(resources, weight)
    println("---------------")
//    resources.map(r => (r, canCarry(r, 300))).foreach(t => println(t))
  }
}
