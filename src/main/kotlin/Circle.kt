import kotlin.math.PI
import kotlin.math.pow

class Circle(_name: String) : Shape(_name) {
    private var radius = 0.0

    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        print("    2.) Circle Stats: ")
        showName()
        println("        Radius = ${this.radius}")
        println("        Area = ${getArea()}")
    }

    override fun getArea(): Double {
        var area = this.radius.pow(2)
        return area * PI
    }
}