fun main() {

    // Criando uma instância de Pais
    val paisA = Pais("Canadá", 15000, 0.899)

    // os atributos definidos no "construtor" da classe
    // se tornam, de fato, atributos de instância
    println(paisA.nome)
    println(paisA.populacao)
    println(paisA.idh)

    // só podemos alterar atributos definidos como "var" na classe
    paisA.nome = "Japão"
    // paisA.populacao = 9009809 // erro de compilação, pois populacao é "val"


    val alunoA = Aluno()
    alunoA.nome = "Zé Ruela"
    alunoA.idade = 80

    // usando o construtor da assinatura da classe
    val frutaA = Fruta("uva", 9.5)

    // usando o construtor vazio (definido dentro da classe)
    val frutaB = Fruta()
    frutaB.nome = "manga"
    frutaB.preco = 4.75

    val continente = Continente()
    continente.nome = "Ásia"
    println(continente.nome)

    // atributos só com "get()" não podem ser alterados, obviamente
    println(continente.isJaTeveGuerra)

    println("frutaA: $frutaA")

    val frutaC = Fruta("uva", 9.5)
    println("frutaA é igual a frutaC? ${frutaA.equals(frutaC)}")
    println("frutaA é igual a frutaC? ${frutaA == frutaC}") // == funciona como .equals()


    val cliente1 = Cliente("Zé", "123", 1000.0)
    val cliente2 = Cliente("Zé", "123", 1000.0)

    println("cliente1: $cliente1")

    println("cliente1 é igual ao cliente2? ${cliente1 == cliente2}")
}