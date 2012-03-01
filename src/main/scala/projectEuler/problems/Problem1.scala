package projectEuler.problems

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Robert Giacinto
 */

object Problem1 {

  private def sum(list: List[Int]): Int = (0 /: list)(_ + _)

  private def sumDivisibleByN(sum: Int, n: Int) = (List.range(0, sum, n)).map {
    case i => i
  }


  def solve {
    println("=========================================================================================================")
    println("Problem 1: \n" +
      "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n  " +
      "Find the sum of all the multiples of 3 or 5 below 1000.\n")
    val sum3 = sum(sumDivisibleByN(1000, 3))
    val sum5 = sum(sumDivisibleByN(1000, 5))
    val sum15 = sum(sumDivisibleByN(1000, 15))
    print("Solution: ")
    println(sum3 + sum5 - sum15)
    println("=========================================================================================================")
  }
}
