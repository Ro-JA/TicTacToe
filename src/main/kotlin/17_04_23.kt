/*
//проблема дня
    fun main() {
        val numbers = mutableListOf(12, 17, 8, 101, 33)
        // do not touch the lines below
        println(numbers.joinToString())
    }*/
/*fun main() {
  *//*  val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")*//*
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical Menu:")
    alphabeticalMenu.forEach() {
        println("${it.name}")
    }
}*/
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)
enum class Daypart { MORNING, AFTERNOON, EVENING, }
fun main() {
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    val shortEvents = events.filter { it.durationInMinutes <= 60 }
    println("You have ${shortEvents.size} short events.")
  /*  val morningEvent = events.filter { it.daypart == Daypart.MORNING }
    val afternoonEvent = events.filter { it.daypart == Daypart.AFTERNOON }
    val eveningEvent = events.filter { it.daypart == Daypart.EVENING }
    println("Morning: ${morningEvent.size} events")
    println("Afternoon: ${afternoonEvent.size} events")
    println("Evening: ${eveningEvent.size} events")*/
    val groupEvent = events.groupBy { it.daypart }
    groupEvent.forEach {
        (daypart, events) ->
        println("${daypart}: ${events.size} event")
    }
    println("Last event of the day: ${events.last().title}")

    val durationOfEvent = if (events[0].durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
    println("Duration of first event of the day: $durationOfEvent")
}






