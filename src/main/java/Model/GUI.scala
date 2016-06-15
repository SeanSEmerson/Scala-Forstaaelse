package Model

import java.awt.event.MouseAdapter

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.swing.event._
import swing._
/**
  * Created by Sean Emerson on 15-06-2016.
  */


object fillList {
  def main(args: Array[String]) {
    val god_Of_War = new Game("God of War", "PS2", true)
    val pillarsOfEternity = new Game("Pillers of Eternity", "PC", false)

    val games = ArrayBuffer[Game]()
    games += god_Of_War
    games += pillarsOfEternity

    games.foreach(game => println(game.toString()))
  }
}
