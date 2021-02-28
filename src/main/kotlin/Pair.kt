fun main() {
    val coord = Pair(2, 5)
    val coord1 = Pair(3, 6)
    val coord2 = Triple(2, 5, 10)
    println(coord)

    // OU----------------------------------------------------------------------------------

    println("X: ${coord.first} Y: ${coord.second}")

    //OU com o destrutor---------------------------------------------------------------------

    val (x,y) = coord

    println("x: $x y: $y")

    //OU com o destrutor usando _ para pegar apenas uma-----------------------------------------------------------

    val (x1,_) = coord1

    println("x: $x1")

    //OU com Triple-----------------------------------------------------------------------------------

    val (x2, y2, z2) = coord2
    println(coord2)

    // Pode ser usado para representar dia , mes , e ano
}