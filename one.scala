
  def improve(x: Double, y: Double) = 1

  def isGoodEnough(x: Double, y: Double) = true

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def balance(chars: List[Char]): Boolean = {

      def inner_balance(chars: List[Char], ind: Int): Boolean = {
          if (ind < 0) false else {
            if (chars.isEmpty) {
              if (ind == 0) true else false
            } else {
              if (chars.head.toString == "(") {
                inner_balance(chars.tail, ind + 1)
              } else if (chars.head.toString == ")") {
                inner_balance(chars.tail, ind-1)
              } else {
                inner_balance(chars.tail, ind)
              }
          }
        }
      }

      inner_balance(chars, 0)
    }

  def run(string: String){
    if (balance(string.toList)) println("yay!") else println("boooo!")
  }

// run("(if (zero? x) max (/ 1 x))")
// run("I told him (that it’s not (yet) done). (But he wasn’t listening)")
// run(":-)")
// run("())(")

def countChange(money: Int, coins: List[Int]): Int = {
  if (money == 0) {
    return 1 
  } else if (money < 0 || coins.isEmpty) {
    return 0 
  } else { 
    countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}

println(countChange(100, List( 1,5,10,25,50 )))


