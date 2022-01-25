import kotlin.math.sqrt

class Square(_name: String) : Shape(_name) {
    private var length = 0.0
    private var height = 0.0
    private var isSquare = 1

    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
        if (this.length == this.height)
            this.isSquare = 1
        else
            this.isSquare = 0
    }

    override fun printDimensions() {
        print("    3.) Square Stats: ")
        showName()
        println("        Length = ${this.length}")
        println("        Height = ${this.height}")
        println("        Area = ${getArea()}")
        if (this.isSquare == 1)
            println("        Square = True")
        else
            println("        Square = False")
    }

    override fun getArea() : Double {
        return this.length * this.height
    }
}