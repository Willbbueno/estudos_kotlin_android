

import kotlin.math.truncate
/*
Variáveis

var - variável mutável, utilizar só nos casos que for reutilizada.

val - variável imutável, é preferivel dar preferencia para o val.

*/

fun main () {

    var a: String = "Olá galera!" // O A está declarada explicitamente o seu tipo, string.
    println(a)
    var b: Int = 33               // Tipagem explicita também.
    val c = 42                     // Já aqui temos uma inferência de tipo do kotlin, como o valor da variável C é 
                                  //um número, o kotlin associa como sendo Int. A vantagem é diminuir a verbosidade do código.
    a = "E ai pessoal"
    
    println("o valor de a é: $a") // Como a variável a é var, podemos modificar seu valor, diferente de b e c.
    println("O valor de b é: $b")
    println("O valor de C é: $c")

    // Exemplo de um cenário onde podemos utilizar uma variável sem atribuição de valor.file
   
    fun condicaoQualquer() = true // Função pra simular uma condição qualquer.file

    val d: Int                  // Podemos criar uma variável imutável sem atribuição de valor, o valor será preenchido através de outra condição.
    if (condicaoQualquer()) {
        d = 10
    } else {
        d = 20
    }

    println("O valor de d é: $d") 

}