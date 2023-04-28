package desafios.desafiosFundamentos;

import java.util.Scanner;

public class DesafioAreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Altura do Triângulo");
		double altura = entrada.nextDouble();
		
		entrada.close();
		
		double resultado = base * altura / 2;
				
		System.out.println("A área do triangulo é: " + resultado);
		
	}
}
