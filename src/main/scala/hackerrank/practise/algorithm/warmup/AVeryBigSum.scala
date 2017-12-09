package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object AVeryBigSum extends App {

  val sc = new Scanner(System.in)
  var n = sc.nextInt();
  var ar = new Array[Long](n);
  for(ar_i <- 0 to n-1) {
    ar(ar_i) = sc.nextLong();
  }
  println(ar.sum)
}
