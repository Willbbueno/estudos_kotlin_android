/*

Conjunto - Map

Possui as mesmas caracteríticas do Set, porém é uma estrutura chave-valor, ou seja, podemos associar um valor a uma chave única.
Possui as funções de inicialização mapOf e mutableMapOf.

Quando usar?

Utilizado par armazenar identificadores únicos para associar dados, contar ocorrências, agrupas itens por categorias
*/

// Mesmp exemplo do set, porém adicionando novas funcionalidades com Map como associar um nome ao cpf.

class CadastroDeClientes {

    val cpfCliente: MutableMap<String, String> = mutableMapOf() // Inciamos com uma variável map vazia que armazenará os dados com as chave-valor.
    val cpfListaNegra: Set<String> = setOf("35645678579","23548675912") // Crie uma variável que serve como lista negra para cpfs que não podem ser cadastrados.
    
    fun inserirCadastro(nome: String, cpf: String) {
        if (cpf in cpfListaNegra) {

            println("Este cpf não pode ser cadastrado, informe a gerência.")
        }
        else {
            cpfCliente.put(cpf, nome)
            println("Cliente $nome cadastrado.")
        }
    }

   /*  fun consultarNaLista(nome: String, cpf: String): Boolean {
        if (cpf !in cpfCliente) println("Cliente $cpf não cadastrado.") else println("Cliente $cpf cadastrado")

        return cpf in cpfCliente
    }

    fun mostrarCadastro(): Set<String> {
        println("Lista dos clientes cadastrados: $cpfCliente")
        return cpfCliente
    }
        */
}

fun main() {
    val cadastroDeClientes = CadastroDeClientes()

    cadastroDeClientes.inserirCadastro("William","12345678941")
    cadastroDeClientes.inserirCadastro("Ingrid","98765432145")
    cadastroDeClientes.inserirCadastro("Roberto","35645678579")
    println(cadastroDeClientes.cpfCliente)
    
}