import java.util.*
import javax.print.attribute.IntegerSyntax

// métodos iniciam com "fun" (de function)
fun main() {
    println("É nóis na Kotlin")
    println("Sempre quis uma linguagem assim!")

    // criação de variáveis com TIPAGEM DINÂMICA
    val cidade = "São Paulo"
    val populacao = 15000
    val capital = true

    // criação de variáveis com TIPAGEM ESTÁTICA
    val estado:String = "São Paulo"  // String -> alfanumérico
    val anoCriacao:Int = 1670 // Int -> Número inteiro
    val estadoDaCapital:Boolean = true // Boolean -> Tipo boleano ou lógico
    val idh:Double = 0.778  // Double -> Número Real

    // Na Kotlin NÃO EXISTEM tipos primitivos. TUDO É CLASSE

    // Exemplos de Interpolação

    // Para interpolar apenas um valor, basta $
    val frase1 = "Na cidade de $cidade moram $populacao habitantes"
    println(frase1)

    // Para interpolar o resultado de uma função, usamos ${} (como no JS)
    val frase2 = "Na cidade de ${cidade.toUpperCase()} moram ${populacao.plus(1000)} habitantes"
    println(frase2)

    // conversores embarcados (ou seja, "de fábrica")
    val pesoTexto = "77.54"
    println("Peso em real: ${pesoTexto.toDouble()}")
    println("Peso em inteiro: ${pesoTexto.toDouble().toInt()}")
    println("Texto qualquer em inteiro: ${"99".toInt()}")

    // por que "val" e não "var" para variáveis?
    // "val" da Kotlin equivale ao "const" do JS ou ao "final" do Java
    // "val" cria variáveis IMUTÁVEIS (ou seja, NÃO podemos mudar seu valor!)
    // ex no Java: final String pesoTexto = "77.54"
    // ex no JS: const pesoTexto = "77.54"

    // para criamos variáveis MUTÁVEIS (que podem ser reatribuídas), usamos "var"
    var contador = 0
    contador++
    contador = 10


    // Criando uma LISTA IMUTÁVEL (não pode por nem tirar): listOf()
    val bairros = listOf("Saúde", "Sé", "Tatuapé")
    // bairros.add("Capão Redondo") // dá ruim, sem sugere
    // bairros.removeAt(0) // dá ruim, sem sugere

    // Criando uma LISTA MUTÁVEL (que permite por e tirar) mutableListOf()
    val frutas = mutableListOf("abacate", "pera", "uva")
    frutas.add("morango")
    frutas.removeAt(0)

}

