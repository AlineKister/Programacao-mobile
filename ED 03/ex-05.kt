interface Boleto {
    fun imprimirBoleto()
}   

open class conta(val cliente:String , var saldo:Double, val numero:Int, val agencia:Int): Comparable<conta>, Boleto{
     
    override fun compareTo(other: conta): Int = this.cliente.compareTo(other.cliente) // Ordena por Nome
//     override fun compareTo(other: conta): Int = this.saldo.compareTo(other.saldo) // Ordena por Saldo

    fun Depositar(valorDeposito:Double){
        saldo = saldo + valorDeposito
    }
    
    fun Retirar(valorRetirar:Double){
       saldo =  saldo - valorRetirar        
    }
    
    var valor: Double = 0.0
    fun Transferir(ValorTransferencia:Double){
       
        saldo = saldo - ValorTransferencia
        valor  = ValorTransferencia
       
    }
    
    fun imprimirExtrato() {
        println("Nome: $cliente, Saldo: $saldo, Conta: $numero, Agência: $agencia")
    }
    
    override fun imprimirBoleto(){
        println("Boleto Impresso")
    }
    
    override fun toString(): String = "$cliente $$saldo"
}

  var contaAline = conta("Aline",1200.00,5454,6845)
  

fun main() {
    
   println("Exercicio 4")
   println("------------------------------------------------------------------------")
   contaAline.imprimirBoleto()
 
}