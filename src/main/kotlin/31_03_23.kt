// работа с let()

fun main(){
    Quiz.printProgressBar()
//    использование apply()
//    val quiz = Quiz().apply {
//        printQuiz()
//    }
//    нам даже не нужно переменая для класса
    Quiz().apply {
        printQuiz()
    }
}

// Создаем интерфейс для пичатания прогресса
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

//создадим класс викторина  c раширением интерфейса печатьпрогресса
class Quiz : ProgressPrintable {
    // переопределяем переменую прогрес из интерфейса
    override val progressText: String
        get() = "${answer} of ${total} answered"
    //    переопределяем функцию из интерфейса печать прогрес
    override fun printProgressBar() {
        repeat(Quiz.answer) { print("▓") }
        repeat(Quiz.total - Quiz.answer) { print("▒") }
        println()
        println(progressText)
    }

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // класс с одним экземпляром обекта singleton
    companion object StudentProgress {
        val total: Int = 10
        val answer: Int = 3
    }
//    функция печать лотерее без let()
/*fun printQuiz() {
    println(question1.questionText)
    println(question1.answer)
    println(question1.difficulty)
    println()
    println(question2.questionText)
    println(question2.answer)
    println(question2.difficulty)
    println()
    println(question3.questionText)
    println(question3.answer)
    println(question3.difficulty)
    println()
}*/
// создаем функцию печать лотерее с let()
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
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

// Создадим дата  класс с универсальным типом данных generic
data class Question<T> (
    val  questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
