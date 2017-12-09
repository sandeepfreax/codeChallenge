package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object SimpleArraySum extends App {

  val sc = new Scanner(System.in)
  var n = sc.nextInt();
  var ar = new Array[Int](n);
  for(ar_i <- 0 to n-1) {
    ar(ar_i) = sc.nextInt();
  }
  println(ar.sum)
}
