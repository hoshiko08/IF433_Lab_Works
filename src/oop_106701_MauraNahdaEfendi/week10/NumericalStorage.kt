package oop_106701_MauraNahdaEfendi.week10

class NumericalStorage<T : Number>(
    private val number: T
) {

    fun square(): Double {
        return number.toDouble() * number.toDouble()
    }
}