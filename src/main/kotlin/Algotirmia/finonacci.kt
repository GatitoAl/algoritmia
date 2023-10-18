/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

fun main(){
    var serie : Long = 0
    var aux1 : Long = 0
    var aux2 : Long = 1
    var count : Int = 0
    while (count < 50){
        serie = aux1
        println("$serie")
        aux1 = aux2
        aux2 = aux1 + serie
        count++
    }
}