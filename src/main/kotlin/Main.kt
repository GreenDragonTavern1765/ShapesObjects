import java.util.Scanner

/* Main function: create the 4 objects, circle, square, and triangle are based on Shape abstract class
and equilateral triangle based on triangle class, they each are instantiated, and then each function
is called one by one, and the user is prompted to enter in information about each object.
Finally, all information regarding each object created is displayed to the screen
All values that are input by the user are taken in and stored as DOUBLES not INTEGERS */
fun main(args: Array<String>) {
    var myCircle : Shape
    var mySquare : Shape
    var myTriangle : Shape
    var myEquilat : Triangle
    val reader = Scanner(System.`in`)

    myCircle = Circle("myCircle")
    mySquare = Square("mySquare")
    myTriangle = Triangle("myTriangle")
    myEquilat = EquilateralTriangle("myEquilat")

    // Display initial User Prompt
    println("---------- Welcome to Shape Objects ----------")
    setTriangleStat(myTriangle)
    setCircleStat(myCircle)
    setSquareStat(mySquare)
    setEquilatStat(myEquilat)
    printObjectStat(myTriangle, myCircle, mySquare, myEquilat)
}

/* Sets the triangle stats, first enter the 3 sides of the triangle, and then the dimensions are set,
this is for the triangle, which was instantiated above
Takes the triangle object from above as a parameter*/
fun setTriangleStat(myTriangle : Triangle) {
    println("    1.) Triangle Object")
    print("        Enter side1: ")
    var side1:Double = readLine()!!.toDouble()
    print("        Enter side2: ")
    var side2:Double = readLine()!!.toDouble()
    print("        Enter side3: ")
    var side3:Double = readLine()!!.toDouble()
    myTriangle.setDimensions(side1, side2, side3)
}

/* Similar to the triangle function above, this will prompt the user to enter the radius of the circle,
and then the dimensions of the circle will be saved to the instantiated object from the main function
Takes the circle object from main function as a parameter*/
fun setCircleStat(myCircle : Circle) {
    println("    2.) Circle Object")
    print("        Enter Radius: ")
    var radius:Double = readLine()!!.toDouble()
    myCircle.setDimensions(radius)
}

/* Finally, the square function will prompt the user to enter the length and height of the square object,
and the information will be saved to the object instantiated from the main function
Takes the square object from main function as a parameter*/
fun setSquareStat(mySquare : Square) {
    println("    3.) Square Object")
    print("        Enter Length: ")
    var length:Double = readLine()!!.toDouble()
    print("        Enter Height: ")
    var height:Double = readLine()!!.toDouble()
    mySquare.setDimensions(length, height)
}

/* The equilateral function is an extension of the triangle class, and will use only one side, since all sides are
the same length, and similar to the other functions, will save the data to the object created
Takes the equilateral triangle object as a parameter*/
fun setEquilatStat(myEquilat : EquilateralTriangle) {
    println("    4.) Equilateral Object")
    print("        Enter side: ")
    var length:Double = readLine()!!.toDouble()
    myEquilat.setDimensions(length)
}

/* This function prints the information on each object instantiated in main function, printing the area as well as
the dimensions of the shape, takes the triangle object, circle object, square object, and equilat object as parameters */
fun printObjectStat(myTriangle : Triangle, myCircle : Circle, mySquare : Square, myEquilat: EquilateralTriangle) {
    println("---------- Object Statistics -----------")
    myTriangle.printDimensions()
    myCircle.printDimensions()
    mySquare.printDimensions()
    myEquilat.printDimensions()
}