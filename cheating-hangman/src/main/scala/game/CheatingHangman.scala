package game

import domain.{GameUtils, Guess, TextParser}

import scala.io.StdIn
import scala.tools.jline.console.ConsoleReader
import scala.util.Success

object CheatingHangman extends App {

  val input = StdIn.readLine("Word Length: ").toInt

  TextParser.readInput("corncob_lowercase.txt", input) match {
      case Success(listOfWords) ⇒
        val randomWord = GameUtils.selectWord(listOfWords)
        Iterator.continually(new ConsoleReader().readLine("Your guess")).takeWhile(_ != "exit").foreach{ guess ⇒
          Engine.playGame(Guess(guess), listOfWords)
        }
      case _ ⇒
        println("Could not parse input file, does it exist?")
    }
}
