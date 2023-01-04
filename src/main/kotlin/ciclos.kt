fun whiles(contador: Int){
    //aqui declaramos un ciclo while
    var curr = contador
    while(curr > 0){
        println("Valor actual de disminuir $contador hasta 0 es $curr")
        curr--
    }
    //haremos un ciclo do while que tome numeros aleatorios dentro de un rango
    curr = contador
    do{
        val numeroAleatorio = (1..100).random() //vemos como los rangos se comportan como objeto
        println("Numero aleatorio escogido $numeroAleatorio")
        curr--
    } while(curr>0)
}

fun forFrutas(){
    val canasta = listOf<String>("Manzana", "Pera", "Frambuesa", "Durazno")
    //primer forma de recorrer listas
    for(fruta in canasta){
        println("Nuestra canasta tiene una fruta llamada $fruta")
    }
    //segunda forma de recorrer listas
    canasta.forEach { fruta -> println("Hay una fruta $fruta") }

    //forma de mapear una lista (aplicar una funcion a cada elemento de una lista)
    val longitudFrutas :List<Int> =  canasta.map { fruta -> fruta.length }
    longitudFrutas.forEach({longitud -> println("La fruta tiene una longitud $longitud") })

    //filtrar una lista para encontrar un elemento en una lista
    val listaFiltrada = canasta.filter { fruta -> fruta.length > 5 }
    listaFiltrada.forEach({fruta -> println("$fruta tiene un tamaño mayor a 5")})
}