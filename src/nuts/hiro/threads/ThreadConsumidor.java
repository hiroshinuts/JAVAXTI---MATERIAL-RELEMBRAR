package nuts.hiro.threads;

import java.util.Random;

public class ThreadConsumidor implements Runnable {

	private Ponte ponte;
	
	public ThreadConsumidor(Ponte ponte) {
		this.ponte = ponte;
	}
	
	private Random random = new Random(); // Para gerar tempo de espera random
	
	@Override
	public void run() {

		for(int i = 0 ; i < 5 ; i++){
			try{
				
				int total = 0;
				Thread.sleep(random.nextInt(3000));
				total += ponte.get();
				System.err.println("\t" + total);
				
			}catch(InterruptedException e) {}
		}
		
	}

}


