// повторение циклы для списков
fun main() {
    val num = readln().toInt()
    val list = List(num) { readln() }
    val list2 = readln().split(" ")
    println(list)
    println(list2)

}