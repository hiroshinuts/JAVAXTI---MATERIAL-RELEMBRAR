package nuts.hiro.threads;


/*
 *  Para rodar Threads , pode usar herança (extend) Thread ou
 *  
 *  Utilizando a interface (implements) Runnable .
 *  
 *  Deve ser criado a run()
 *  
 *  Run - o q vai fazer a Thread
 * 
 */


public class ThreadRunnable implements Runnable {

	String palavra;
	long tempo;

	public ThreadRunnable(String palavra, long tempo) { // construtor
		this.palavra = palavra;
		this.tempo = tempo;
	}


	public static void main(String[] args) {

		Runnable ping = new ThreadRunnable("ping", 1200); // colocar no estado pronto -
												// start
		Runnable pong = new ThreadRunnable("pong", 1500); // colocar no estado pronto -
												// start
		
		
		new Thread(ping).start(); // informa a runnable
		new Thread(pong).start(); // informa a runnable

		System.out.println("Ver Threads");
	}


	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print(palavra + " ");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
				return;
		}
		
		
	}

}
