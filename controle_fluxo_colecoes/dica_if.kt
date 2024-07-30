/* 

Dica para deixar o if else menos verboso. 
Utiliza-lo de forma reduzida, como expressão

*/

fun main() {

    fun maxAntigo(a: Int, b: Int): Int {
        if (a > b) {
            return a 
        } else return b
    }


    fun maxMenosVerboso(a: Int, b: Int) = if (a > b) a else b

    println(maxAntigo(5, 10))
    println(maxMenosVerboso(5, 10))
}