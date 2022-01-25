import java.util.Scanner

fun main(args: Array<String>) {
    var myCircle : Shape
    var mySquare : Shape
    var myTriangle : Shape
    val reader = Scanner(System.`in`)

    myCircle = Circle("myCircle")
    mySquare = Square("mySquare")
    myTriangle = Triangle("myTriangle")

    // Display initial User Prompt
    println("---------- Welcome to Shape Objects ----------")
    setTriangleStat(myTriangle)
    setCircleStat(myCircle)
    setSquareStat(mySquare)
    printObjectStat(myTriangle, myCircle, mySquare)
}

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

fun setCircleStat(myCircle : Circle) {
    println("    2.) Circle Object")
    print("        Enter Radius: ")
    var radius:Double = readLine()!!.toDouble()
    myCircle.setDimensions(radius)
}

fun setSquareStat(mySquare : Square) {
    println("    3.) Square Object")
    print("        Enter Length: ")
    var length:Double = readLine()!!.toDouble()
    print("        Enter Height: ")
    var height:Double = readLine()!!.toDouble()
    mySquare.setDimensions(length, height)

}

fun printObjectStat(myTriangle : Triangle, myCircle : Circle, mySquare : Square) {
    println("---------- Object Statistics -----------")
    myTriangle.printDimensions()
    myCircle.printDimensions()
    mySquare.printDimensions()
}