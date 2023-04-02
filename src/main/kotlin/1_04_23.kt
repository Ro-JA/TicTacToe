fun main() {
   /* val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    for (planet in solarSystem) {
        println(planet)
    }*/

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    for (planet in solarSystem ) {
        println(planet)
    }
    solarSystem[3] = "Future Moon"
    for (planet in solarSystem ) {
        println(planet)
    }
    solarSystem.removeAt(9)
    solarSystem.remove("Mercury")
    println()
    for (planet in solarSystem ) {
        println(planet)
    }
    println()
    println ("Future Moon" in solarSystem )


}