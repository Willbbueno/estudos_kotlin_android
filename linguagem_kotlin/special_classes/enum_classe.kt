/*

Enum class representa um numero finito de possibilidades, define um estado como loading, sucesso, erro e etc
Representa constantes, valores estáticos e são distintos.

Exemplo:

direções: running, finished
em um jogo: facil, médio e dificil. 

Funcionamento:

É usado quando precisamos definir um número finito de valores possíveis para uma variável, como o estado de um objeto, ou para representar um conjunto de constantes relacionadas.
Passamos as instruções dentro do corpo da classe em letras maiusculas, após referenciamos através do when as caracteristas que serão atrubuidas aos estados definidos. 
Ou ao inves de utilizarmos condicional when podemos atribuir o valor diretamente no corpo da classe como por exemplo: PARADO("Você esta parado.").
 

A diferença entre enum e enum class é que enum class é uma classe, que pode conter valores e métodos, enquanto enum é um tipo de dados.
*/

enum class Direcao {
    PARADO, 
    ANDANDO, 
    FINALIZADO
}


fun main (){
    
    val direcao = Direcao.PARADO
    val mensagem = when (direcao){
        Direcao.PARADO -> "Você está parado"
        Direcao.ANDANDO -> "Você está andando"
        Direcao.FINALIZADO -> "Você está finalizado"
    }

    println(mensagem)

}