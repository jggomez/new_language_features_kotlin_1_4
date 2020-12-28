// SAM (Single Abstract Method)
fun interface Operation {
    fun add(num1: Int, num2: Int)
}

val operation = Operation { num1, num2 -> num1 + num2 }

fun main() {
    operation.add(5, 5)
}

