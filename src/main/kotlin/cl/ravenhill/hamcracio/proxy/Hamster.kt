package cl.ravenhill.hamcracio.proxy


/**
 * The interface that will be proxied.
 */
interface Hamster {
    /**
     * Calculates the integral of a function.
     * @param name  The name of the function; for example `f`
     * @param fn    The implementation of the function to integrate
     * @param from  The lower bound of the integral
     * @param to    The upper bound of the integral
     *
     * @return  The value of the integral
     */
    fun hamham(name: String, fn: (Double) -> Double, from: Double, to: Double): Double
}