/*
Função filter

Quando tiver uma variável que é uma coleção, podemos criar uma filtragem, uma regra de filtro.



*/

fun main() {

    // Lista de números para uma filtragem.
    val numbers = listOf(1, -2, -3, 4, 5, -6, 7, 8, 9, 10)

    // Vamos fazer com dois exemplos diferentes de implementação, com variáveis x e it.
    // As chaves { } são chamadas de predicado.
    val numerosPositivos = numbers.filter {x -> x > 0} // Dentro do predicado colocamos o x como uma variável nomeada para controle, mas é não necessariamente preciso utiliza-la, podemos usar it.  
    val numerosNegativos = numbers.filter {it < 0 } // Utilizamos a mesma lógica para numeros negativos porem usando it.
    
    
    println(numerosNegativos)
    println(numerosPositivos)
    println("")

    // Transformar todos os números de uma lista.

    val numbersDoubled = numbers.map {x -> x * 2} // Multiplica todos os elementos por 2
    val numbensTripled = numbers.map {it * 3} // Multiplica todos os elementos por 3

    println("Lista antiga: $numbers")
    println(numbersDoubled)
    println(numbensTripled)
    
    // Função Any - verifica com booleano se a condição descrita é verdadeira ou falsa. Se a condições existir na lista, ela vai retornar true.

    val temNumeroPar = numbers.any {it > 0}

    println(temNumeroPar)
    println("")

    // FlatMap - junta duas listas em uma única lista. Se transforma em uma só.

    val frutas = listOf("maça","pera","banana")
    val cores = listOf("verde","amarelo","vermelho")

    val coresDasFrutas = frutas.flatMap {fruta -> cor {cor -> "$fruta + $cor"}}

    println(coresDasFrutas)
    println("")

}