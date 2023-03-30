// Повторение дата класса
data class Box2(val height: Int, val length: Int, val width: Int)

fun main() {
    val inputParam = IntArray(4) { readln().toInt() }

    val box1 = Box2(inputParam[0], inputParam[1], inputParam[3])
    val box2 = box1.copy(length = inputParam[2])

    println(box1)
    println(box2)
}