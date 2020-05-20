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

def details(name: String = "Hero", greeting: String = "Hi", age: Int = 0) = {
  s"$greet, I'm $name and I'm $age old."
}
