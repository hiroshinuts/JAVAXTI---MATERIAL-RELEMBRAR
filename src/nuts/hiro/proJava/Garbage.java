package nuts.hiro.proJava;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static long carregarMemoria() { // metodo para sobrecarregar a memoria
		
		for(int i=0; i < 100_000; i++){
			List<Integer> list = new ArrayList<>();
			list.add(i);
		}
		
		return Runtime.getRuntime().freeMemory();

	}

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576; // Total de bytes em 1MB
		double total = rt.maxMemory() / MB;
		
		double inicio = total - (carregarMemoria()/MB);
		
		
		rt.runFinalization(); // Finalizar tudo q seja possivel, que foram carregados na memoria
		rt.gc(); // chamar o garbage collection, q força a execucao do Gc
		
		double fim = total - (rt.freeMemory()/MB);
		
		System.out.println(total);
		System.out.println(inicio);
		System.out.println(fim);
		
		
		
	}

}
