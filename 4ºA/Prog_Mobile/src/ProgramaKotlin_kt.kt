fun main() {
    println("Hello World1!")

    //Delcarando variaveis DINAMICA

    val cidade = "sp"
    val qtdPessoas = 90090
    val capital = true


    //Delcarando variaveis ESTATICA

    val estado:String = "SP"
    val anoFundado:Int = 1965
    val cidadeCpital:Boolean = true


    //Interpolando numa variável

    //interpolação apenas pra pegar o valor, usa-se sem chaves
    val frase1 = "Na cidade $cidade existem um total de $qtdPessoas pessoas"
    println(frase1)

    //para usar métodos precisa-se dos {}
    val frase2 = "Na cidade ${cidade.toUpperCase()} existem um total de ${qtdPessoas.plus(1000)} pessoas"
    println(frase2)

    //Para variáveis MUTÁVEIS
    var contador = 0
    contador++
    contador = 10


    //Lista IMUTAVEL
    val bairros = listOf("Saude","Se", "Mooca")
    println(bairros)

    //Lista MUTAVEL
    val frutas = mutableListOf("maça", "morango", "manga")
    frutas.add("mexerica")
    println(frutas)
}