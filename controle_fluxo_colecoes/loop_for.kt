/*

Loops - For

Utilizam-se para repetir um bloco de código um número pré-determinado de vezes.
A ideia primordial é percorrer cada elemento da lista (ou qualquer estrutura de dados) com os elementos passados.

*/

// Vamos criar um exemplo para criação de receita de bolo.file

fun main() {
    val bolos = listOf("cenoura", "fubá","chocolate")

    for (bolo in bolos) {       // Queremos fazer um for, detro da lista bolos, dentro do escopo do for cada elemento vai se chamar bolo.
        println("Oba! É um bolo de $bolo")
    }
}

