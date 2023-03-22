package oop

fun main(args: Array<String>) {
 var school1 = School()
 school1.motto()
 school1.mission()
}
interface A{
    fun motto(){
        println("This a our motto")
    }
}
interface B{
    fun mission(){
        println("This a our mission")
    }
}
class School: A, B