package oop

fun main(args: Array<String>) {
  var p1 = Person("King", "100")
  p1.setResidence("Nairobi")
  println(p1.getResidence())
    p1.setSalary(300000.0)
    println(p1.getSalary())
    println(p1.name)

}
class Person(var name:String, var age:String){

    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
     this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("Yeah, I can walk")
    }
    fun run(){
        println("Yeah, I can run")
    }
}