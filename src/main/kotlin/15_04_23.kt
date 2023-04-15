//повторение List
fun main() {
    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val product = "Eggs"
    solution(products, product)
}

    fun solution(products: List<String>, product: String) {
       print(products.indices.filter { products[it] == product }.joinToString(" "))
    }