/*

Iterators

São implementações de iterar/percorrer algo/estrutura de dados.
Em kotlin podemos personalizar nossos iterators em estruturas de classes.
A classe passa a ser iteravel em um loop for por exemplo.
*/

// Temos uma classe animal, com uma propriedade unica para cada nome.         
class Animal(val name: String)                        

// Temos uma classe Zoo, que possui como parametro a classe Animal, transformando-a em lista. 
// É importante ser do tipo lista para receber iteração.
class Zoo(val animals: List<Animal>) {             

// A funçao "operator fun" cria a capacidade da classe ser iterada, ela passa a suportar uma estrutura de repetição.
// Basta respeitarmos a assinatura de função onde proclamamos a função de nome iterator() que vai retornar algo do tipo Iterator de alguma coisa "Iterador<Animal>", no caso vai receber os parametros passados para a classe Animal. 
// O animals.iterador() é o iterador padrão da lista animals da classe Zoo, que recebe como parametro a função Animal.
// 
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("Cachorro"), Animal("Gato"), Animal("Elefante"))
    val zoo = Zoo(animals)
    
    for (animal in animals){
        println("Olha aquele animal: ${animal.name}")
    }

}