//повторения цикла
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numList: MutableList<Int> = mutableListOf<Int>()
    while (scanner.hasNext()) {
        val num = scanner.nextInt()
        numList.add(num)
    }
    val maxNum = numList.maxOrNull()
    val indexNum = numList.indexOf(maxNum)
    println("$maxNum ${indexNum + 1}")
}