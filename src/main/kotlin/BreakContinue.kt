fun main() {
    val numbers = listOf(
        4,
        50,
        10,
    )

    for (number in numbers) {
        when (number) {
            4 -> break
            10 -> continue
        }
    }
}