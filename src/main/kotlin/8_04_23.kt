/*
// програма по свойствам выдает самый холдный город
class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if(value < -92 && value > 57) {
                field = when (name) {
                    "Dubai" -> 30
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    else -> 0
                }
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

    val minTemperate = mutableListOf<City>(firstCity, secondCity, thirdCity)
    println(minTemperate.minOfOrNull {it.degrees})

}*/
/*
// повторение mutableList
fun main() {
    val characters = mutableListOf('a', 'z', 'e', 'd')
    println(characters.joinToString())
}*/



