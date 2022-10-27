package cl.ravenhill.hamcracio.proxy

import java.util.function.DoubleUnaryOperator

// HamsterProxy.kt
class HamsterProxy : Hamster {
  private val hamster: Hamster = IntegralHamster()
  private val cache = mutableMapOf<Integral, Double>()

  override fun hamham(name: String, fn: (Double) -> Double, from: Double, to: Double ): Double {
    val integral = Integral(name, from, to)
    if (cache.containsKey(integral)) {
      return cache[integral]!!
    }
    val result = hamster.hamham(name, fn, from, to)
    cache[integral] = result
    return result
  }

  private inner class Integral(val name: String, val from: Double, val to: Double)
}