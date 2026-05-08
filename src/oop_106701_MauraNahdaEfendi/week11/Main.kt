package oop_106701_MauraNahdaEfendi.week11

fun main() {

    val text = "Hello Kotlin"

    println(text.reverseWords())
    println(text.addExclamation())

    val nullableText: String? = null

    println(nullableText.safeLength())
}