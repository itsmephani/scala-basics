// Recursion
def factorial(n: Int) = {
  if (n <= 1) 1
  else n * factorial(n - 1)
}


// Tail recursion
def fact(n: Int) = {
  @tailrec
  def factHelper(x: Int, accumulator: Int = 1): Int = {
    if (x < = 1) accumulator
    else factHelper(x - 1, x * accumulator)
  }
  
  factHelper(x)
}

def concat(input: String, times: Int, output: String = ""): String = {
  if (times <= 1) input + output
  else concat(input, times - 1, input + output)
}

def isPrime(n: Int): Boolean = {
  def isPrimeHelper(x: Int, primeTillNow: Boolean): Boolean = {
    if (!primeTillNow) false
    else if (x <= 1) true
    else isPrimeHelper(x - 1, n % x != 0)
  }

  isPrimeHelper(n/2, true)
}

def fibonacci(n: Int): Int = {
  def fibonacciHelper(x: Int, t1: Int, t2: Int): Int = {
    if (x == n) t2
    else fibonacciHelper(x + 1, t2, t1 + t2)
  }

  fibonacciHelper(2, 1, 1)
}


println(concat("Hi", 3))
println(isPrime(3))
println(isPrime(4))
println(fibonacci(8))
