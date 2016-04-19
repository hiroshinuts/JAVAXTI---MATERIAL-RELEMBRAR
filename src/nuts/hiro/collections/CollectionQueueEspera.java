package nuts.hiro.collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueueEspera {

	public static void main(String[] args) {
		
		//FIFO = First IN , First Out
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ricardo"); // pode adicionar assim com add
		fila.add("Marcio");
		fila.add("Marco");
		fila.offer("Hiro");  // tambem pode adicionar com offer
		fila.offer("Minalba");
		System.out.println(fila);
		
		System.out.println(fila.peek()); // Informa quem é o proximo da fila, mas nao seleciona
		
		System.out.println(fila.poll()); // remove o elemento do inicio da fila
		
		System.out.println(fila);
		
		
		/*OUTROS METODOS DISPONIVEIS EM LINKEDLIST*/
		
		LinkedList<String> f = (LinkedList<String>) fila; // fazer um cast de LinkedList
		f.addFirst("Caio"); // adiciona um elemento no começo da fila
		f.addLast("Zuleica");// adiciona um elemento no final da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst()); // mostra o primeiro da fila sem remove-lo
		System.out.println(f.peekLast()); // mostra o ultimo da fila sem remove-lo
		
		
		f.pollFirst(); // remove primeiro elemento da fila
		f.pollLast(); // remove ultimo elemento da fila
		System.out.println(f);

	}

}
