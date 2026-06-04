package oop_106701_MauraNahdaEfendi.week14

class MySQLDatabase {
    fun query(sql: String): List<String> =
        listOf()
}

class UserService {

    private val database = MySQLDatabase()

    fun getUser(id: Int) =
        database.query("SELECT * FROM users WHERE id = $id")
}