package hackerearth.practise.compete

object BobAndGcd extends App {

  val sc = scala.io.StdIn
  val testCases = sc.readInt()
  for(i <- 0 to testCases){
    val ar = sc.readLine()
    val k = ar.split(" ")(0).toLong
    val n = ar.split(" ")(1).toLong
    val arr = sc.readLine().split(" ").map(x => x.toLong)
    var operations = 0
    arr.map(x => {
      if(x % k != 0){
        if((x + 1) % k == 0){
          operations += 1
          x+1
        }else{
          operations += 1
          x - 1
        }
      }
    })
    println(operations)
  }
}
