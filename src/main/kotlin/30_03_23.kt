// Повторение дата класса
/*
data class Box2(val height: Int, val length: Int, val width: Int)

fun main() {
    val(height, length1, length2, width) = IntArray(4) { readln().toInt() }

    val box1 = Box2(height, length1, width)
    val box2 = box1.copy(length = length2)

    println(box1)
    println(box2)
}
*/

fun main() {
    Quiz.printProgressBar()
}

//создадим класс викторина для соопутствующего обекта
class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // класс с одним экземпляром обекта singleton
    companion object StudentProgress {
        val total: Int = 10
        val answer: Int = 3
    }
}

// Определим свойства расширения
val Quiz.StudentProgress.progressText: String
    get() = "${answer} of ${total} answered" // свойства раштрения не могут хранит даный по этому есть только гетер

// Создадим функцию с раширением викторина не должна принимать параметры  и нечего не возрощает
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answer) {print("▓") }
    repeat(Quiz.total - Quiz.answer) { print( "▒")}
}
