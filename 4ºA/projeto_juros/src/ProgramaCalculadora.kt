import java.util.*
import javax.print.attribute.IntegerSyntax
    /*
    J = C. i. t
    J = 4500. 0,04. 10
    */

fun main() {
    val nome = "João"

    /*
    val capital = 4500
    val taxa = 4
    val tempo = 10

     */


    //Preciso agregar a lógica do calculo a uma variavel

    println(CalcularJuros(4500.00, 4.00, 10 ))
    val result = {CalcularJuros(4500.00, 4.00, 10)}

    println("Sr.$nome tem um juros acumulado de $result")

    val resultado = 4000.00

    if (resultado > 5000.00){
    println("Juros acumulado alto")
    } else if (resultado < 2000.00) {
        println("Juros acumulado baixo")
    } else {
        println("Juros acumulado médio")
    }

}

fun CalcularJuros(capital:Double, taxa:Double, tempo:Int):Double{
    return capital * (taxa/100) * tempo
}

