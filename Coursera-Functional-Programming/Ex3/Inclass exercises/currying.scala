object Solution {
  def main(args: Array[String]) = {
    println(product(x => x)(1, 5))
    println(fact(5))
  }
  
def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)


  // Define factorial in terms of product
  def fact(n: Int) = product(x => x) (1, n)


}
