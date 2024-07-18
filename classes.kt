class Cliente 

class Contatos(val id: Int, var email: String)

fun main() {
    val cliente = Cliente()

    val contato = Contatos(1, "test@gmail.com")
    
    println(contato.id)
    contato.email = "test2@gmail.com"
    print(contato.email)
}

