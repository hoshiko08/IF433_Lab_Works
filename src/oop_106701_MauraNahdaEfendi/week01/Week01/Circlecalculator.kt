package oop_106701_MauraNahdaEfendi.week01.Week01

fun main(args: Array<String>) {
// Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14
// Calculation
    var area: Double = pi * radius * radius
    // Output Concatenation
    println(checkSize(area))
// Logic check
    checkSize(area)
}
fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"
