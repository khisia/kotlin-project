package oop

fun main(args: Array<String>) {
    // Inheritance and Polymorphism
    var studentOne = Student("jared", "jared@gmail.com","jared123")
    var studentTwo = Student("Ephraim", "Ephraim@gmail.com","ephraim123")
    println(studentOne.name)
    studentTwo.register()
    var teacherOne = Teacher("Wafula", "wafula@gmail.com","wafula123")
    var teacherTwo = Teacher("erick", "erick@gmail.com","erick123")
    println(teacherOne.name)
    teacherTwo.register()
    teacherOne.suspendStudent()
    var headteacherOne = Headteacher("Ken", "Ken@gmail.com","Ken123")
    var headteacherTwo = Headteacher("juma", "juma@gmail.com","juma123")

    println(headteacherOne.name)
    headteacherTwo.approveCash()
    headteacherTwo.suspendStudent()
    headteacherTwo.login()
}
 open class Student(open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You have registered with email $email and password $password")
    }
    fun login(){
        println("You have logged in with email $email and password $password")
    }
}

open class Teacher(name:String, email: String, password: String,):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}
class Headteacher(name:String, email: String, password: String):Teacher(name, email, password){
    fun approveCash(){
        println("Yeah, I can approve cash")
    }
}