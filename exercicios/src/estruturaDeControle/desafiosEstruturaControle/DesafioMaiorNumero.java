package estruturaDeControle.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioMaiorNumero {
/*
 * Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//pegar um número para atribuir ao maior. Com isso o programa serve para números negativos também.
		System.out.println("Digite um número: ");
		double numero = entrada.nextDouble();
		double maiorNumero = numero;
		
		for(int i = 0; i < 9; i++) {
			
			System.out.println("Digite um número: ");
			numero = entrada.nextDouble();
			if(maiorNumero < numero) {
				maiorNumero = numero;
			}
			
		}
		
		System.out.printf("O maior número digitado é: %.1f.", maiorNumero);
		
		
		entrada.close();
	}
}
