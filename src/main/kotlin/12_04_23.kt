//повторения цикла
import java.util.Scanner

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.toTypedArray()
    val list = mutableListOf<Int>(*numbers)
    val max = list.maxOrNull()
    val index = list.indexOf(max)
    println("$max ${index + 1}")
}