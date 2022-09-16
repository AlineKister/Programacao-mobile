fun main() {
   var fatorial:Int = 1

    for(i in 0..10){
       
        if(i != 0)
        fatorial = fatorial * i
        println("Fatorial de ${i} é ${fatorial}")
    }
     
}