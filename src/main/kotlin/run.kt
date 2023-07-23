/*
En Kotlin, la función run es una función de orden superior que se utiliza para
realizar operaciones en un objeto y devolver un resultado.
Proporciona un contexto en el que puedes acceder a las propiedades y métodos del objeto de manera concisa.
 */

fun runOp(){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run{
            removeIf{movil -> movil.contains("Google")}
        }
    println(moviles)
}