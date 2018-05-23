object Solution {
  def main(args: Array[String]) = {
    println(product(x => x)(1, 5))
  }
  
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) * acc)
    }
  loop(a, 1)
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }

}