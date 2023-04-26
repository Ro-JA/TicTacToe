fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    numbers[0] = numbers.last().also { numbers[numbers.lastIndex] = numbers.first() }
    println(numbers.joinToString(separator = " "))
}
