import kotlin.math.sqrt

// Triangle class is an open class, is able to be extended by another class (equilateral)
open class Triangle(_name: String) : Shape(_name) {
    /* These are the sides of the triangle, made private to not be changed from the main function
    isEquilat was added to determine if the triangle is equiateral or not */
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0
    private var isEquilat = 0

    /* Sets the dimensions of the triangle object, and also changes the value of isEquilat if
    all sides are the same length. Called by main function using the sides input by user, which
    then change the values of the variables from above without directly in */
    open fun setDimensions(side1 : Double, side2 : Double, side3 : Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
        if (side1 == side2) {
            if (side2 == side3)
                isEquilat = 1
        }
    }

    /* Prints the dimensions of the object as well as the area based on the dimensions
    This function overrides the function from the superclass Shape, no parameters */
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

    /* This function calculates and then returns the area of the triangle using Heron's formula
    The 3 sides of the triangle are all stored as doubles, and then are used to calculate
    the area using 1/2 of the perimeter "s", and finally returned as outer */
    override fun getArea() : Double {
        var temp = this.side1 + this.side2 + this.side3
        var s = temp / 2
        var inner = s  * (s - this.side1) * (s - this.side2) * (s - this.side3)
        var outer = sqrt(inner)
        return outer
    }
}