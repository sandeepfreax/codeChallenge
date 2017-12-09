package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object Staircase extends App {

  val sc = new Scanner(System.in)
  val n = sc.nextInt

  (1 to n).foreach({
    x => println(" "*(n - x) + "#"*x)
  })

}
