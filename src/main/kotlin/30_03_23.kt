// Повторение дата класса
data class Box2(val height: Int, val length: Int, val width: Int)

fun main() {
    val(height, length1, length2, width) = IntArray(4) { readln().toInt() }

    val box1 = Box2(height, length1, width)
    val box2 = box1.copy(length = length2)

    println(box1)
    println(box2)
}