import Number

fun main() {
    println("Введите число и через пробел его систему исчисления")
    val number = readln()
    val num = NumberManager.GetNumber(number)
    println(num.toString())
}