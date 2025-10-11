package org.example

import java.util.function.DoubleToIntFunction
import kotlin.math.pow
import kotlin.math.sign

class Number () {
    private var sign : Boolean = false
    private val number: ArrayList<ArrayList<Int>> = arrayListOf(arrayListOf(), arrayListOf())
    private var system: Int = 0

    constructor(num: String, sys: String) : this() {
        val temp = num.split(".")
        try {
            for(num in temp[0]){
                if (num.code == 45){
                    sign = true
                }
                if (num.code < 58) number[0].add(num.code - 48)
                else number[0].add(num.code - 55)
            }
            for(num in temp[1]){
                if (num.code < 58) number[1].add(num.code - 48)
                else number[1].add(num.code - 55)
            }
            system = sys.toInt()
        }
        catch(e: TypeCastException){
            println(e.printStackTrace())
        }
    }

    public fun toDecimal() : Double{
        var temp : Double = 0.0
        for (num in 0..<number[0].size){
            temp += number[0][num] * system.toDouble().pow(number[0].size - num - 1)
        }
        for (num in 0..<number[1].size){
            temp += (number[1][num] / (system.toDouble().pow(num + 1)))
        }
        return temp
    }

    public fun toSystem(sys: Int, signAfterPoint : Int) : Number{
        val tempDecimalNumber = this.toDecimal()
        val tempArrayLeft = arrayListOf<Int>()
        val tempArrayRight = arrayListOf<Int>()
        var left : Int = tempDecimalNumber.toInt()
        var right = tempDecimalNumber - left

        while (left > 0){
            tempArrayLeft.addFirst(left % sys)
            left = left / sys
        }
        while (tempArrayRight.size < signAfterPoint){
            tempArrayRight.add((right * sys).toInt())
            right = right * sys - (right * sys).toInt()
        }
        println(tempArrayLeft.toString())
        println(tempArrayRight.toString())
        return Number("0.0", "0")
    }

    //CORE FUNCTIONS
    override fun toString(): String{
        return "${number[0].toString()}.${number[1].toString()} $system"
    }

}