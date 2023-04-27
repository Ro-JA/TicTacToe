class Fabric(val color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(color: String, pattern: String, patternColor: String) : this(color.also { this.color = it }) {
        println("$patternColor $pattern dots pattern is printed on the fabric")
    }
}