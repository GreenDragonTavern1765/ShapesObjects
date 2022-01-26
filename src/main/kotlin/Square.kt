import kotlin.math.sqrt

/* Square object is extension of the Shape abstract class, taking the name of the
object as a string, and will follow same protocol as the other objects */
class Square(_name: String) : Shape(_name) {
    // Private variables used so that user cannot change the values directly
    // isSquare is added to tell if the object is a perfect square or not
    // All values are initially 0, will be changed later after user sets dimensions
    private var length = 0.0
    private var height = 0.0
    private var isSquare = 1

    /* Set the dimensions of the object, the length and height of the object, which are
    set by user entering two doubles, which change the values of the variables from above
    and setting isSquare to 1 if the height and length are the same value */
    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
        if (this.length == this.height)
            this.isSquare = 1
        else
            this.isSquare = 0
    }

    /* Overrides the printDimensions function from the Shape superclass, prints the values
    for each of the dimensions, as well as the area of the object, and finaly whether the
    object is a perfect square or not */
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

    /* Calculates the area of the object, returning it as a double value, using the variables
    that were initially 0, and were changed when the user set the dimensions */
    override fun getArea() : Double {
        return this.length * this.height
    }
}