/*
O range tambem pode ser utilizado com ifs e strings.
Nas strings utilizamos o espaçador 'a'.

*/

fun main() {

// Os recursos são os mesmos como .., until, downTo e step.
    for (i in 'a'..'e') {    
        print(i+" ")

    }
    println()

    for (i in 'S' downTo 'A' step 2) { 
        print(i)
    }

    println()

// Range com ifs

    val x = 11

    if (x in 1..5) {
        println("x está entre 1 e 5")
    }

    if (x in 6..10) {
        println("x está entre 6 e 10")
    } 

    else if (x > 10) {

        println("x é maior que 10") 
    }
    
}

