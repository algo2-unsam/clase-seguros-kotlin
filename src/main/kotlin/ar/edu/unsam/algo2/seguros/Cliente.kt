package ar.edu.unsam.algo2.seguros

open class Cliente(var deuda: Int = 0) {
  open fun puedeCobrarSiniestro() = !esMoroso()
  fun esMoroso(): Boolean = deuda > 0
}
class Flota(var cantidadAutos: Int, deuda: Int = 0) : Cliente(deuda) {
  override fun puedeCobrarSiniestro() = deuda <= maximaDeudaPermitido()
  fun maximaDeudaPermitido() = if (cantidadAutos > 5) 10000 else 4000
}
