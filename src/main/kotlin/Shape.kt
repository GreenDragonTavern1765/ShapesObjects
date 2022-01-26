/* This is the abstract class Shape, all the other objects that are created
(Circle, Square, Triangle, Equilateral) are all extensions of this class */
abstract class Shape(_name: String) {
    // The name of the object
    var name = _name

    // Function prints the name of the object
    fun showName() {
        println(name)
    }

    // Function returns the area of the object as a double
    open fun getArea() : Double {
        return 0.0
    }

    // Function prints the dimensions of the object
    open fun printDimensions() {
        println("No dimensions")
    }
}