package desafios;

import java.util.Scanner;

public class DesafioValorQuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		entrada.close();
		
		double AoQuadrado = Math.pow(valor, 2);
		double AoCubo = Math.pow(valor, 3);
		
		System.out.printf("Valor digitado: %.2f%n", valor);
		System.out.printf("Valor ao Quadro: %.2f%n", AoQuadrado);
		System.out.printf("Valor ao Cubo: %.2f%n", AoCubo);
	}
}
