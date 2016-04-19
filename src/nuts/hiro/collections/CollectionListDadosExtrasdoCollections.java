package nuts.hiro.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionListDadosExtrasdoCollections {

	public static void main(String[] args) {
		
		
		/*Uma das principais caracteristicas é que List Aceita termos Iguais = Fubebol , Futebol , Boxe, Boxe*/
		List<String> list = new ArrayList<>();
		
		list.add("Futebol"); // adiciona
		list.add("Basquete");
		list.add("Volei");
		list.add("Tenis");
		list.add("Natacao");
		list.add("Hockey");
		list.add("Futebol");
		list.add("Boxe");
		list.add("Futebol");
		list.add("Boxe");
		
		System.out.println(list.toString());
		
		/*Percorrer uma List*/
		
		for(int i=0; i<list.size(); i++){
			
			String letra = list.get(i); // recuperar letra na posicao i
			list.set(i, letra.toUpperCase()); // reatribuir na mesma posicao dele e modificar para Uppercase
			
		}
		System.out.println(list);
		
		
		System.out.println(list.indexOf("BOXE")); // indexOf =  localizar um elemento dentro de nossa lista
		 
		System.out.println(list.subList(2, 4)); // subList = cria uma sublista que pega 
												//Dentro da lista principal, pegar os itens de 2 e 4

		list.subList(2, 4).clear();//remove a Sublista criada a cima da lista principal
		
		System.out.println(list);
		
	}

}
