package cl.ravenhill.hamcracio.adapter


fun main() {
    val client = IntegralClient()
    val integral = client.integrate("x^2", { x -> x * x }, 0.0, 1.0)
    println(integral)
}