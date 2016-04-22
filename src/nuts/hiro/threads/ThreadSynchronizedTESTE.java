package nuts.hiro.threads;

public class ThreadSynchronizedTESTE implements Runnable{

	ThreadSynchronized conta = new ThreadSynchronized();
	
	public static void main(String[] args) {
		
		ThreadSynchronizedTESTE irAsCompras = new ThreadSynchronizedTESTE();
		
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mae").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Baba").start();
		
	}
	
	
	@Override
	public void run() {
		
		String cliente = Thread.currentThread().getName(); // recuperar o nome do cliente q esta comprando
		
		for (int i= 0; i < 5; i++){ // realiza 5 compras
		
		conta.sacar(20, cliente);  //realizando saque
		
		if(conta.getSaldo() < 0) { // verificacao de saldo
			System.out.println("Estourou");
		}
		}
		
	}

}
