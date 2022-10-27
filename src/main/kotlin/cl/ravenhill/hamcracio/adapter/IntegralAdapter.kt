package cl.ravenhill.hamcracio.adapter


/**
 * Adapter for the hamster service.
 */
class IntegralAdapter {
    /**
     * The hamster service.
     */
    private val hamster = IntegralHamster()

    /**
     * Integrates the function f from a to b using the trapezoidal rule.
     *
     * @param name  The name of the function; for example `f`
     * @param f     The implementation of the function to integrate
     * @param from  The lower bound of the integral
     * @param to    The upper bound of the integral
     *
     * @return  The value of the integral
     */
    fun integrate(name: String, f: (Double) -> Double, from: Double, to: Double) =
        hamster.hamham(f, from, to)
}