package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object DiagonalDifference extends App {

  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  var a = Array.ofDim[Int](n,n)
  var sumA = 0
  var sumB = 0
  for(a_i <- 0 to n-1) {
    for(a_j <- 0 to n-1){
      a(a_i)(a_j) = sc.nextInt()
    }
  }
  for(i <- 0 to n-1; j <- 0 to n-1){
    if(i.equals(j)){
      sumA += a(i)(j)
    }
    if((i+j).equals(n-1)){
      sumB += a(i)(j)
    }
  }

  println(Math.abs(sumA - sumB))
}
