abstract class Shape(_name: String) {
    var name = _name
    fun showName() {
        println(name)
    }

    open fun getArea() : Double {
        return 0.0
    }

    open fun printDimensions() {
        println("No dimensions")
    }
}