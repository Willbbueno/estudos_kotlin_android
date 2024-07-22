class pilhaMutavel<E>(vararg items: E) {    
    
    // O parametro E pode ser qualquer coisa, qualquer tipo. A definição <> significa um tipo genérico.
    // O vararg permite receber uma lista/array de E, ou seja, uma quantidade variavel de elementos do mesmo tipo.
    // Para receber elementos de qualquer tipo usamos <any> na chamada do objeto.
    
    private val elements =  items.toMutableList()       // Converte para lista

    fun push(element: E) = elements.add(element)        // Recebe um elemento e adiciona o elemento na lista

    fun peek(): E = elements.last()                     // Observa o ultimo elemento.

    fun pop(): E = elements.removeAt(elements.size - 1) // Remove o ultimo elemento.

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size                           // Devolve o tamanho

    override fun toString() = "ilhaMutavel(${elements.joinToString()})" 
    // Sobrescrita para converter a pilha em string para falicitar a visualização

    
}

fun <E> mutableStackOf(vararg elements: E) = pilhaMutavel(*elements) // Quando esta função for chamada ela vai criar uma nova pilhaMutavel utilizando como parametro os dados de element.

fun main () {

    val pilha = mutableStackOf("A","B",1)
    println(pilha)
   
}