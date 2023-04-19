/*
// повторения с хайпрескил
const val DUBAI = 30
const val MOSCOW = 5
const val HANOI = 20
const val MIN = -92
const val MAX = 57

data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (value !in MIN..MAX) {
                when (name) {
                    "Dubai" -> DUBAI
                    "Moscow" -> MOSCOW
                    "Hanoi" -> HANOI
                    else -> 0
                }
            } else value
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
    println(
        when {
            firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> firstCity.name
            secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> secondCity.name
            thirdCity.degrees < secondCity.degrees && thirdCity.degrees < firstCity.degrees -> thirdCity.name
            else -> "neither"
        }
    )
}*/

//проблема дня
fun main() {
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    println(beyondTheWall.sorted() == backToTheWall.sorted())
}