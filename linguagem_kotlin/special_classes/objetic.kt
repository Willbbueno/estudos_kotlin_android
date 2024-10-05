/*

Em kotlin podemos utililzar a palavra reservada Objetic um método utilitário.
Por exemplo, podemos criar uma variável e atribuir a ele diversas outras variáveis e atraves do primeiro objeto, podemos chamar as outras variaveis.

Com essa ideia podemos utilizar uma ideia muito difundida na programação, o singleton.
Criar um objeto com instancia única.

É útil quando temos um contexto muito expecífico e não vamos mais utilizar essa lógica em outra parte de código, então não faria sentido criar uma classe só pra isso.  
*/

// Object expression - colocar variáveis dentro de uma variável. É util para colocar uma regra de negócio expecífica que não será mais utilizada em outra parte do código.

    fun calculaPreco(dataEspecial: Int, dataAniversario: Int, diaNormal: Int): Unit {

        val descontoPorData = object {

            var dataEspecial: Int = 2 * dataEspecial
            var dataAniversario: Int = 5 * dataAniversario
            var diaNormal: Int = 1 * diaNormal

        }
    
        println("Desconto por datas: Data Especial: ${descontoPorData.dataEspecial}%, data Aniversário: ${descontoPorData.dataAniversario}%, data em dias normais: ${descontoPorData.diaNormal}%")
    }

// Object Declaration 

object autenticacao {

    fun login (username: String, senha: String) {

        println("Autenticação: o usuário ${username} tentou logar com a senha ${senha}")
    }

  /*
    Criamos uma instancia única e acessamos o método da classe autenticação de forma direta. O fato de dizermos que autenticação 
    é um object faz que possamos acessa-lo diretamente na função main juntamente com seus métodos.

    características: Não precisa de classe, singleton global pode ser utilizada em qualquer lugar do código, economiza memória por não precisar criar várias instancias,
    acessada diretamente pelo nome do objeto. 

    Quando usar: indicado para lógica ou método compartilhado em todo o código. */
}


// Companion Object

    class BigBen {

        companion object Bonger{
            fun getBongs (nTimes: Int) {
                for (i in 1 .. nTimes){
                    println("Bong!")
                }
            }
/*         
    Companion object permite que eu chame um método de uma classe sem criar uma instancia, funciona como alternativa ao método estático. Pode implementar
    interfaces e conter propriedades. 

    Quando usar: quando quiser associar um método estático ou funções utilitárias a uma classe específica sem precisar de uma instancia,

*/
    }


}


fun main(){

    calculaPreco(21,3,5) // Object expression
    autenticacao.login("admin", "123456") // Object declaration
    BigBen.getBongs(12) // Companion object
    


}

