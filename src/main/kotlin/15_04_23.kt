//повторение List
/*
fun main() {
    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val product = "Eggs"
    solution(products, product)
}

*/
/*
    выводим индекс элемента равный элементу заданому, берем списо products через функцию indices берем индекс который
    через функцию filter равен задоному элементу, через joinToString добовляем пробел и печатаем
    fun solution(products: List<String>, product: String) {
       print(products.indices.filter { products[it] == product }.joinToString(" "))
    }*//*

//через цикл forEachIndexed проходим по индексам а и элеметам s  сравневаем  элемент с заданым значением и печатаем индекс
fun solution(ps: List<String>, p: String) = ps.forEachIndexed{ a, s -> if(s == p) print("$a ") }

fun createMutableList(): MutableList<String>  = mutableListOf("Tokyo", "Moscow", "Paris", "Washington", "Beijing")
*/

/*
fun main() {
    val numbers = MutableList<Int>(100) {0}
    numbers.add(0, 1)
    numbers.add(9, 10)
    numbers.add(99, 100)
    // do not touch the lines below
    println(numbers.joinToString())
}*/

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }
   val   softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}