package oop_106701_MauraNahdaEfendi.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)