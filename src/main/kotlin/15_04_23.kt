//повторение List
fun main() {
    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs" )
    val product = "Eggs"
    solution(products, product)
}

fun solution(products: List<String>, product: String) {
    if (products.isNotEmpty()) {
        if (product.contains(product)) {
            for (i in products) {
                if (i == product) {
                    print("${products.indexOf(product)} ")
                }
            }
        }
    }
}