// проблема дня с hyperskill вторичные конструкторы
class EspressoMachine1() {
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


// новая реализация вторичных конструкторов через data class
data class EspressoMachine2(var costPerServing: Float = 0.0f) {
    companion object {
        const val BEANS_PER_CUP = 10
    }

    constructor(coffeeCapsulesCount: Int, totalCost: Float) : this(totalCost / coffeeCapsulesCount)
    constructor(coffeeBeansWeight: Float, totalCost: Float) : this(totalCost / (coffeeBeansWeight / BEANS_PER_CUP))
}


// работа с set списками
// возрощает set список из mutableList списка
fun solution(strings: MutableList<String>): Set<String> = strings.toSet()
//Обеденяет два set списка в один
fun solution(first: Set<String>, second: Set<String>): Set<String> = first + second
//Возрощает true если есть элементы из изменяемого списка
fun solution(first: Set<String>, second: MutableList<String>): Boolean = first.containsAll(second)

// работа со списками

