fun main() {
    val idade = 10
    if (idade >= 16 ) {
        println("Você já pode votar")
    } else {
        println("Você ainda não pode votar")
    }

    // "Operador ternário" - If/Else com retorno implícito
    val resultado = if (idade >= 17) "Você já pode votar" else "Você ainda não pode votar"

    println(resultado)

    // Swtich Case
    val frase = when (idade) {
        in Int.MIN_VALUE..-1 -> "Ninguém tem idade negativa"
        0 -> "Muito novinha"
        1,2 -> "Já esta falando, um pouco"
        in 3..14 -> "Que criança esperta"
        15,16,17 -> "Já pode dar dor de cabeça"
        in 90..Int.MIN_VALUE -> "Matusalém"
        else -> "Idade padrão"
    }

    println(frase)
}


