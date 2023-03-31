/*
// Повторение дата класса


data class Box2(val height: Int, val length: Int, val width: Int)

//fun main() {
//    val(height, length1, length2, width) = IntArray(4) { readln().toInt() }
//
//    val box1 = Box2(height, length1, width)
//    val box2 = box1.copy(length = length2)
//
//    println(box1)
//    println(box2)
//}



//fun main() {
//    Quiz().printProgressBar()
//}

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
}



// Определим свойства расширения
val Quiz.StudentProgress.progressText: String
    get() = "${answer} of ${total} answered" // свойства раштрения не могут хранит даный по этому есть только гетер






// Создадим функцию с раширением викторина не должна принимать параметры  и нечего не возрощает
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answer) {print("▓") }
    repeat(Quiz.total - Quiz.answer) { print( "▒")}
}
class Triangle {
    val angles: Int = 3
    val scale: Double = 1.0

    fun draw() { }
}

class Rectangle {
    val angles: Int = 4
    val scale: Double = 1.0
    fun draw() { }
}

class Hexagon : Shape {
    override val angles: Int = 6
    override val scale: Double = 1.0
    override fun draw() { }
}

interface Shape {
    val angles: Int
    val scale: Double
    fun draw() { }

}

// Do not change the code below.

data class Vector2(var x: Int, var y: Int)

interface Moving {
    var currentCoordinates: Vector2

    var speed: Int

    var direction: Vector2

    // This function changes X and Y coordinates
    // of an object by the amount of the object's speed
    // (object has same speed along X and Y axis)
    // according to direction of the object.
    fun move()


    // This function reduces the speed of an object
    // along X and Y axes, subtracting given amount.
    fun slowDown(subtractedSpeed: Int)

    // This function increases the speed of an object
    // along X and Y axes, adding given amount.
    fun speedUp(addedSpeed: Int)

    // This function sets new direction for the object,
    // overwriting previous values.
    fun rotate(newDirection: Vector2)
}

// Do not change the code above.

class YourMovingObject(
    override var currentCoordinates: Vector2,
    override var speed: Int,
    override var direction: Vector2
) : Moving {

    override fun move() {
        currentCoordinates.x += speed * direction.x
        currentCoordinates.y += speed * direction.y
    }

    override fun slowDown(subtractedSpeed: Int) {
        speed -= subtractedSpeed
    }

    override fun speedUp(addedSpeed: Int) {
        speed += addedSpeed
    }

    override fun rotate(newDirection: Vector2) {
        direction = newDirection
    }
    }

interface Animal {
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String
}

// Do not change code below.

fun bark(): String { return "bark" }
fun meow(): String { return "meow" }
fun speak(): String { return "speak" }

fun walk() { println("walk") }
fun fly() { println("fly") }
fun swim() { println("swim") }

// Do not change code above.

class Dog : Animal {
    override val numberOfLimbs: Int
        get() = 4

            override fun move() {
        walk()
    }

    override fun communicate(): String {
        return "bark"

    }
}

fun printQuiz() {
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
}
*/
