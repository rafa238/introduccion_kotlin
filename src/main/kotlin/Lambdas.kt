/*
*   Las funciones lambdas es una funcion anonima, que se pasa directamente como una expresion
 */
//Para establecer el typing es (tipo parametro) -> tipo retorno
// declaramos entre {}
// la declaracion dentro es {parametros -> logica}
fun miLambda(){
    val myLambda : (String) -> Int = {
        valor -> valor.length
    }
    println(myLambda("hola"))
    val lista = listOf<String>("Manzana", "banana", "Pera")
    val listaLongitudes = lista.map(myLambda)
    println(listaLongitudes)
}