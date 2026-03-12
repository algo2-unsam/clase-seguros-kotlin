package ar.edu.unsam.algo2.seguros

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

// En los tests prescindimos de utilizar las mismas constantes que en cliente
// para que si esos valores cambian los test se rompan (está hecho por diseño).
//
// https://kotest.io/
class CobroSiniestroSpec : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest

    describe("Test de cobro de siniesto", {
        describe("Cliente comunes", {
            it("si no es moroso puede cobrar siniestro") {
                // AAA
                // Arrange
                val clienteNoMoroso = Cliente()
                // Act
                // Assert
                clienteNoMoroso.puedeCobrarSiniestro() shouldBe true
            }
            it("si es moroso no puede cobrar siniestro") {
                // AAA
                // Arrange
                val clienteMoroso = Cliente(1)
                // Act
                // Assert
                clienteMoroso.puedeCobrarSiniestro() shouldBe false
            }
        })
        describe("Flota chica", {
            it("Si debe poca plata puede cobrar el siniestro", {
                val flotaChica = Flota(5, 5000)
                flotaChica.puedeCobrarSiniestro() shouldBe true
            })
        })


    })
})
