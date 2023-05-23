package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nLambda #01");
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		
		System.out.println("\nMethod reference #1");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nMethod reference #2");
		aprovados.forEach(Foreach::meuImprimir); //para cada elemento da lista 'aprovados' ele chamará o método 'meuImprimir'
		
	
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome é " + nome + "!");
	}
	
	/*
	  Lambda #01
	  É um método mais flexível pois é possível adicionar mais coisas.
	  Utilizar o método Foreach em cima do List 'aprovados' e é passado como parâmetro 'nome'
	
      Como não há mais de uma sentença de código, é possível não utilizar as chaves{}
	 */
	
	/*
	 Method reference
	 É um método mais rígido, no qual para casa elemento da lista 'aprovados' eu emprimo-os na tela.
	 */
	
	
}
