/*

Ranges

É uma estrutura de repetição que podemos utilizar dentro de outras estruturas.
Ele faz a contagem numérica de acordo com a estrutura passada como until, .. , downTo e step.

*/

fun main () {

    for(i in 0..3) { // A sigla .. é utilizada quando queremos fazer uma contagem incluindo os limites menores e maiores, no exemplo a contagem irá de 0 a 3.
        print(i)
    }
    print("  ")      // Vamos printar espaços para separar os resultados do loop.

    for(i in 0 until 3) { // Until é utilizado quando queremos excluir o ultimo limite da contagem, no caso a contagem irá de 0 até 2.
        print(i)
    }
    print("  ")

    for(i in 2..8 step 2 ) { // Step é o recurso utlizado para contagem espaçada, no exemplo vamos contar de 2 em 2. 
        print(i)
    }
    print("  ")

    for(i in 3 downTo 0) { // O downTo faz a contagem de forma regressiva, por isso passamos o limite maior primeiro e depois o limite menor.
        print(i)
    }
}