/*fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    // do not touch the lines above
    val newList = firstList + secondList
    println(newList.joinToString())
}*/
fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val route = readln().toInt() % list.size
    if (route == 0) {
        println(list.joinToString(" "))
    } else {
        for (i in 1..route) {
            list.add(0, list.removeLast())
        }
        println(list.joinToString(" "))
    }
}
fun solution1(strings: List<String>, str: String): Int = strings.count { it == str }