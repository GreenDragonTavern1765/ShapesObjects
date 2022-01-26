import kotlin.math.PI
import kotlin.math.pow

/* This is the circle class, which is a subclass of the Shape abstract class, takes in
the name of the object for the constructor during instantiation, and similar to the other
objects, all values stored for the dimensions are saved as DOUBLES, not INTEGERS */
class Circle(_name: String) : Shape(_name) {
    // Private variable radius is stored initially as 0.0, changed later, when set
    private var radius = 0.0

    /* Function sets the dimensions of the object, in this case the radius
    The radius is not accessible by the user and is set as private */
    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    /* Overrides the printdimensions function from the superclass Shape, prints the radius
    of the circle as well as the area that is calculated in another function below */
    override fun printDimensions() {
        print("    2.) Circle Stats: ")
        showName()
        println("        Radius = ${this.radius}")
        println("        Area = ${getArea()}")
    }

    /* Overrides the getArea function from the superclass, and returns a double, calculates
    the area of the circle using the pow (power function) from Kotlin as well as PI */
    override fun getArea(): Double {
        var area = this.radius.pow(2)
        return area * PI
    }
}