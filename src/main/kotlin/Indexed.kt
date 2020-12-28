fun main() {
    val numbers = listOf(6, 5, 10)
    // Naming conventions: * Indexed
    numbers.forEachIndexed { index, elem ->
        println(index)
        println(elem)
    }

    // forEach vs onEach
    numbers
        .filter { it > 7 }
        .onEach {
            // Middle operator
            print(it)
        }
        .flatMapIndexed { _, elem -> listOf(elem) }
}
