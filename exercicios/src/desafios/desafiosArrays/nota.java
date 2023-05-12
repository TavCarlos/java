package desafios.desafiosArrays;

import java.util.Scanner;

public class nota {
	/*
	 Desafio: Calcular a média das notas que o usuário passar.
	 Usuário decide a quantidade de notas a ser passada e as notas.
	 Utilizar tanto o for quanto foreach.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas você gostaria de informar?");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		System.out.printf("A média é: %.1f",total / notas.length);
		entrada.close();
	}
}
