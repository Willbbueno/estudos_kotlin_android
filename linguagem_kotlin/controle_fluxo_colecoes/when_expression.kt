fun main (){

    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(3.4))
    println(whenAssign(Myclass()))
    println(whenAssign(true))


}

fun whenAssign(obj: Any): Any {   // Atribuir quando os resultados forem compativeis. A diferença do when expression para o statement é que o express pode ser passado como atribuição de uma variável e não no corpo da função.

    val result = when (obj) {     // Todos os valores passado pela chamada da função whenAssign serão verificados pela função when. 
        is String -> obj.length   // A diferença entre os dois when é que o expression recebe os valores e faz uma atribuição a partir das condicionais. Já o statement verifica as condicionais e printa o resultado.
        is Int -> obj + 10        // Funcionamento: Recebemos os valores a partir da chamada do whenAssign, recebemos o valor pelo parâmetro "obj" que verifica seu tipo, como temos uma tipagem any, pode ser qualquer valor.
        is Double -> obj * 2      // A partir desta verificação, o when testa o parametro passado para cada linha de código condicional fornecida, se a checagem for positiva, ele para a condicional imediatamente e imprime este valor, caso contrario continuará a condicional até o término do código.
        is Myclass -> "Esta é uma instância de Myclass"
        else -> "Objeto desconhecido"

        }
        return result
    
}
class Myclass