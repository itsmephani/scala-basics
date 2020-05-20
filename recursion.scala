// Recursion
def factorial(n: Int) = {
  if (n <= 1) 1
  else n * factorial(n - 1)
}


// Tail recursion
def fact(n: Int) = {
  @tailrec
  def factHelper(x: Int, accumulator: Int): Int = {
    if (x < = 1) accumulator
    else factHelper(x - 1, x * accumulator)
  }
  
  factHelper(x, 1)
}
