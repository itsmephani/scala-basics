class Person

val person = new Person

class Person(val name: String, val age: Int)

class Person(val name: String, age: Int) { // constructor

  def greet = $"Hi $name"
  
  // constructor overloading. this should call another constructor.
  this(name: String) = this(name, 0)

}

// Only one instance.
object Person {
  def apply(name: String, age: Int) = new Person(name, age)
}

val p = Person("Phani" 29) // apply will be invoked inside object.

// equals, toString, hashCode will be implemented by default.
// no need to mention val automatically considered as fields.
// copy method is available
// companion object is created automatically
case class Person(name: String, age: Int) 
