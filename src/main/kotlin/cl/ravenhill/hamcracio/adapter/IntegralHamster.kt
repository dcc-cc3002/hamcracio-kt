package cl.ravenhill.hamcracio.adapter

import org.jetbrains.annotations.Contract

// IntegralHamster.kt
class IntegralHamster {
  @Contract(pure = true)
  fun hamham(
    name: String?,
    fn: (Double) -> Double,
    from: Double, to: Double
  ) = (to - from) * fn((to + from) / 2)
}