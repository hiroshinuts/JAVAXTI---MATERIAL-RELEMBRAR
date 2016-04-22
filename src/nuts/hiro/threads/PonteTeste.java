package nuts.hiro.threads;

public class PonteTeste {

	public static void main(String[] args) {

		
		Ponte ponte = new PonteSincronizada();
		new Thread(new ThreadProdutor(ponte)).start();
		new Thread(new ThreadConsumidor(ponte)).start();
		
		
	}

}
