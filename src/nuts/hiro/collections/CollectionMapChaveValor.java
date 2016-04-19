package nuts.hiro.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMapChaveValor {

	//OneToMany
	//Pode ter Apenas uma Chave, mas pode ter varios Valores
	
	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>(); // Map<PrimeiroTipoChave , SegundoValor)
		pais.put("BR", "Brasil"); // put =  Adiciona Chave / Valor
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		System.out.println(pais);
		
		
		System.out.println(pais.containsKey("BR"));// containsKey = Informa , se contem essa chave
		
		
		System.out.println(pais.containsValue("Brasil")); // containsValue = Informa se contem esse valor
		
		
		System.out.println(pais.get("CN")); // recuperar um conteudo pela chave
		
		
		pais.remove("CN"); // remove o conteudo associado a chave
		System.out.println(pais);
		
		
		Set<String> keys = pais.keySet(); //recuperar todas as chaves do mapa (retorna uma key do tipo set(nao duplicados))
		
		for(String key : keys){  //percorrer todas as chaves
			System.out.println(key + ":" + pais.get(key)); //imprime a chave , recuperando o valor
		}
		
		
	}

}
