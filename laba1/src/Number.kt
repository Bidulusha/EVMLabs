class Number () {
    private val number: Array<Int> = arrayOf(0, 0)
    private var system: Int = 0

    constructor(num: String, sys: String) : this() {
        val temp = num.split(".")
        try {
            number[0] = temp[0].toInt()
            number[1] = temp[1].toInt()
            system = sys.toInt()
        }
        catch(e: TypeCastException){
            println(e.printStackTrace())
        }
    }

    private fun toDecimal(){

    }

    //CORE FUNCTIONS
    override fun toString(): String{
        println(number[0])
        return "${number[0]}.${number[1]} $system"
    }

}