// проблема дня
fun main() {
    val numbers = MutableList(100) { 0 }
    numbers[99] = 100
    numbers[9] = 10
    numbers[0] = 1
    // do not touch the lines below
    println(numbers.joinToString())
}
