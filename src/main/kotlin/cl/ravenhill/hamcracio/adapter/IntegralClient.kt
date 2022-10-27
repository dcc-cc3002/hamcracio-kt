package cl.ravenhill.hamcracio.adapter

/**
 * The client that renders the integral to LaTeX.
 */
class IntegralClient {
    /**
     * The adapter that integrates the function.
     */
    private val adapter = IntegralAdapter()

    /**
     * Renders the integral to LaTeX.
     *
     * @param name  The name of the function; for example `f`
     * @param fn    The implementation of the function to integrate
     * @param from  The lower bound of the integral
     * @param to    The upper bound of the integral
     *
     * @return  The LaTeX code for the integral
     */
    fun integrate(name: String, fn: (Double) -> Double, from: Double, to: Double): String {
        // We first calculate the value of the integral using the adapter
        val result = adapter.integrate(name, fn, from, to)
        // Then we render the integral to LaTeX
        return "\\int_{$from}^{$to} $name dx = $result"
    }
}