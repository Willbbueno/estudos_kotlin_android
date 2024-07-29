/*
Loops While e Do While

O while é uma estrutura que repete um bloco de códigos até que uma condição seja realizada. 

A diferença do for para while é que o for repete uma quantidade de vezes pré determinada.

*/



fun boloVendido() = println("Um pedaço foi vendido.")
fun assarBolo() = println("Colocar mais um bolo pra assar!")
fun assandoBolo() = println("O bolo está assando")

// Vamos fazer um cenário onde vendemos bolos até que não haja mais fatias em estoque. Quando faltar fatias, a função o enchera novamente.

fun main() {

    var bolosVendidos = 0 
    var fatiasEmEstoque = 0 

    while (bolosVendidos < 5) {
        boloVendido()
        bolosVendidos++

    }

    println("Todos os bolos foram vendidos.")
    assarBolo()

   do {
    fatiasEmEstoque++
    assandoBolo()
    println("Fatias em estoque: $fatiasEmEstoque")
   
   } while (fatiasEmEstoque < 5)

   println("O estoque está cheio.")
}
