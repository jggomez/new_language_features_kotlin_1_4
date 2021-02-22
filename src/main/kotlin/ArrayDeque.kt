fun main() {
    val numbers = ArrayDeque(listOf(5, 50, 1))
    numbers.addFirst(40)
    numbers.addLast(300)
    numbers.removeFirst()
    println(numbers)
}