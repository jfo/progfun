import math.abs

object exercise {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double) = 
    abs((x - y) / x) / x < tolerance
  def fixedPoint(f: Double => Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}
