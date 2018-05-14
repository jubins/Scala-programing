import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {
     val log10Func = log10 _ //Underscore means you meant the function, not variable
    println(log10Func(1000))

    //Map
    List(1000.0, 10000.0).map(log10Func).foreach(println)
    List(1,2,3,4,5).map((x: Int) => x*50).foreach(println)

    //Filter
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

    //Passing functions into function
    def times3(num: Int) = num * 3
    def times4(num: Int) = num * 4
    def multIt(func: (Int) => Double, num: Int) = {
      func(num)
    }
    printf("3 * 100 = %.1f\n", multIt(times3, 100))
    printf("4 * 100 = %.1f\n", multIt(times4, 100))

  } //END OF MAIN



  } //END OF ScalaTutorial

