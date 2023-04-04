/*
// проблема дня с hyperskill вторичные конструкторы
class EspressoMachine() {
    var costPerServing: Float = 0.0f

    constructor(
        coffeeCapsulesCount: Int,
        totalCost: Float
    ) : this() {
        this.costPerServing = totalCost / coffeeCapsulesCount
    }
    constructor(
        coffeeBeansWeight: Float,
        totalCost: Float
    ) : this() {
        this.costPerServing = totalCost / coffeeBeansWeight / 10
    }
}
*/

// новая реализация вторичных конструкторов через data class
data class EspressoMachine(var costPerServing: Float = 0.0f) {
    companion object {
        const val BEANS_PER_CUP = 10
    }

    constructor(coffeeCapsulesCount: Int, totalCost: Float) : this(totalCost / coffeeCapsulesCount)
    constructor(coffeeBeansWeight: Float, totalCost: Float) : this(totalCost / (coffeeBeansWeight / BEANS_PER_CUP))
}

