package nuts.hiro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionsPrincipaisOperacoes {
	
	public static void main(String[] args) {
		
	
	Collection<String> c = new ArrayList<>(); // Começando, arraylist
	c.add("A"); // add no arraylist
	c.add("E");
	c.add("I");
	c.add("O");
	c.add("U");
	System.out.println(c.toString());// toString = Imprime todas em forma de string
	System.out.println(c.isEmpty()); // isEmpty = se esta vazio (true/false)
	System.out.println(c.contains("A")); //contains() = se contem o elemento "A"
	
	c.remove("A"); //remove = remove o elemento "A"
	System.out.println(c.toString());
	
	
	/*GRUPOS*/
	
	Collection<String> c2 = Arrays.asList("O", "U"); // Adiciona dois elementos "O" , "U" na colecao * transformou um array em uma lista (arrays.aslist)
	c.addAll(c2); // addAll() = adiciona na colecao c , outra colexao (c2)
	
	System.out.println(c.toString());
	
	System.out.println(c.contains(c2)); // verifica se existe todos esses elementos na colecao c2 dentro da colecao c1
	c.removeAll(c2); // remove todos os elementos do c2 na c
	System.out.println(c.toString());
	
	/*PERCORRER OS ELEMENTOS DENTRO DE UMA ARRAYLIST */
	
	for(String string: c){
		System.out.println(c.toString());
	}
	
	
	/*converter uma colecao em um Array*/
	
	String[] s = c.toArray(new String[c.size()]); // toArray = Transforma o c em Array , retorna um array de Strings que tenha a quantidade
									//c.size() da colecao , que ira retornar um Array de Strings
	
	System.out.println(Arrays.toString(s));
	
	c.clear(); //limpa toda a colecao
	
	System.out.println(c.toString());
	
	}
}
