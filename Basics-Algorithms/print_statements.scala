import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {

    val name = "Derek"
    val age = 39
    val weight = 175.5

    println(s"Hello $name")
    println(f"I am ${age +1} and $weight%.2f")
    printf("'%05d' \n", 5) //right justify
    printf("'%-5d' \n", 5) //left justify
    printf("'%.15f'\n",3.14)
    printf("'%-5s'\n","hi")

  }
}
