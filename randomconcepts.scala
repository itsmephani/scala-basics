val lists = List(List(1, 2, 3), List(4, 5, 6)) // [[1, 2, 3], [4, 5, 6]] = [1, 2, 3, 4, 5, 6]
lists.flatMap { a => a.map(_ * 2) }

val l: Option[Int] = None

val cc = List(Some(1), None, Some(1))

println(cc.flatten)

def add(a: Int)(implicit b: Int) = {
  a + b
}

implicit val c: Int = 2

add(1)

implicit class IntWithTimes(x: Int) {
  def times[A](f: => A): Unit = {
    def loop(current: Int): Unit =
      if(current > 0) {
        f
        loop(current - 1)
      }
    loop(x)
  }
}

2 times println("HI")

class Person(val name: String)

val p = new Person("abcd")

object Person

p match {
  case a: Person => println("person")
  case _ => println("no match")
}
