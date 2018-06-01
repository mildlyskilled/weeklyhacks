package game

import domain.GuessResponse.{CorrectGuess, WrongGuess}
import domain.{GameUtils, Guess, GuessResponse}

object Engine {

  def playGame(guess: Guess, currentWord: String, wordList: Seq[String]): GuessResponse = {
    if (GameUtils.guess(guess, currentWord)){
      val droppedWordList = wordList.filterNot(_ == currentWord)
      CorrectGuess(guess, GameUtils.selectWord(droppedWordList))
    } else {
      WrongGuess
    }
  }

}
