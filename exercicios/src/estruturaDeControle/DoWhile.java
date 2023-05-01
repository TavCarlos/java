package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//do {} while(); executa pelo menos uma vez o código, visto que a condição fica no final
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
	}
}
