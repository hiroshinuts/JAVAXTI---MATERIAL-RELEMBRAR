package nuts.hiro.threads;

/*
 * 					        EXECUTANDO
 *					        // 
 *                         // run()
 *                        //
 *          start()      //
 *    NEW <---------> PRONTO
 *     		stop()       \\
 *     				      \\sleep()
 *     				       \\
 *                          \\
 *     				         ESPERANDO
 *    
 * 
 */

//executar o metodo start
//executando o metodo run()
//ve onde tem sleep
//retorna para o pronto
//vai para executando com o metodo run() novamente




public class CicloDeVida extends Thread {

	String palavra;
	long tempo;

	public CicloDeVida(String palavra, long tempo) { // construtor
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run() { //metodo run lança excecao, tratar com try/catch

		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(palavra + " ");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
				return;
		}
	}

	public static void main(String[] args) {

		new CicloDeVida("ping", 1200).start(); // colocar no estado pronto -
												// start
		new CicloDeVida("pong", 1500).start(); // colocar no estado pronto -
												// start

		System.out.println("Ver Thread");

	}

}
