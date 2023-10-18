/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

fun main(){
    var count : Int = 0
    for (index in 1..100){
        for (index2 in 1..index){
            if(index % index2 == 0) count++
        }
        if(count == 2) println("$index")
        count = 0
    }
}