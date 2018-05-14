/**
 * Created by Adrian on 14/05/2018.
 * This project is intended to test Kotlin.
 */
val h: Double = 0.00000001;

fun main(args : Array<String>) {
    print(deriv(Math.PI));
}

/**
 * of function sinx
 * [f(x+h) - f(x)] / h
 */
fun deriv(x: Double): Double{
    return (Math.sin(x.toDouble() + h) - Math.sin(x.toDouble())) / h;
}