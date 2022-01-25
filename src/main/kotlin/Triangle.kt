import kotlin.math.sqrt

class Triangle(_name: String) : Shape(_name) {
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0
    private var isEquilat = 0

    open fun setDimensions(side1 : Double, side2 : Double, side3 : Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
        if (side1 == side2) {
            if (side2 == side3)
                isEquilat = 1
        }
    }

    override fun printDimensions() {
        print("    1.) Triangle Stats: ")
        showName()
        println("        Side1 = ${this.side1}")
        println("        Side2 = ${this.side2}")
        println("        Side3 = ${this.side3}")
        println("        Area = ${getArea()}")
        if (this.isEquilat == 1)
            println("        Equilateral = True")
        else
            println("        Equilateral = False")
    }

    override fun getArea() : Double {
        var temp = this.side1 + this.side2 + this.side3
        var s = temp / 2
        var inner = s  * (s - this.side1) * (s - this.side2) * (s - this.side3)
        var outer = sqrt(inner)
        return outer
    }
}