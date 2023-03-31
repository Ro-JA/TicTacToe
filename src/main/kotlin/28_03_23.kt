// класс для заполнения бланка ответов
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty : String
)

// класс для ответов правда ли лож
class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

//класс для ответов по номерам
class NumberQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

// Создадим дата  класс с универсальным типом данных generic
data class Question<T> (
    val  questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
// дата класс из практики на хайперскил
data class Box(val height: Int, val length: Int, val width: Int) {
    var size: Int = height + length + width
    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
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

