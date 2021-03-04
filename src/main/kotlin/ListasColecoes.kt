/*
fun main() {
    val nums = arrayOf(1,2,3,4)

    println(nums.size) // Tamanho da lista array
    println(nums.isEmpty()) // Para descobrir se a lista está vazia
    println(nums.first()) // Retorna o 1 elemento
    println(nums[1]) // Acessar os elementos da coleção através de indice
    println(nums.sliceArray(0..2).size) // faz um corte do 0 até o 2
    println(nums.contains(4))

    nums[0] = 10  // Atribui um novo valor ao indice 0
    println(nums[0])

    val drop = nums.drop(1) // Traz a lista a partir do numero dentro do drop()
    println(drop)

    println(nums.indexOf(4)) // para descobrir onde está o indice o elemento especificado
    println("---------------------------------------------------------------------------------------------------------")
    nums.forEachIndexed() { index, el ->
        println("index $index, elemento: $el")
    }

    println("---------------------------------------------------------------------------------------------------------")

    val l = arrayListOf<Int>(1,2,3,4)
    l.add(5)
    println(" ${l} - Adicionou o 5")

    l.remove(1)
    println(" ${l} - removeu o 1")

    l.addAll(arrayListOf(10,11,12))
    println(" ${l} - Adicionou o 10 11 12")

    l.set(0, 150) // Ou com indexador l[0] = 300
    println(" ${l} - Substituiu o elemento 0 por 150 ")

    l.clear()
    println(" ${l} - Apaga todos os registros da lista")

    println("---------------------------------------------------------------------------------------------------------")
    val n = mutableListOf("a", "b")
        n.remove("b")
        println(n)
}
 */

//      MAPAS
fun main() {
    val  map = mutableMapOf("A" to 2, "B" to 3, "C" to 30)

    println(map)
    println(map["A"])
    println(map.isEmpty())
    println(map.count())

    println("---------------------------------------------------------------------------------------------------------")
    for ((key, value) in map){
        println("key $key, value $value")
    }

    println("---------------------------------------------------------------------------------------------------------")
    for (key in map.keys){
        println("key $key")
    }
}

//Quando for trabalhar com listas grandes e a ordem importa podemos trabalhar com array
// Se precisar que a lista cresca ou diminua de forma dinamica é importante usar lists ao inves de array
// Mapas para quando precisar fazer buscas frequentes sem sequencia de forma direta