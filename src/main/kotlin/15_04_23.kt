//повторение List
fun main() {
    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val product = "Eggs"
    solution(products, product)
}

/*
    выводим индекс элемента равный элементу заданому, берем списо products через функцию indices берем индекс который
    через функцию filter равен задоному элементу, через joinToString добовляем пробел и печатаем
    fun solution(products: List<String>, product: String) {
       print(products.indices.filter { products[it] == product }.joinToString(" "))
    }*/
//через цикл forEachIndexed проходим по индексам а и элеметам s  сравневаем  элемент с заданым значением и печатаем индекс
fun solution(ps: List<String>, p: String) = ps.forEachIndexed{ a, s -> if(s == p) print("$a ") }