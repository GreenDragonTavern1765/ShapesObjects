import kotlin.math.sqrt

/*
Equilateral Triangle class, an extension of the Triangle class, takes
the name of the object for constructor, however is extending the triangle
class and not the shape class
 */
class EquilateralTriangle (_name : String) : Triangle(_name) {
    // Private variable side, meant to be the same length for all three sides
    // Initializes to 0 before user sets the dimensions of the object
    private var side = 0.0

    /* Sets the dimensions of the triangle, takes in the side as a double from the user
    and sets the variable from above without user interacting directly with the value */
    fun setDimensions(side: Double) {
        this.side = side
    }

    /* Returns the area of the equilateral triangle using heron's formula similar to the
    function from the triangle function, however overiden as this one is slightly different
    since there is only one side value instead of 3 */
    override fun getArea() : Double {
        var temp = (this.side + this.side + this.side) / 2
        var inner = temp  * (temp - this.side) * (temp - this.side) * (temp - this.side)
        var outer = sqrt(inner)
        return outer
    }

    /* Print dimensions of the object, calls the side value 3 times, since all three are same length
    and calls the getArea function to print the area of the object */
    override fun printDimensions() {
        print("    4.) Equilateral Triangle Stats: ")
        showName()
        println("        Side1 = ${this.side}")
        println("        Side2 = ${this.side}")
        println("        Side3 = ${this.side}")
        println("        Area = ${getArea()}")
    }
}