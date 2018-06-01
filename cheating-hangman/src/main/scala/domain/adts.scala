package domain

case class Guess(letter: Char)

trait GuessResponse
object GuessResponse {
  case class CorrectGuess(correctGuess: Guess, newCurrentWord: String) extends GuessResponse
  case object WrongGuess extends GuessResponse
}