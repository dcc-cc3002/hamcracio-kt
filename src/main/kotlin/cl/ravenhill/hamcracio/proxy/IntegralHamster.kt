package cl.ravenhill.hamcracio.proxy

import org.jetbrains.annotations.Contract

// IntegralHamster.kt
class IntegralHamster : Hamster {
  @Contract(pure = true)
  override fun hamham(
    name: String?,
    fn: (Double) -> Double,
    from: Double, to: Double
  ) = (to - from) * fn((to + from) / 2)
}