fun listas(){
    //lista inmutable: No podemos modificarla
    val listaNombres = listOf("Rafael", "Ameyalli")
    // como todas las variables en kotlin, podemos o no especificar el tipo

    //La lista mutable si permite ser modificada (insertar, actualizar, eliminar)
    val listaMutable = mutableListOf<String>()
    listaMutable.add("Rafael")
    listaMutable.add("Ameyalli")
    println(listaMutable)

    //obtener elemento por indice, ya sea por metodo o por operador de indice
    val valorUsandoGet = listaMutable.get(0)
    val valorUsandoOperador = listaMutable[0]
    println(valorUsandoGet + " " + valorUsandoOperador)

    //obetenr el primer valor cuya condicion se cumpla en la funcion lambda, en este caso empieze con letra 'A'
    //si no encuentra un elemento devolvera una excepcion, por lo que podriamos usar firstOrNull({lambda})
    val primerValor = listaMutable.first({nombre -> nombre.get(0) == 'A'})
    println(primerValor)

    //remover elementos por indice de la lista, recordar que al primera lista no se puede modificar
    listaMutable.removeAt(0)
    
}

fun ordenarListas(){
    val numerosLoteria = listOf(11,22,43, 56, 78, 66)
    println(numerosLoteria)
    //Ordenar de manera ascendente
    val numerosSorted = numerosLoteria.sorted()
    //ordenar de manera descendente
    val numerosAscendente = numerosLoteria.sortedDescending()

    println(numerosSorted)
    println(numerosAscendente)

    //menores a 50 al ultimo y numeros mayores a la derecha
    val ordenarPorMultiplos = numerosLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    //ordenar aleatoriamente
    val ordenadosAleatoriamente = numerosLoteria.shuffled()
    println(ordenadosAleatoriamente)

    // Reversear una lista
    val alReves = numerosLoteria.reversed()
    println(alReves)

    // Aplicar una función lambda a cada elemento de una lista
    val mensajesNumeros = numerosLoteria.map { numero -> "Este es el numero $numero" }
    println(mensajesNumeros)

    //retorna una lista que tenda todos los numeros que cumplan con la condicion de la lambda
    val numerosFiltrado = numerosLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrado)
}
