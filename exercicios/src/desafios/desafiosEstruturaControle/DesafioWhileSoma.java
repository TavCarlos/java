package desafios.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioWhileSoma {

	/*
	 *  Criar um programa que enquanto estiver recebendo números positivos,
	 *  imprime no console a soma dos números inseridos, 
	 *  caso receba um número negativo,
	 *  encerre o programa. Tente utilizar a estrutura do while.
	 */
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int somador = 0;
		
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				somador += numero;
				System.out.println();
				System.out.printf("A soma até o momento: %d\n", somador);
			}
			
		}
		System.out.println();
		System.out.printf("A soma final foi de: %d.", somador);
		entrada.close();
		
	}
}
