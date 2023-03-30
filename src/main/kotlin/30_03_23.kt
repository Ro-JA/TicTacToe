// Повторение дата класса
data class Box2(val height: Int, val length: Int, val width: Int)
fun main() {
    val height1 = readln().toInt()
    val length1 = readln().toInt()
    val length2 = readln().toInt()
    val width1 = readln().toInt()

    val box1 = Box2(height1, length1, width1)
    val box2 = box1.copy(length = length2)

    println(box1)
    println(box2)
}