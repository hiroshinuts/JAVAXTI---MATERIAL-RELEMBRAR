package nuts.hiro.threads;

import java.util.Random;

public class ThreadProdutor implements Runnable{

	
	private Ponte ponte;
	
	public ThreadProdutor(Ponte ponte) {
		this.ponte = ponte;
	}
	
	private Random random = new Random(); // Para gerar tempo de espera random
	
	@Override
	public void run() {

		for(int i = 0 ; i < 5 ; i++){
			try{
				
				int total = 0;
				Thread.sleep(random.nextInt(3000)); // espera gerado pelo random
				total += i;
				ponte.set(i);
				System.out.println("\t" + total);
			}catch(InterruptedException e) {}
		}
		
	}

}
