fun main(args: Array<String>) {
  avg(34, 424.0)
  avg(34, 424.0, 678)
}
fun avg(x:Int, y:Double){
    var answer = (x + y) / 3.0
    println("Results from avg1 is $answer")
}
fun avg(x:Int, y:Double, z:Int){
    var answer = (x + y + z) / 3.0
    println("Results from avg2 is $answer")

}