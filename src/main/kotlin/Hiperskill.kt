/*
class City(val name: String) {
    var degrees: Int = 5
        set(value) {
            if (value in -92..57) {
                field = value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    val temperatureInCity =
    print("")
}*/
fun main() {
    val name = readln()
    val age = readln().toInt()
    val balance = readln().toInt()
    val name2 = readln()
    val age2 = readln().toInt()
    val balance2 = readln().toInt()
    val client = Client(name, age, balance)
    val client2 = Client(name2, age2, balance2)
    println(client == client2)

}

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

}

class Kitty() {
    var color: String = "black"
    var age: Int = 1

    constructor(_color: String) : this() {
        color = _color
    }

    constructor(_age: Int) : this() {
        age = _age
    }

    constructor(_age: Int, _color: String) : this() {
        color = _color
        age = _age
    }

    constructor(_color: String, _age: Int) : this() {
        color = _color
        age = _age
    }
}