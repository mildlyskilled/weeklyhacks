package domain

import scala.util.Try

trait Parser {
  def readInput(path: String, wordLength: Int): Try[Seq[String]]
}
