/*

Classe selada

É uma classe que não permite ser extensivel fora do pacote que foi definida.
Vai de encontro ao conceito de encapsulamento e ao polimorfismo.


*/


sealed class Mamifero (val nome: String)

// Como estamos no mesmo pacote (arquivo) podemos extender a classe Mamifero

class Gato(nomeGato: String) : Mamifero(nomeGato)

class Humano(nomeHumano: String, val trabalho: String) : Mamifero(nomeHumano)               

// As classes Gato e Humano extendem a classe mamifero, cada classe possiu o seu parametro personalizado.
// Centralizar a lógica de cada aniaml em uma unica função facilita a manutenção e alterações futuras.
// Cada classe se preocupa em apenas descrever caraterísticas do animais, a lógica que será atribuida é responsabilidade das funções específicas.

fun saudacaoDoMamifero(mamifero: Mamifero) : String {                                       
    return when (mamifero) {
        is Humano -> "Hello ${mamifero.nome} você trabalha como ${mamifero.trabalho}";
        is Gato -> "Meu nome é ${mamifero.nome}";
    }


}


fun main() {

    val eu : Mamifero = Humano("William", "Professor")
    val gatuno = Gato("Gatuno")
    println(saudacaoDoMamifero(gatuno))
    println(saudacaoDoMamifero(eu))
    println(criaTabuada(7))

}




