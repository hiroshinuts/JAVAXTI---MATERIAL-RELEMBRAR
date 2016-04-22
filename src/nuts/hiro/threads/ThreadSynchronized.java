package nuts.hiro.threads;


//Problema -- Varias pessoas sacando ao mesmo tempo, em uma mesma conta . 

/* 	THREAD A                                     THREAD B
 *  												|	
 *  Bloqueia										|
 *		|  											|Aguarda o Desbloqueio
 *  Tem Saldo?										|da Thread A para
 *  	|											|continuar execucao
 *  Saca Valor?										|	
 *  	|
 *  Desbloqueia -------------------------------- Bloqueia
 *  	|                                            |
 * 		|                                        Tem saldo?
 * 		|											 |
 * 		| Thread A continua                     Saca Valor
 * 		| sua execucao                               |
 * 		|                                       Desbloqueia    
 * 		|
 * 
 * 
 */


public class ThreadSynchronized {
	
	private int saldo = 100;
	
	public int getSaldo(){
		return saldo;
	}

	public synchronized void sacar(int valor, String cliente){
		
		if(saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
		
				try {
					System.out.println(cliente + " esperando");
					Thread.sleep(1000);// aguardando o processamento da solicitacao do saldo
				} catch (InterruptedException e) {}
					saldo -= valor;
					
					String msg = cliente + " SACOU " + valor+
							" [Saldo Original =" + saldoOriginal + ", Saldo FInal= " + saldo + "]";
					
					System.out.print(msg);
				
		}else {
			System.out.println("Saldo Insuficiente para " + cliente);
		}
	}
}
