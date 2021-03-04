package POO

open class Person01(var firstName: String) {

    init {

    }
}

open class Student(name: String) : Person01(name){
    init {
        this.firstName = name.toUpperCase()

    }
}

open class MemberGroup(name: String) : Student(name){
    open var time = 2
}

class Player(name: String) : MemberGroup(name){
    override var time: Int
        get() = super.time * 2
        set(value) {}
}

fun printClass(pessoa: Person01) {
    println(pessoa.firstName)
}

fun main() {
    val estudante = Student("Renato")

    printClass(estudante)

}