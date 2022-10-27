package cl.ravenhill.hamcracio.adapter


class IntegralClient {
  private val adapter = IntegralAdapter()
  fun integrate(
    name: String,
    fn: (Double) -> Double,
    from: Double, to: Double
  ): String {
    val result =
      adapter.integrate(name, fn, from, to)
    return "\\int_{$from}^{$to} $name dx = $result"
  }
}