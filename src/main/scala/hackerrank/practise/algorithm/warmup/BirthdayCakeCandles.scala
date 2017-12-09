package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object BirthdayCakeCandles extends App {

  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  var ar = new Array[Int](n)
  for(ar_i <- 0 to n-1) {
    ar(ar_i) = sc.nextInt()
  }
  val sortedArr = ar.sorted.reverse
  println(sortedArr.filter(_.equals(sortedArr(0))).size)
}
