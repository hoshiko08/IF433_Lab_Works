package oop_106701_MauraNahdaEfendi.week10

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {

    fun getKey(): K {
        return key
    }

    fun getValue(): V {
        return value
    }
}