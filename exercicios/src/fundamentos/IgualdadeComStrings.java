package fundamentos;

import java.util.Scanner;

public class IgualdadeComStrings {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String s = entrada.nextLine();
		System.out.println("2" == s); //resultado vai dar false mesmo se o usuário digitar 2
		
		System.out.println("2".equals(s.trim())); //.equals() compara o conteúdo das strings
												 //.trim() tira espaços em branco caso o usuário deixe 
		
		String nota = "7";
		String ValorDigitado = entrada.nextLine();
		boolean TesteIgualdade = ValorDigitado == nota;
		boolean TesteIgualdade2 = ValorDigitado.equals(nota);
		
		System.out.printf("O teste de igualdade deu: %b%n",TesteIgualdade);
		System.out.printf("O teste de igualdade2 deu: %b", TesteIgualdade2);
		
		entrada.close();
		
		
		
		
	}
}
