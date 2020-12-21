fun main() {
    cumprimentar()

    // Isso é possivel porque Kotlin é uma linguagem hibrida (POO e Funcional)
    val ulha = {cumprimentar()} // colocar a chaves, torna em função anonima

    println(calcularDescontoVT(2000.0))
    println(mostarFrase("Zé Ruela", 26))
}

// função sem retorno
fun cumprimentar() {
    println("Olá, boa noite!")
}

// Comargumento e retorno tipo Double
fun calcularDescontoVT(salario:Double):Double{
    return salario * 0.06
}

fun mostarFrase(nome:String, idade:Int):String {
    return "Sr. $nome e tem $idade anos"
}
