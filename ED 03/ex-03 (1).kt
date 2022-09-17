class conta(val cliente:String , var saldo:Double, val numero:Int, val agencia:Int){
     
    override fun compareTo(other: conta): Int = this.cliente.compareTo(other.cliente) // Ordena por Nome
//  override fun compareTo(other: conta): Int = this.saldo.compareTo(other.saldo) // Ordena por Saldo

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

 val contas = arrayOf(
     
     conta("Lucas",1300.00,1212,2248),
     conta("Aline",1200.00,5454,6845),
     conta("Lilian",1500.00,1213,7245),
     conta("Marco",1400.00,1564,3745),
     conta("Amanda",6600.00,3164,6747)
     
 )
  

fun main() {

    println("Exercicio 3")
    println("------------------------------------------------------------------------")
    contas.sort()
    println(contas.joinToString())
    println("")
 
}