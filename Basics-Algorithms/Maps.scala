import scala.io.StdIn.{readLine}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {
    //Array size is static
    val favNums = new Array[Int](20)
    val friends = Array("Bob", "Tom")
    friends(0) = "Sue"
    println("Best friends " + friends(1))

    //ArrayBuffer size is static
    val friends2 = ArrayBuffer[String]()
    friends2.insert(0, "Phil")
    println(friends2)
    friends2 += "Mark"
    println(friends2)
    friends2 ++= Array("Susy", "Paul")
    println(friends2)

    //Inserting values at the second slot
    friends2.insert(1,"Mike", "Sully")
    println(friends2)

    //Removing items from the array
    friends2.remove(1,2)
    println(friends2)

    var friend : String = " "
    for (friend <- friends2)
      println(friend)

    //Storing data in favNums
    for (j <- 0 to (favNums.length - 1)){
      favNums(j) = j
      println(favNums(j))
    }

    //Foreach
    val favNumsTimes2 = for(num <- favNums) yield 2 * num
    favNumsTimes2.foreach(println)

    var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num
    favNumsDiv4.foreach(println)

    //Multi-dimensional array
    var multiTable = Array.ofDim[Int](10,10)
    for (i <- 0 to 9){
      for (j <- 0 to 9){
        multiTable(i)(j) = i * j
      }
    }

    for (i <- 0 to 9){
      for (j <- 0 to 9){
        printf("%d,%d = %d\n", i, j, multiTable(i)(j))
      }
    }

    println("Sum : "+ favNums.sum)
    println("Min : "+ favNums.min)
    println("Max : "+ favNums.max)

    val sortedNumsAsc = favNums.sortWith(_>_) //Ascending
    val sortedNumsDesc = favNums.sortWith(_<_) //Descending
    println(sortedNumsAsc.deep.mkString(", "))
    println(sortedNumsDesc.deep.mkString(", "))


  }
}

