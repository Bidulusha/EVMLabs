package org.example

import org.example.NumberManager

fun main() {
    println("Введите число и через пробел его систему исчисления")
    val number = readln()
    val num = NumberManager.getNumber(number)
    println(num.toString())
    println(num.toDecimal())
    num.toSystem(2, 4)
}