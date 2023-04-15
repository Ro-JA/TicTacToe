//повторение List
fun main() {
    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val product = "Eggs"
    solution(products, product)
}

    fun solution(products: List<String>, product: String) {
        if (product.contains(product)) {
            for (index in products.indices) {
                if (products[index] == product) {
                    print("$index ")
                }
            }
        }
    }