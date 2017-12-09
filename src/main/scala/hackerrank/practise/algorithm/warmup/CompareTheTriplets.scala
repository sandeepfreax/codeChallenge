package hackerrank.practise.algorithm.warmup

import java.util.Scanner

import scala.collection.mutable.ListBuffer

object CompareTheTriplets extends App {

  val sc = new Scanner(System.in)
  val a = new Array[Int](3)
  val b = new Array[Int](3)
  var aPoint = 0
  var bPoint = 0

  for(i <- 0 to 2){
    a(i) = sc.nextInt
  }

  for(i <- 0 to 2){
    b(i) = sc.nextInt
  }

  for(i <- 0 to 2){
    if(a(i) > b(i)){
      aPoint += 1
    }else if(b(i) > a(i)){
      bPoint += 1
    }
  }

  println(aPoint + " " + bPoint)
}
