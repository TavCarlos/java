package desafios;

import java.util.Scanner;

public class DesafioImc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a sua altura em metros: ");
		double altura = entrada.nextDouble();
		
		entrada.close();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("IMC: %f", imc);
		
	}
}
