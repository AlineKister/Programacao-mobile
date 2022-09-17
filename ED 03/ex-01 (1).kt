class Conta(val cliente:String , var saldo:Double, val numero:Int, val agencia:Int){
     
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
    
  
    
    override fun toString(): String = "$cliente $$saldo"
}
