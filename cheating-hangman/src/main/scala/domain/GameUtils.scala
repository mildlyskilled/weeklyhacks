package domain

import scala.util.Random

object GameUtils {
  def selectWord(words: Seq[String], correctGuess: Option[Guess]): String = {
    correctGuess.map(guess ⇒ words.filterNot(_ == guess))
    words(Random.nextInt(words.size))
  }

  def guess(guess: Guess, word: String): Boolean = word.contains(guess.letter)
}
