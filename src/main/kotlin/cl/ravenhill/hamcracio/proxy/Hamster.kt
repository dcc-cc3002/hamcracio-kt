package cl.ravenhill.hamcracio.proxy


interface Hamster {
  fun hamham(
    name: String,
    fn: (Double) -> Double,
    from: Double,
    to: Double
  ): Double
}