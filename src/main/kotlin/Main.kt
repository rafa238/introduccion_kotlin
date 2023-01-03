/*
* En kotlin se tiene la libertad de decidir si indicas el tipo de dato o no
*  esto depende de la convención que sigamos
*/
const val nombre: String = "Rafael"

fun variables(){
    println("Hello World!")
    // Variable var
    var billetes: Int = 10
    println(billetes)
    billetes = 5
    println("Tu Dinero se ha actualizado: $billetes")

    // Variable val es una constante y no cambiara su valor a lo largo del programa
    val monedas = 4
    println("Tienes $monedas monedas y no las puedes cambiar UnU")

    // Una constante optima en tiempo de ejecución se puede declarar  con const y val
    println("Tu nombre es $nombre y no lo puedes cambiar por ningun motivo")

    //En kotlin todos los tipos de datos son objetos y podemos acceder a sus métodos de forma facil
    val billetesRobados = 2
    val nuevosBilletes = billetes.minus(billetesRobados) //también podemos usar "-", asi como toda la vida
    println("Te han robado algunos billetes y ahora tienes $nuevosBilletes")
}

fun condicionales(){
    //en kotlin podemos asignar valores a una variable a partir de un if
    val edad = 14;
    val mensaje: String = if(edad >=18){
        "Eres mayor de edad"
    } else {
        "No tienes edad"
    }
    println(mensaje)
}

fun whenCodicional(){
    val nombreColor = "Rojo"

}

fun main(args: Array<String>) {
    condicionales()
}