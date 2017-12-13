package hackerearth.practise.compete

object SherlockWatson extends App {

  val sc = scala.io.StdIn
  val q = sc.readLine()
  val n = sc.readInt()
  val ranks = sc.readLine().split(" ").map(x => x.toInt)

  def getMapPfSubstring(str : String) = {
    val strMap = collection.mutable.Map[Integer, String]()
    var index = 1
    for(i <- 0 to str.length){
      var pointer = i
      while(pointer < str.length) {
        pointer += 1
        val st = str.substring(i, pointer)
        strMap.put(index, st)
        index += 1
      }
    }
    strMap
  }

  val myMap = getMapPfSubstring(q)

  ranks.foreach(x => {
    if(x > myMap.size){
      println(-1)
    }else{
      println(myMap.get(x).get)
    }
  })
}
