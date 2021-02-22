fun main() {
    val numbers = listOf(
        4,
        50,
        10,
    )

    // before with labels
    numbers@ for (number in numbers) {
        when (number) {
            4 -> break@numbers
            10 -> continue@numbers
        }
    }

    // Now -> labels aren't necessary
    for (number in numbers) {
        when (number) {
            4 -> break
            10 -> continue
        }
    }
}