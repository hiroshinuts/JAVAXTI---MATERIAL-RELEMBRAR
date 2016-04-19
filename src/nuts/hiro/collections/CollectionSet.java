package nuts.hiro.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {
	
	/*Não aceita registros duplicados, apenas registros unicos*/
	
	
	public static void main(String[] args) {
		
		String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "amarelo", "verde"};
		
		List<String> list = Arrays.asList(cores); // List, pode ter duplicados (exemplo)
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list); // Adiciona "todos os elementos" , mas só mostra os registros unicos
		System.out.println(set);
		
	}

}
