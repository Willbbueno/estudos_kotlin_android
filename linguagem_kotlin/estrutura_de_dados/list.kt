

/*
List

Uma das mais utilizadas em kotlin, é uma estrutura de dados ordenadas.
Dependendo como instanciamos, ela pode ser mutável ou imutável.

Por exemplo:

listOf() - é uma função read-only, ou seja, somente leitura, ela é imutável.

mutableListOf() - é uma função mutável, ela pode ser alterada.



*/

 
val systemUsers: MutableList<Int> = mutableListOf(1,2,3) // A varirável é imutavél e recebe uma lista mutável, são coisas diferentes.
val sudoers: List<Int> = systemUsers                     // A sudoers é uma variável imutável e recebe os valores da lista systemUsers, porém ela é somente leitura. Não podemos atribuir novos valores a ela, quando a lista systemUsers for atualizada esta variável também será.


fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
} 


fun main () {
    addSystemUsers(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user ${i}")
    }
    
    
}




