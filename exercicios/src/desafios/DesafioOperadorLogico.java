package desafios;

import java.util.Scanner;

public class DesafioOperadorLogico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O primeiro trabalho funcionou? ");
		boolean trabalho1 = entrada.nextBoolean();
		
		System.out.println("O segunda trabalho funcionou?" );
		boolean trabalho2 = entrada.nextBoolean();
		
		entrada.close();

		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean MaisSaudavel = !sorvete;
		
		System.out.printf("Comprou TV de 50\"? %b%n", tv50);
		System.out.printf("Comprou TV de 32\"? %b%n", tv32);
		System.out.printf("Comprou sorvete? %b%n", sorvete);
		System.out.printf("Ficou mais saudável? %b%n", MaisSaudavel);
		
		
	}
}
