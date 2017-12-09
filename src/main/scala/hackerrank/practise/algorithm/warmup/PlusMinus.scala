package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object PlusMinus extends App {

  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  var arr = new Array[Int](n)
  var sumPositive = 0F
  var sumNegative = 0F
  var sumZero = 0F

  for(arr_i <- 0 to n-1) {
    val input = sc.nextInt
    if(input < 0){
      sumNegative += 1
    }else if(input > 0){
      sumPositive += 1
    }else{
      sumZero += 1
    }
  }

  println(BigDecimal(sumPositive/n).setScale(6, BigDecimal.RoundingMode.HALF_UP))
  println(BigDecimal(sumNegative/n).setScale(6, BigDecimal.RoundingMode.HALF_UP))
  println(BigDecimal(sumZero/n).setScale(6, BigDecimal.RoundingMode.HALF_UP))
}
