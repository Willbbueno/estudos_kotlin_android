

fun main() {

    var naoPodeNulo: String = "Não pode ser nulo"
    //naoPodeNulo = Null                            // Se for compilar este código dára erro. Pra atribuir o nulo precisamos utilizar "?" na string, como no próximo exemplo.
    
    var podeSerNulo: String? = "Pode ser nulo"
    podeSerNulo = null                           // Agora podemos atribuir o nulo sem problemas.
 
    var stringSemTipagem = "Esta string não possui tipagem" // Por padrão o kotlin atribui as variáveis como não nula, mesmo que não tenha sido tipada. Se tertarmos atribuir um valor nulo a ela, dará erro.
    // stringSemTipagem = null

    fun tamanhoString(semNulos: String): Int {
        return semNulos.length
    }

    tamanhoString(naoPodeNulo)               // Não podemos passar como argumento um valor nulo para uma função que pede um argumento não nulo, mas se aplicarmos a ? no parametro, podemos aceitar o nulo. 
    //tamanhoString(podeSerNulo)

    }