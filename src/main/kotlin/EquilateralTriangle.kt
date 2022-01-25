import kotlin.math.sqrt

class EquilateralTriangle (_name : String) : Triangle(_name) {
    private var side = 0.0

    fun setDimensions(side: Double) {
        this.side = side
    }

    override fun getArea() : Double {
        var temp = (this.side + this.side + this.side) / 2
        var inner = temp  * (temp - this.side) * (temp - this.side) * (temp - this.side)
        var outer = sqrt(inner)
        return outer
    }

    override fun printDimensions() {
        print("    4.) Equilateral Triangle Stats: ")
        showName()
        println("        Side1 = ${this.side}")
        println("        Side2 = ${this.side}")
        println("        Side3 = ${this.side}")
        println("        Area = ${getArea()}")
    }
}