fun main() {
    // Uma premissas da Kotlin é evitar NullPointerException a todo custo

    // situação 1: NÃO É POSSÍVEL criar variáveis de tipagem estática com valor null
    //              A linha abaixo nem iria compilar
    // val bairro:String = null

    // situação 2: é possível criar vairável dinâmica atribuindo null
    // Nesse caso, o tipo dela é "Nothing" ("Nada")
    val cidade = null
    // porém, não é possível invocar nenhum método dela
    println(cidade)
    println("Cidade: "+cidade)
    println("Cidade: $cidade")

    // situação 3: para que a Kotlin permita valores "null" numa variável,
    //             usamos "?" após o tipo
    val bairro:String? = null
    val idade:Int? = null
    val altura:Double? = null

    // situação 4: para evitar NullPointerException na invocação de métodos de
    // objetos que PODEM ser nulos, pode-ser usar o "safe navigator"
    // que é "?" após o objeto e antes do "."
    // assim, se ele for "null", a invocação do método ser ignorada
    // e o quem o tentou invocar recebe "null"
    println("Bairro em caixa alta: "+bairro?.toUpperCase())

    // situação 5: caso você NÃO queira tratar erros de métodos invocados de objetos "null"
    // basta usar o operador "!!" após o objeto e antes do "."
    // assim, se ele null, será lançada a exceção de NullPointer
    println("Bairro em caixa alta: "+bairro!!.toUpperCase())

}