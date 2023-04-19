// повторения с хайпрескил
class City(val name: String) {
    var degrees: Int = 0
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
    println("${firstCity.degrees},\n ${secondCity.degrees},\n ${thirdCity.degrees}")
}