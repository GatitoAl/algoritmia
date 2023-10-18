/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main(){

    //Llamar a la función
    var areas = areas()
    areas.triangle(5,9)
    areas.squart(5)
    areas.rectangle(4,9)
}

//Clase para manejo de las funciones
class areas(){

    //Función del área del triángulo
    fun triangle(base : Int, altura : Int){
        var area : Float
        area = ((base*altura)/2).toFloat()
        println("El área del triángulo es: $area")
    }

    //Función del área del cuadrado
    fun squart(lado : Int){
        var area: Int = lado*lado
        println("El área del cuadrado es: $area")
    }

    //Función para el área del rectangulo
    fun rectangle(base : Int, altura : Int){
        var area : Int = base * altura
        println("El área del rectángulo es: $area")
    }
}