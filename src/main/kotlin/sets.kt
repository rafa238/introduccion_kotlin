fun vocalesRepetidas(){
    //los sets son una ds que nos permite no guradar repetidos
    val vocales = setOf<Char>('a', 'e', 'i', 'o', 'u', 'a', 'e', 'i', 'o', 'u')
    println(vocales)

    //añadir elementos
    val vocalesMutable = mutableSetOf<Char>('a', 'e', 'o', 'u', 'a', 'e', 'o', 'u')
    println(vocalesMutable)
    vocalesMutable.add('i')
    println(vocalesMutable)

    //remover un elemento del set
    vocalesMutable.remove('i')
    println(vocalesMutable)

    //hay diferentes formas de filtrar nuestro set
    val nuevasVocales = vocalesMutable.filter { vocal -> vocal == 'a' || vocal == 'i' }
    println(nuevasVocales)
}