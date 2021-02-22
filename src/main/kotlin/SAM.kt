// SAM (Single Abstract Method)
fun interface Operation {
    fun add(num1: Int, num2: Int): Int
}

// using lambda
val operation = Operation { num1, num2 -> num1 + num2 }

fun main() {
    println(operation.add(5, 5))
}

// Don't use
val operation2 = object : Operation {
    override fun add(num1: Int, num2: Int): Int {
        TODO("Not yet implemented")
    }
}