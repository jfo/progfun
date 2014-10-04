// package recfun
// import common._

object Main {
  def main(args: Array[String]) {
    println("Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println(countChange( 100 , List(1, 5, 10, 25, 50)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else  pascal(c, r-1) + pascal(c-1, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

        def inner_balance(chars: List[Char], ind: Int): Boolean = {
            if (ind < 0) false else {
              if (chars.isEmpty) {
                ind == 0
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



  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) {
      1
    } else if (money < 0 || coins.isEmpty) {
      0
    } else {
      countChange(money, coins.tail) + countChange((money - coins.head), coins)
    }
  }

}



