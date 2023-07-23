/*
La función also es otra función de alcance, cuyo objetivo es permitirte añadir acciones adicionales
sobre un objeto, a través de una lambda regular como parámetro.

Su uso se traduce a «y también hacer lo siguiente con el objeto».
 */
fun alsoOp (){
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52")
        .also { lista -> println("El valor original de la lista es $lista")
        }.asReversed()
    println(moviles)
}