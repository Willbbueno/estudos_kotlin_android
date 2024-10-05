/* 
Introdução

Funções são blocos de códigos utilizados para realizar uma tarefa específica.
Funções podem receber argumentos e retornar valores.

*/

// Para imprimir uma mensagem com prefixo, usamos como argumento "prefix:" e 
// indicamos o seu tipo, no caso string, atribuindo um valor desejado, no caso "info".
// Caso não seja passado nenhum valor para o prefix, ele irá atribuir o valor Info como padrão.

val mensagem1 = "Olá mundo"
val mensagemPadrao = "Olá, como vai? Não estamos diponíveis no momento, nosso horário de atendimento é de seg a sexta"
val numeroX : Int = 10
val numeroY : Int = 20
val prefixo : String = mensagem1

fun printMessageWithPrefix(message: String, prefix: String = "Mensagem automática") {  
    println ("[$prefix] $message")
}

// Funções soma e multiplicação

fun soma(x: Int, y: Int): Int {
    return (x + y)
}

fun multiplicacao(x: Int, y: Int) = x * y // Quando a expressão tem apenas uma linha, podemos omitir os colchetes.Porém, na chamada da função
// precisará incluir no print para mostrar o resultado.

fun main() {           // A função main é um ponto de entrada das aplicações.
    println(mensagem1)
    printMessageWithPrefix(mensagemPadrao)
    println("Soma: ${soma(numeroX, numeroY)}")
    soma(numeroX, numeroY)
    multiplicacao(numeroX, numeroY)
    multiplicacao(numeroX, numeroY)
}
