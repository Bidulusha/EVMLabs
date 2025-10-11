package org.example

import org.example.Number
import java.lang.Exception

object NumberManager {

    public fun getNumber(str: String) : Number{
        try {
            var temp = str.split(" ")
            return Number(temp[0], temp[1])
        }
        catch (e: Exception) {
            println(e.stackTrace.toString())
        }
        return Number("0.0", "-1")
    }
}