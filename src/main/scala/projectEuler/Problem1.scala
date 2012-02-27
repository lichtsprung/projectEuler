package projectEuler

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {

  private def sum(list: List[Int]): Int = (0 /: list)(_ + _)

  private def sumDivisibleByN(sum: Int, n: Int) = for (i <- List.range(0, sum, n)) yield i


  def main(args: Array[String]) {
    println(sum(sumDivisibleByN(1000, 5)))
    println(sum(sumDivisibleByN(1000, 3)))
    println(sum(sumDivisibleByN(1000, 15)))
    println(sum(sumDivisibleByN(1000, 3)) + sum(sumDivisibleByN(1000, 5) - sum(sumDivisibleByN(1000, 15))))
    
    var summe = 0;
    for(i <- 1 to 1000){
        if (i % 15 == 0){
          summe += i;
        }
    }
    
    println(summe)
  }

}
