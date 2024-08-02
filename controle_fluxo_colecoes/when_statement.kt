/*

When

Pode ser usado no lugar de estrura de switch/case, porém de forma mais simples. 
Quando você deseja executar um bloco de código condicionalmente, você pode usar a estrutura when.

*/

fun main() {
    
    cases("Hello")
    cases(1)
    cases(0L)
    cases("hello")
}

fun cases(obj: Any) {           // A ideia desta função e do when statement é receber os valores e imprimir o resultado das conficionais.
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("É do tipo Long")
        !is String -> println("Não é uma string")
        else -> println("Desconhecido")

    }
    
}  


