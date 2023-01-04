fun condicionalesFuncion(){
    //en kotlin podemos asignar valores a una variable a partir de un if
    val edad = 14;
    val mensaje: String = if(edad >=18){
        "Eres mayor de edad"
    } else {
        "No tienes edad"
    }
    println(mensaje)
}

fun whenCodicional(nombreColor: String, codigo: Int){
    when (nombreColor) {
        "Amarillo" -> println("Este color simboliza la felicidad")
        //con la soma incluimos nuevos casos en donde se va a entrar
        "Rojo", "Carmesi" -> println("Este color es el color de la sangre")
        else -> println("No me diste ningun color")
    }
    //rangos, podemos checar si nuestra variable se encuentra en un rango
    // notese que al igual que if, podemos hacer una asignacion atravez de la sentencia
    val mensaje =
        when(codigo){
            in 100..299 -> "Todo ha salido bien"
            in 300..599 -> "Ha habido algun error"
            else -> "Error desconocido"
        }
    println(mensaje)
}