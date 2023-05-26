package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		//maneiras de exibição da lista
		
		System.out.println("Forma Tradicional");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		System.out.println();
		
		System.out.println("\nForma optmizada");
		for(String nome: aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nUtilizando lambda");
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nUtilizando iterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUtiliando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
	
	
	/*
	 				Iterator
	 	É uma interface do java que tem dois métodos, um deles retorna true or false(.hasNext)
	 na qual verifica se tem próximo elemento dentro da list;
	 Se houve próximo elemento, o programa irá entrar no laço while e o método .next chama esse elemento.
	 
	 				Stream
	 	É uma interface que recebe um tipo. A Stream também é um conjunto de objeto e uma sequência de dados,
	 mas a sua característica é que a iteração(laço) acontece de forma interna, sem necessariamente precisar 
	 codificar explicitamente.
	 
	 */
	
	
}
