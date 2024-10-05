/*

Data class

Criada para armazenar valores. Possui diversas ferramentas. Muito utilizada em caso de uso de APIs, armazena os dados vindos delas.

Quando usar?    

Utilizada para armazenar dados que nunca mudam, como nome, endereço, email, etc.




*/

// Exemplo de uso.


data class User(val nome: String, val id: Int){ // toString(), equals(), hashCode() e copy() são gerados automaticamente pelo compilador em função das propriedades com todas melhores práticas.

    override fun equals(other: Any?) =
        other is User && other.id == this.id
        
        /*override fun equals(other: Any?) = Outra forma de escrever a regra do código, porém de forma concisa e segura.
        this.id == (other as? User)?.id */

    // Estamos querendo dizer que não gostariamos de fazer a comparação de todas as propriedades da classe (argumentos nome e id, somente o id)
    // Sobrescrevemos o equals porque o que importa nesta classe, é em termos comparativos de estrutura dos objetos da classe user;
    // Queremos simplesmente identificar se os ids do usuários são iguais, já é o suficiente para dizer se eles são iguais.
}

fun main(){

    val usuario1 = User("Gugu", 1)
    println(usuario1)

    val usuario2 = User("Gugu vespinha", 2)
    val usuario3 = User("Dadá", 1)
    
    println("Usuario1 == usuario2 =  ${usuario1 == usuario2}") 
    println("Usuario1 == usuario3 =  ${usuario1 == usuario3}") 

    // O que é um hashcode? 
    // O hashcode é um número inteiro que é gerado para cada objeto, que é usado para comparar objetos e verificar se são iguais.
    // O hashcode é gerado automaticamente pelo compilador.

    

    println(usuario1.hashCode())
    println(usuario2.hashCode())
    println(usuario3.hashCode())

    // O que é um copy()? 
    // O copy() cria uma cópia de um objeto, com as mesmas propriedades, mas com valores diferentes na referencia de memória.
    // Ele é útil para não alterar o estado original do objeto.

    println(usuario1.copy())
    println(usuario1 === usuario1.copy())
    println(usuario1.copy("Vespo"))
    println(usuario1.copy(id = 5))

    // Para acessar o componente de um objeto, acessar o paramentro do objeto criado

    println(usuario1.component1()) // nome
    println(usuario1.component2()) // id


}