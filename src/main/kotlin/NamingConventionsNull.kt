data class Player(val name: String, val age: Int)

@ExperimentalStdlibApi
fun main() {
    val name = "Juan"
    // Naming conventions: *orNull
    println(name.toIntOrNull())

    val numbers = listOf(4, 3, 20)
    // Naming conventions: *orNull
    println(numbers.firstOrNull())
    println(numbers.lastOrNull())
    println(numbers.randomOrNull())

    val players = mutableListOf<Player>().apply {
        add(Player("Juan", 20))
        add(Player("Andrea", 30))
        add(Player("Pedro", 15))
    }

    // maxBy vs maxOf
    val playerMax = players.maxByOrNull { it.age }
    println(playerMax)
    val ageMax = players.maxOfOrNull { it.age }
    println(ageMax)

    // minBy vs minOf
    val playerMin = players.minByOrNull { it.age }
    println(playerMin)
    val ageMin = players.minOf { it.age }
    println(ageMin)

    // New runningReduce
    val reduce = numbers.reduce { acc, number -> acc + number }
    println(reduce)
    val runningReduce = numbers.runningReduce { acc, number -> acc + number }
    println(runningReduce)

    // buildList
    val addPlayerStd = true
    val players2 = buildList {
        if (addPlayerStd) {
            add(Player("Jose", 50))
        }
    }
    println(players2)
}
