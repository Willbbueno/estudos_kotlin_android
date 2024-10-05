/*

Existem duas formas de verifica igualdade de dois objetos.
A primera é uma comparação estrutural que é feito com a sintaxe ==. 
A outra é uma comparação referencial que é feita com ===, ou seja, se eles tem a mesma referencia de memória. 

*/


fun main() {
    
    val autores = setOf("Shakespeare", "Hemingway", "Twain")
    val escritores = setOf("Twain", "Shakespeare", "Hemingway")

    println(autores == escritores)
    println(autores === escritores)
}