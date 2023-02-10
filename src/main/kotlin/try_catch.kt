
fun tryCatch(){
    /*
    * El operador ? nos permite que una variable pueda tener valores nulos (null)
    * cuand accedemos a una propiedad y ponemos ? nos permite acceder al atributo o metodo
    * incluso cuando este sea null, y solo retornara "null"
     */

    /*
    * El operador !! nos permite acceder a un atributo o metodo incluso cuando este sea null
    * pero hay que tener cuidado porque en este caso si nos retornara un nullptr exception
    * Por ello utilizaremos el try, catch. Que nos permitira cachar el error y manejarlo a nuestro gusto
    * */
    var nombre : String? = "Rafa"
    println(nombre?.length)
    try{
        nombre!!.length
    }catch (exception: NullPointerException){
        // La sentencia throw nos ayuda a lanzar una excepcion intencional
        //throw NullPointerException("Referencia nula")
        println("Ha ocurrido un error")
    } finally {
        /*
        * La sentencia finally se ejecutara al final del catch y del try, no importa si hubo un error
        * */
        println("Esta sentencia se ejecuta de todos modos")
    }

    /*
    *Tambien se puede hacer una asignacion atraves del try-catch
     */
    val a = 6
    val b=0
    val resultado:Int = try { a/b }catch (exception: Exception){ 0 }
    println("Este resultado de division puede ser entre cero, entonces devoelvera 0: $resultado")
}