open class conta(val cliente:String , var saldo:Double, val numero:Int, val agencia:Int): Comparable<conta>{
     
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

 class ContaPoupanca( cliente:String ,  saldo:Double,  numero:Int,  agencia:Int) : conta(cliente, saldo, numero, agencia) {
   
     fun aplicarJuros(dias:Int){
         saldo = saldo + ( saldo * 0.3 * dias )
     }
   
 }
 
  var contaPoupancaAline = ContaPoupanca("Aline",1200.00,5454,6845)
 

fun main() {

   contaPoupancaAline.aplicarJuros(3)
   contaPoupancaAline.imprimirExtrato()
   
}