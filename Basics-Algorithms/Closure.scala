import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {
    //Closure
    //Is a function that depends on a variable declared outside the function
    val divisorVal = 5
    val divisor5 = (num: Double) => num/divisorVal
    println("5 / 5 = "+ divisor5(5.0))

  } //END OF MAIN



  } //END OF ScalaTutorial

