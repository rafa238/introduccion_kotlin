fun mapas(){
    //lista de superheros no mutable (no podemos cambiar sus valores)
    val edadSuperHeroes = mapOf(
        "ironma" to 35,
        "spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroes)
    //Crear lista mutable de s
    val edadSuperHeroesMutable = mutableMapOf(
        "ironma" to 35,
        "spiderman" to 23,
        "Capitan America" to 99
    )
    //diferentes formas de añadir elementos a un map
    //primero, funcion put
    edadSuperHeroesMutable.put("Wolverine", 30)
    println(edadSuperHeroesMutable)
    //segunda forma, operador []
    edadSuperHeroesMutable["Black Panther"] = 28
    println(edadSuperHeroesMutable)

    //cambiar valores se hace de la misma manera

    //Para remover un elemento es con la funcion remove
    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    //podemos obtener el map en forma de set
    println(edadSuperHeroesMutable.entries)

    //obtener las llaves y valores en una lista
    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)

}