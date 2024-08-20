// Jhon Sebastian Jauregui Blanco

fun main(){
    var estado = true
    while(estado){
        println("""
            ${(saludo())} Porfavor seleccione una opcion
            Menu:
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            5. Raiz
            6. Cuadrado
            7. Salir
    """.trimIndent())
        var opcion: Int = readln().toInt()
        if (opcion == 1){
            suma()
        }
        else if(opcion == 2){
            resta()
        }
        else if(opcion == 3 ){
            println(multi(12.0,2.0))
        }
        else if (opcion == 4){
            division(12.0, 3.0)
        }
        else if(opcion == 5){
            println("La raiz es: ${raiz()}")
        }
        else if (opcion == 6){
            println("el cuadrado es: ${cuadrado()}")
        }
        else{
            estado = false
        }
    }
}

fun suma(){
    var n1 = 10
    var n2 = 3
    println("La suma de $n1 + $n2 es = ${(n1+n2)}")
}

fun resta(){
    var n1 = 20
    var n2 = 5
    println("La resta de $n1 - $n2 es = ${(n1-n2)}")
}

fun raiz(): Double{
    var n1= 12.0
    return Math.sqrt(n1)
}

fun cuadrado(): Double{
    return Math.pow(30.0,2.0)
}

fun saludo(): String{
    return "Hola clase"
}

fun division(numero1: Double, numero2:Double){
    var div = numero1/numero2
    println("La division de $numero1 / $numero2 es = $div")
}

fun multi(n1:Double, n2: Double): String{
    var resultado = "La multiplicacion de $n1 x $n2 es = ${(n1*n2)}"
    return resultado
}