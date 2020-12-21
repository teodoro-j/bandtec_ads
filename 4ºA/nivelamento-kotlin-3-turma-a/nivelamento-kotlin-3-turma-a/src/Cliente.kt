/*
uma "data class" inicia com "data" antes de "class"
O par de chaves na classe é opcional. Necessário apenas CASO queira cria métodos dentro

Os atributos podem ser "val" ou "var"

Métodos "toString()", "equals()" e "hashCode()" são criados automaticamente.

No caso dod "equals()" e "hashCode()", são criados de tal forma que
se todos os atributos forem iguais entre 2 objetos, eles são consideramos "o mesmo"
Ou seja, um teste "==" entre eles daria true
 */
data class Cliente(val nome:String, val cpf:String, val credito:Double)

/* data class pode ser "quebrada" em linhas para melhor organização visual

data class Cliente(
    val nome:String,
    val cpf:String,
    val credito:Double
)

 */