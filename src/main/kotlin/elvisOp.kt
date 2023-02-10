
fun elvisCaracters(){
    /*
    * El operador Elvis nos sirve para devolver un valor por defecto en caso de que el valor sea null
    * El operador se llama asi debido a que ?: es una carita con un copete parecido al de Elvis Presley
    * */
    val nombre:String? = null
    val caracteresNombre = nombre?.length ?: 0
}