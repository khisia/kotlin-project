fun main(args: Array<String>) {
    // WHILE LOOPS
    // While Loop
    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }
    // Do while loop
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    } while(counterTwo <= 15)
    // FOR LOOPS
    // for in loop
    for ( num in 20 .. 25){
        println(num)
    }
    for (num in 50 downTo 45){
        println(num)
    }
    // for each loop
     var names = listOf("josiah", "james", "lorna", "juma", "victoria")
    names.forEach{
        println(it)
    }
    // REPEAT LOOPS
    repeat(5){
        println("Hello world")
    }
}