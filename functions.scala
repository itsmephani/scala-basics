def add(a: Int, b: Int): Int = a + b

def greet(message: String): String = s"Hi $message"

def math(a: Int, b: Int, type: String) = {
  // Can define inner functions
  def add(a: Int, b: Int) = a + b
  def sub(a: Int, b: Int) = a - b
  def mult(a: Int, b: Int) = a * b
  def div(a: Int, b: Int) = a / b
  
  match type {
    case "add" => add(a, b)
    case "sub" => sub(a, b)
    case "mult" => mult(a, b)
    case "div" => div(a, b)
  }
}

// call by value
def callByValue(x: Long): Unit {
  print(x)
  print(x)
}

// call by name, :=> means x is passed as is as as function and will be evaluated lazily.
def callByName(x: => Long): Unit {
  print(x)
  print(x)
}

callByValue(System.nanoTime())
callByName(System.nanoTime())

// Default parameters and named arguments.
def greet(name: String = "Hero", greeting: String = "Hi", age: Int = 0) = {
  s"$greeting, I'm $name and I'm $age years old."
}

print(greet(name = "Phani", age = 29))
print(greet(age = 29, name = "Ram"))


// Partial functions
val evens: PartialFunction[Int, Int] =
  new PartialFunction[Int, Int] {
    //States that this partial function will take on the task
    def isDefinedAt(x: Int) = x % 2 == 0

    //What we do if this partial function matches
    def apply(v1: Int) = 2
  }

val odds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
  def isDefinedAt(x: Int) = x % 2 != 0

  def apply(v1: Int) = 3
}

val evenOrOdd = evens orElse odds
evenOrOdd(2) // 2
eventOrOdd(5) // 3

