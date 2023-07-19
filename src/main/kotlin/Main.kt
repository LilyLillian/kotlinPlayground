
import kotlin.math.sqrt
import kotlin.math.pow
fun main(args: Array<String>) {
    val birthYear = 2001
    val currentYear = 2023

    val age = currentYear - birthYear
    println("The difference between your birth year and the current year is: $age years")


    val a = 4.0
    val b= 3.0

    val hypotenuse= sqrt(a.pow(2) + b.pow(2))
    println("The hypotenuse of the triangle is: $hypotenuse")
}

