fun main() {
    val result = ArrayDeque(listOf(5, 50, 1))
    result.addFirst(40)
    result.addFirst(150)
    println(result)
    result.add(50)
    println(result)
    result.addLast(300)
    println(result)
    println(result.removeFirst())
    println(result)
}