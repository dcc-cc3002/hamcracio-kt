package cl.ravenhill.hamcracio.adapter

import org.jetbrains.annotations.Contract

/**
 * A hamster that can integrate functions.
 */
class IntegralHamster {
    /**
     * Integrates the function `f` from `a` to `b` using the trapezoidal rule.
     *
     * This function is pure, meaning that it does not have any side effects.
     */
    @Contract(pure = true)
    fun hamham(fn: (Double) -> Double, from: Double, to: Double) = (to - from) * fn((to + from) / 2)
}