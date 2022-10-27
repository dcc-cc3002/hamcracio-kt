package cl.ravenhill.hamcracio.adapter


class IntegralAdapter {
  private val hamster = IntegralHamster()
  fun integrate(
    name: String,
    f: (Double) -> Double,
    from: Double,
    to: Double
  ) = hamster.hamham(name, f, from, to)
}