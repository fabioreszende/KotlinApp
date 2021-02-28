
//Criando uma função

fun sub(x: Int, y: Int) : Int {
    val res = x - y
    println("O resultado é")
    return res

}


fun main(args: Array<String>) {
    val anoAtual = 2020
    val anoNasc = 1992

    println(sub(anoAtual, anoNasc))

}

