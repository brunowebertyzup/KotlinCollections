package br.com.zupacademy.array

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    var menorIdade = Int.MAX_VALUE
    for(idade in idades) {
        if(idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    idades.forEach { idade ->
        if(idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(maiorIdade)
    println(menorIdade)
}

fun testeMaiorIdadeIfs() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)
}