package oop_106701_MauraNahdaEfendi.week11

fun String.reverseWords(): String {
    return this.split(" ").reversed().joinToString(" ")
}

fun String.addExclamation(): String {
    return "$this!"
}

fun String?.safeLength(): Int {
    return this?.length ?: 0
}