package oop_106701_MauraNahdaEfendi.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {

    override fun query(sql: String): List<String> =
        listOf()
}