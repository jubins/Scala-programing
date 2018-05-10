import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName()} with id ${whiskers.sound}")
    println(whiskers.toString)
    

  } //END OF MAIN

  class Animal(var name: String, var sound: String){
    this.setName(name)
    val id  = Animal.newIdNum

    //Getter
    def getName() : String = name
    def getSound() : String = sound

    //Setter
    def setName(name: String): Unit ={
      if (!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound: String): Unit ={
      this.sound = sound
    }

    //Constructors
    def this(name: String){
      this("No Name", "No Sound")
      this.setName(name)
    }

    //Constructor: In case user does not define any name or sound
    def this(){
      this("No Name", "No Sound")
    }

    //Method overriding
    override def toString(): String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  object Animal {
    private var idNumber = 0
    private def newIdNum = {idNumber += 1; idNumber }
  }

} //END OF ScalaTutorial

