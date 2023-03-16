package oop

fun main(args: Array<String>) {
   var f1 = Fruit("Mango","Yellow", "200g", 40.0)
   var f2 = Fruit("Mango","Yellow", "200g", 30.0)
   println(f1.name)
    println(f2.color)
    var c1 = Cars("Toyota", "KDA112K", 4689090.0)
    var c2 = Cars("Mercedes", "KDd123K", 7500090.0)
    c1.accelerate()
    c2.brake()
    println(c2.reg_no)

}
class Fruit(name:String, color:String, size:String, price:Double){
    var name:String
    var color : String
    var size : String
    var price: Double
    // Initialize the properties
    init{
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
}
class Cars(model:String, reg_no:String, price: Double){
    var model:String
    var reg_no:String
    var price:Double

    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("I am a $model and i can brake")
    }
}