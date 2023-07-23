/*
    La función with nos ayuda a acceder directamente a las propiedades de la variable
    o a la misma variable utilizando this
 */

fun withOp(){
    val colores = listOf<String>("Rojo", "amarillo", "azul")
    with(colores){
        println("Los colores son: $this con longitud $size")

    }
}