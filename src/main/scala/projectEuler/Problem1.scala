package projectEuler

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {

  private def sum(list: List[Int]): Int = (0 /: list)(_ + _)

  private def sumDivisibleByN(sum: Int, n: Int) = for (i <- List.range(0, sum, n)) yield i


  def main(args: Array[String]) {
    val sum3 = sum(sumDivisibleByN(1000,3))
    val sum5 = sum(sumDivisibleByN(1000,5))
    val sum15 = sum(sumDivisibleByN(1000,15))

    println(sum3+sum5-sum15)
  }

}
