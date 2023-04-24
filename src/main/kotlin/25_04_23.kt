fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val a = numbers[0]
    val b = numbers[numbers.size - 1]
    val c = a
    numbers[0]= b
    println(numbers)
    numbers[numbers.size - 1] = c
    println(numbers)

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}