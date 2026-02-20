package oop_106701_MauraNahdaEfendi.week03

class Employee {
    var name: String = ""

    var salary: Int = 0
        set(value) {
            this.salary = value // SALAH! menyebabkan infinite loop
        }
}