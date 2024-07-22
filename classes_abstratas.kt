class pilhaMutavel<E>(vararg items: E) {    
    
    // O parametro E pode ser qualquer coisa, qualquer tipo. A definição <> significa um tipo genérico.
    // O vararg permite receber uma lista/array de E, ou seja, uma quantidade variavel de elementos do mesmo tipo.file
    // Para receber elementos de qualquer tipo usamos <any> na chamada do objeto.
    
    private val elements =  items.toMutableList()       // Converte para lista

    fun push(element: E) = elements.add(element)        // Recebe um elemento e adiciona o elemento na lista

    fun peek(): E = elements.last()                     // Observa o ultimo elemento.

    fun pop(): E = elements.removeAt(elements.size - 1) // Remove o ultimo elemento.

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size                           // Devolve o tamanho

    override fun toString() = "PilhaMutavel(${elements.joinToString()})" 
    // Sobrescrita para converter a pilha em string para falicitar a visualização


}

fun main(){

    val senha = pilhaMutavel(4,1,4,7,2,9,3,4,9)// Criação de um objeto da classe pilhaMutavel.
    senha.push(8)
    
    println(senha)
    
    for (i in 0 until senha.size())
        println("${senha.pop()} removido")
        println(senha.size())

    senha.push(2)
    senha.push(3)
    senha.push(6)
    senha.push(9)

    println ("Nova senha: ${senha}")

}