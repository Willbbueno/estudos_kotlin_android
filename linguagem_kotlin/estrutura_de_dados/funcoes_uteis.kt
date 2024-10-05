// A função filter como o nome já diz, filtra uma lista de acordo com os comandos passodos.

var listaNumeros = listOf(1, -2, 3, 4, 5, 6, -7, 8, 9, -10, 11, 12, 13, 14)

fun filtro(){

    val numerosPositivos = listaNumeros.filter {x -> x > 0}        
    val numerosNegativos = listaNumeros.filter {it < 0 }
}


println(listaNumeros)