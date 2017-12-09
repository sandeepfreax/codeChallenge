package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object MiniMaxSum extends App {

  val sc = new Scanner(System.in)
  var arr = new Array[Long](5)
  for(arr_i <- 0 to 4) {
    arr(arr_i) = sc.nextLong
  }
  val newArr = arr.sorted
  var minSum, maxSum = 0L
  for(i <- 0 to 3){
    minSum += newArr(i)
  }

  for(i <- 1 to 4){
    maxSum += newArr(i)
  }

  println(minSum + " " + maxSum)
}
