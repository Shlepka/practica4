import kotlin.math.sqrt
fun main(args: Array<String>) {
    // 1 задание
    fun printFullName (firstName:String, lastName:String) {
        println("$firstName" + " " + "$lastName")
    }
    // 2 задание
    printFullName(firstName = "Степан", lastName = "Лавинский")
    // 4 задание
    fun calculateFullName(fullName:String, nameLength: Int): Pair<String, Int> {
        return Pair(fullName, nameLength)
    }
    // 3 задание
    val fullName = calculateFullName(fullName = "Степан Лавинский", nameLength = "Степан Лавинский".length)
    println(fullName)

    // 5 задание
    fun divisible(number: Int, divisor: Int): Boolean {
        return number % divisor == 0
    }
    fun simple(number: Int): Boolean {
        if (number < 0) {
            return false
        }
        if (number <= 3) {
            return true
        }
        val doubleNumber = number.toDouble()
        val root = (sqrt(doubleNumber)).toInt()
        for (divisor in 2..root) {
            if (divisible(number, divisor)) {
                return false
            }
        }
        return true
    }
    println(simple(10))
    println(simple(13))

    // 6 задание
    fun fibon(number: Int): Int {
        if (number <= 0) {
            return 0
        }
        if (number == 1 || number == 2) {
            return 1
        }
        return fibon(number - 1) + fibon(number - 2)
    }
    println(fibon(1))
    println(fibon(5))
    println(fibon(8))
    println(fibon(11))
    println(fibon(16))

}