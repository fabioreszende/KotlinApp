
package POO

// - Classes
// - Construtores
// - Inicializações
// - Herança
// - Subclasses
// - Dataclasses

class Person {
    var firstName = ""
    var lastName = ""

    fun run() {
        println("Go running..")
    }
}

fun main() {
    val person1 = Person()
    val person2 = Person()

    person1.firstName = "Fabio"
    person1.lastName = "Rezende"

    println(person1.firstName)
    person1.run()


}