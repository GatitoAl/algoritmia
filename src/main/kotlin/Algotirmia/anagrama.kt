/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

//Función principal
fun main(){
    println(anagrama("amor","roma"))
}

//Función para hacer el anagrama
fun anagrama(worldOne : String, worldTwo: String) : Boolean{
    if(worldOne.lowercase() == worldTwo.lowercase()){
       return false
    }else{
      return  worldOne.lowercase().toCharArray().sortedArray().contentEquals(worldTwo.lowercase().toCharArray().sortedArray())
    }
}
