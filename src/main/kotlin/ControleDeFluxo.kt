import java.util.concurrent.locks.Condition

// Controle de Fluxo

/*
fun main() {
    val age = 7

    if (age > 0){
        println("Idade dentro do esperado ")
    }
    else if (age < 8) {
        println("idade menor que 8")
    }
    else{
        println("idade não pode ser menor ou igual a zero")
    }
}
 */

/*
fun main() {
    var i = 0

    while (i <= 10) {
        println("i está com $i")

        i ++
    }
}
*/

/*
fun main() {
    var  i  = 0

    do {
        println("i está com $i")
        i++

        if (i == 5){
            break
        }
    }
    while ( i < 10)


}

 */

/*
fun main() {

    for (i in 0..10){
        println("i está com $i")
    }
}
 */

// SOBRECARGA DE FUNÇÕES / overload de metodo / duas funções com mesmo nome
/*
fun sum(x: Int, y: Int) : Int{
    return x + y
}
fun sum(x: Double, y: Double) : Double{
    return x + y
}

fun main() {
    print(sum(2.5, 3.3))
}
 */

// GUARDAR UMA FUNÇÃO DENTRO DE UMA VARIAVEL
/*
fun sum(x: Double, y: Double) : Double{
    return x + y
}
var function: (Double, Double) -> Double = ::sum // <------ function recebeu a função acima com ::sum

fun main() {
    print(function(2.5, 3.5))
}
 */

// CONCEITO DE TYPE ALIAS

fun sum(x: Double, y: Double) : Double{
    return x + y
}
fun subtract(x: Double, y: Double) : Double{
    return x - y
}
fun calculator(x: Double, y:Double, condition: operation){
    println(condition(x,y))
}
typealias operation = (Double, Double) -> Double  // <-- Antes eram parametros de condition

fun main() {
    calculator(8.5, 9.2, ::sum)
    calculator(8.5, 9.2, ::subtract)
}
