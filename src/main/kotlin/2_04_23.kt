import kotlin.math.abs

/*
fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains(ad"Pluto"))
}*/
fun main() {
    val listNumber = listOf<Int>(8, 11, 13, 2)
    solution(listNumber)
}
fun solution(numbers: List<Int>) {
    for (i in numbers) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}