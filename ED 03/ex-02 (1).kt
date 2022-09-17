class conta(val cliente:String , var saldo:Double, val numero:Int, val agencia:Int){
     
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

  var contaLucas = conta("Lucas",1200.00,1212,2248)

  var contaAline = conta("Aline",1200.00,5454,6845)
  
  var contaPoupancaAline = ContaPoupanca("Aline",1200.00,5454,6845)
 

fun main() {
 
   contaLucas.Depositar(1200.00)
   contaLucas.imprimirExtrato()
   
   contaLucas.Retirar(1200.00)
   contaLucas.imprimirExtrato()
   
   contaLucas.Transferir(200.00)
   contaLucas.imprimirExtrato()
   
   println("")
   
   contaAline.Depositar(1200.00)
   contaAline.imprimirExtrato()
   
   contaAline.Retirar(1200.00)
   contaAline.imprimirExtrato()
   
   contaAline.Transferir(200.00)
   contaAline.imprimirExtrato()
   
   println("")  
   
   contaLucas.Depositar(contaAline.valor)
   contaLucas.imprimirExtrato()
   
   contaAline.Depositar(contaAline.valor)
   contaAline.imprimirExtrato()
   
   println("")      
        
 
}