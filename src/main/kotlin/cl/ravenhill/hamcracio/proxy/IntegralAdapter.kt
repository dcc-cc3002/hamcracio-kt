package cl.ravenhill.hamcracio.proxy

// IntegralAdapter.kt
class IntegralAdapter {
  private val hamster = HamsterProxy()

  fun integrate(name: String, f: (Double) -> Double, from: Double, to: Double) =
    hamster.hamham(name, f, from, to)
}