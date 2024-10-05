/*

Conjuntos - Set

Não são ordenados e não permitem duplicados.
O set cria uma lista única e não mutável, ou seja, não pode adiocionar e nem remover seus itens.

Para criar uma lista imutável usamos - setOf() e uma lista mutável usamos mutableSetOf() 

Quando usamos set?

Para garantir que uma coleção seja inviolável e única, ou seja, podemos utilizar para armazenar itens únicos como identificadores,
lista de permissões (IPs, ID de usuários, evita duplicação de valores)

*/

// Neste exemplo vamos criar uma função para receber o cpf dos clientes, como o cpf é único servirá para evitar duplicatas.
// Se tentarmos inserir um registro já existente uma mensagem avisará do erro.
// Tambem iremos criar uma função para mostrar a lista de clientes cadastrados, somente para exemplicar o uso do recurso somente leitura da setlist.



 

class CadastroDeClientes {

    val cpfCliente: MutableSet<String> = mutableSetOf() // Cria uma setlist mutável para armazenar o cpd dos clientes.
    val cpfListaNegra: Set<String> = setOf("35645678579","23548675912")

    fun inserirCadastro(nome: String, cpf: String) {
        if (cpf in cpfListaNegra) {

            println("Este cpf não pode ser cadastrado, informe a gerênria.")
        }
        else {
            cpfCliente.add(cpf)
            println("Cliente $nome cadastrado.")
        }
    }

    fun consultarNaLista(nome: String, cpf: String): Boolean {  // Esta função foi criada apenas como estudo, o ideal seria utilizar uma Maplist para associar cada nome ao cpf.
        if (cpf !in cpfCliente) println("Cliente $cpf não cadastrado.") else println("Cliente $cpf cadastrado")

        return cpf in cpfCliente
    }

}

fun main() {
    val cadastroDeClientes = CadastroDeClientes()

    cadastroDeClientes.inserirCadastro("William","12345678941")
    cadastroDeClientes.inserirCadastro("Ingrid","98765432145")
    cadastroDeClientes.inserirCadastro("Roberto","35645678579")

    cadastroDeClientes.consultarNaLista("Jorge","123456789")
    
}