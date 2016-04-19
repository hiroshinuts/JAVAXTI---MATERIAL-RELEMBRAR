package nuts.hiro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilitarioCollections {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Guarana");
		list.add("Uva");
		list.add("Banana");
		list.add("Coco");
		list.add("Açai");
		list.add("Manga");
		System.out.println(list);
		
		Collections.sort(list); // ordenar em ordem alfabetica a lista 
		System.out.println(list);
		
		Collections.reverse(list); // Inverter a ordem da lista
		System.out.println(list);
		
		Collections.shuffle(list); // Misturar de forma aleatoria
		System.out.println(list);
		
		Collections.addAll(list, "Cupuaçu", "Laranja", "Limao", "Laranja" ); // adicionar mais itens , diretamente , na mesma colecao
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja")); // frequency = frequencia q o nome "Laranja" aparece na lista
		
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		boolean d = Collections.disjoint(list, list2); // Verifica se dentro da lista principal, possui essas frutas
		System.out.println(d);
		
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guarana"); // Pesquisar na lista onde esta o guarana (mostra o indice)
		System.out.println(indice);
		System.out.println(list);
		
		Collections.fill(list, "Açai"); // altera todas as posicoes, a palavra "Açai"
		System.out.println(list);
		
		
		/*COLECAO Q NAO PODE SER MODIFICADA*/
		Collection<String> constante = Collections.unmodifiableCollection(list);
		
	}

}
