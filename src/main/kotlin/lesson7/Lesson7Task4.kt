package lesson7

fun main() {
timerApp2()
}

fun timerApp2(){
    println("Enter your time: ")
    val time = readln().toInt()

    var timeCounter = time
    for (i in timeCounter downTo 1) {
        println("$i seconds left")
        Thread.sleep(1000)
    }
    println("Times is over")
}