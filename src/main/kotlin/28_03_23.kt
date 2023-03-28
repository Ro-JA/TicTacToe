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

// Создадим класс с универсальным типом данных generic
class Question<T> (
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