package domain
import scala.io.Source
import scala.util.Try
object TextParser extends Parser {

  override def readInput(path: String, wordLength: Int): Try[Seq[String]] =
    Try {
      Source.fromResource(path)
        .getLines()
        .filter(_.length == wordLength)
        .toSeq
    }
}
