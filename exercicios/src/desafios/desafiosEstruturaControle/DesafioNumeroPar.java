package desafios.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioNumeroPar {

	// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número entra 0 e 10: ");
		double numero = entrada.nextDouble();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.printf("Número %.1f é PAR.", numero);
			} else {
				System.out.printf("Número %.1f é ÍMPAR.", numero);
			}
		} else {
			System.out.println("Número inválido.");
		}
		
		entrada.close();
	}
}
