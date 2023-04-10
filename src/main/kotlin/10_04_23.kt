//сортировка пузыркем
fun main() {
    val array = intArrayOf(1,5,3,9,10,2,4,6,8,11)
    println(array.toList())
    array.bubbleSort()
    println(array.toList())
}
// функция для сортировки
private fun IntArray.bubbleSort() {
    var sort = false // флаг для окончания сортировки
    while (!sort) {
        for(i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sort = false
            }
        }
    }
}

private fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}
