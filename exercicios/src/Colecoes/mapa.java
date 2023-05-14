package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapa {
//estrutura chave/valor
//não pode haver duplicação na chave
//pode haver duplicação no valor
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>(); //integer é em relação a chave e String ao valor.
		
		//método .put adiciona caso não exista ou substitui caso exista.
		usuarios.put(1, "Carlos"); //aqui ele adiciona  
		usuarios.put(1, "David"); //aqui ele substitui
		usuarios.put(2, "Rafaela");
		usuarios.put(30, "Luriana");
		usuarios.put(45, "Rebecca");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet()); //retorna as chaves existentes 
		System.out.println(usuarios.values()); //retorna os valores existentes
		System.out.println(usuarios.entrySet()); //retorna tanto as chaves quanto os valores
		System.out.println(usuarios.containsKey(2)); //verifica se a chave 2 contém no map
		System.out.println(usuarios.containsValue("carlos")); //verifica se o valor contém no map
		
		System.out.println(usuarios.get(45)); //busca o elemento conforme a chave 
		
		
		//percorrer os elementos do map através da chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorre os elementos do map através dos valores
		for(String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		//percorre os elementos do map através da chave e dos valores
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}
}
