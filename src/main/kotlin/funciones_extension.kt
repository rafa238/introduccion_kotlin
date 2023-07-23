/*
* Las funciones de extensión nos permiten crear nuevas funciones
* a partir de un tipo de clase, como por ejemplo una String.
 */

/*
    Por ejemplo, partimos de un tipo de clase String y el nombre de la funcino
    String.nombre de funcion -> y el tipo de retorno

    Accederemos al tipo através de la sentencia this
 */
fun String.upperOrLower(): String{
    /*
    *   Esta funcion hace mayusculas o minusculas de manera aleatoria
     */
    val rangoAleatorio = 0..99
    val resultadoAleatorio = rangoAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}