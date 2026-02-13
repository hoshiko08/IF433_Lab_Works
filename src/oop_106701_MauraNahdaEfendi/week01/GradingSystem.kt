package oop_106701_MauraNahdaEfendi.week01

fun main () {
    // REFACTOR: Gunakan val dan hapus tipe data eksplisit
    var name = "John Thor"
    var score = 80

    //REFACTOR: String Tamplate ($name)
    println("Nama:  $name  , Nilai:  $score")
    val grade = when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}
