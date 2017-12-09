package hackerrank.practise.algorithm.warmup

import java.util.Scanner

object TimeConversion extends App {

  def timeConversion(s: String): String =  {
    var newTime = s
    if(s.charAt(8).equals('P')){
      var oldHour = s.substring(0,2).toInt
      var newHour = oldHour
      if(!oldHour.equals(12)){
        newHour = oldHour + 12
      }
      newTime = newHour + s.substring(2, 8)
    }else{
      var oldHour = s.substring(0,2)
      var newHour = oldHour
      if(oldHour.equals("12")){
        newHour = "00"
      }
      newTime = newHour + s.substring(2, 8)
    }
    newTime
  }

  val sc = new Scanner(System.in)
  val s = sc.next
  val result = timeConversion(s)
  println(result)
}
