import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main(args: Array[String]): Unit = {
    //Writing to file
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nSome more random text")
    writer.close()

    //Reaing from file
    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    val lineIterator = textFromFile.getLines
    for (line <- lineIterator)
      println(line)
    textFromFile.close()

  } //END OF MAIN

} //END OF ScalaTutorial

