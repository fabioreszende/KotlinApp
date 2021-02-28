fun main() {
    val age = 28

    when(age) {
        in 0..15 -> println("Está dentro da idade")
        in 16..31 -> println("Não está dentro da idade")
    }
}