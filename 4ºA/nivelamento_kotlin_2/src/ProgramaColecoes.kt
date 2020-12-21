fun main() {
    val paises = listOf("Alemanha", "Noruega", "Dinamarca", "Hungria", "Escócia", "Suécia")

    paises.forEach{ println(it)}  // nome automatico do valor da interação é 'it'

    paises.forEach { pais -> println(pais) }

    paises.forEach { pais ->
        println("O pais é $pais")
        if (pais.length>7) {
            println("Nossa, que nome grande!")
        }
    }

    val nomesGrandes = paises.count { it.length > 7 }
    println(nomesGrandes)

    val paisesComR = paises.filter {  it.contains( "r" ) }
    println(paisesComR)

    val primeiroComI = paises.first { it.contains("i") }
    println(primeiroComI)

}