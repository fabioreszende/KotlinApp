package POO
// Construtor Primario
/*class Person00(var firstName: String) {
    // construtor secundario

    var lastName: String? = null

    constructor(firstName: String, lastName: String) : this(firstName){
        this.lastName = lastName
    }

}

fun main() {
    val person1 = Person00("Fabio", "Rezende")
    val person2 = Person00("Renato", "Souza")

    println("${person1.firstName} ${person1.lastName}")
    println(person2.firstName)
}
 */

class Person00(var firstName: String, val lastName: String) {

    var fullName: String

    init {
        fullName = "$firstName $lastName"
    }
    init {
        println(fullName)
    }
}

fun main() {
    val person1 = Person00("Fabio", "Rezende")
    val person2 = Person00("Renato", "Souza")


    }


