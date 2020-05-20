def add(a: Int, b: Int): Int = a + b

def greet(message: String): String = s"Hi {message}"

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