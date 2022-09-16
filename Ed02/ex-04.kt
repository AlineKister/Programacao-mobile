
 fun main() {
    
  var nota1: Float = 10f
  var nota2: Float = 10f
  var nota3: Float = 10f
  
  var peso1: Int = 2


var peso2: Int = 3
  var peso3: Int = 5
  
  var media:Float = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / (peso1 + peso2 + peso3)
  
  println(media)
    
    if(media >= 6){
        println("Aprovado")
    }else if(media >= 3){
        println("Recuperação")
    }else {
        println("Reprovado")
    }
   
}