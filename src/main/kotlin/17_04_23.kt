/*
//проблема дня
    fun main() {
        val numbers = mutableListOf(12, 17, 8, 101, 33)
        // do not touch the lines below
        println(numbers.joinToString())
    }*/
fun main() {
  /*  val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")*/
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical Menu:")
    alphabeticalMenu.forEach() {
        println("${it.name}")
    }
}
