import kotlin.random.Random

fun main(){
    var moneda: Int
    var cara: Int = 0
    var sello: Int =0
    for(i in 1..20){
        moneda = Random.nextInt(2)
        if (moneda == 0){
            cara++
        }
        else{
            sello++
        }
        println("$cara - $sello")
    }



}


