class Cliente                                   
//Podemos declarar uma classe vazia, temos apenas uma "casca".

class Contatos(val id: Int, var email: String)  

// Temos um construtor personalizavel, a classe está especificando como criar o seu objeto nos parametros. O kotlin já cria os métodos acessores e de atrubuição se colocarmos os parametros na chave.

fun main() {
    val cliente = Cliente() // Podemos criar uma instancia de classe sem precisar utilizar o recurso "New". Só pelo fato de chamar a classe abrindo e fechando () vamos estar chamando o construtor padrão dela e atribuindo à variavel cliente.      
    
    val contato1 = Contatos(1, "test@gmail.com") // Como a classe Contatos está especificando quais objetos podem ser criados, podemos chama-la e inserir os dados desejados e atribuir seu valor à variavel contato
    
    println(contato1.id)                  // Depois do objeto contato1 ser criado/instanciado, podemos acessar seu os dados dos seus parametros.
    contato1.email = "test2@gmail.com"    // Podemos reatribuir também os valores dos parametros caso sejam declarados como Var.
    println(contato1.email)               // O novo valor do parametro será impresso.
}

