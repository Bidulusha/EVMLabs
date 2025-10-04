import Number

object NumberManager {
    public fun getNumber(str: String) : Number{
        val temp = str.split(" ")
        return Number(temp[0], temp[1])
    }


}