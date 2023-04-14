fun main() {
    val listNum = List(readln().toInt()) { readln() }
    val num = listOf(readln())
    println(listNum[1] == num[0] )
    println(num[1] == listNum[2])
}
