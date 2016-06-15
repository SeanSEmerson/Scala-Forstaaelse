import java.util.{Locale, Date}
import java.text.DateFormat
import java.text.DateFormat._

import com.sun.glass.ui.MenuItem.Callback

/**
  * Created by Sean Emerson on 08-06-2016.
  */



  object HelloWorld {
    def main(args: Array[String]) {
      println("Hello World")
    }
  }

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date();
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}

  object Timer{
    def oncePerSecond(callback: () => Unit ) {
      while (true){callback(); Thread sleep 1000}
    }
    def timeFlies(){
      println("Time flies when your having fun")
    }
    def main(args: Array[String]){
      oncePerSecond(timeFlies)
    }
}
object AnonomysTimer{
  def oncePerSecond(callback: () => Unit ) {
    while (true){callback(); Thread sleep 1000}
  }
  def main(args: Array[String]){
    oncePerSecond(() =>
      println("Time flies when your having fun"))
  }
}

object usingComplex {
  def initiatingComplex(real: Double, imagine: Double){
    val com = new Complex(real, imagine)
    println(com.toString())
  }
  def  main(args: Array[String]): Unit ={
    initiatingComplex(2.1, 4.3)
  }
}

