/*
//сортировка пузыркем
fun main() {
    val array = intArrayOf(1,5,3,9,10,2,4,6,8,11,7)
    array.sort()
    println(array.toList())
    array.bubbleSort()
    println(array.toList())
}
// функция для сортировки
private fun IntArray.bubbleSort() {
    var sort = false // флаг для окончания сортировки
    while (!sort) {
        sort =true
        for(i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sort = false
            }
        }
    }
}
// функция для смены местами значений
private fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}
*/
/*
// повторение свойств класса
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
    println(minTemperate.minOfOrNull { it.degrees })
}
*/
