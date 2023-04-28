package desafios.desafiosFundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double PrimeiroNumero = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite o segundo número: ");
		double SegundoNumero = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Qual operação gostaria de fazer?");
		String operador = entrada.nextLine();
		
		double Resultado = operador.equals("+")? PrimeiroNumero + SegundoNumero : 0;
			Resultado = "-".equals(operador)? PrimeiroNumero - SegundoNumero : Resultado;
			Resultado = "*".equals(operador)? PrimeiroNumero * SegundoNumero: Resultado;
			Resultado = "/".equals(operador)? PrimeiroNumero / SegundoNumero: Resultado;
			Resultado = "%".equals(operador)? PrimeiroNumero % SegundoNumero: Resultado;
		

		
		System.out.printf("%.1f %s %.1f = %.1f ", PrimeiroNumero, operador, SegundoNumero, Resultado);
		
		
		entrada.close();
		
	}
}
