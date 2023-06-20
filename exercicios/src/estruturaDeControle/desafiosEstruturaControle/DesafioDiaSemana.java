package estruturaDeControle.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String dia = entrada.nextLine();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 1.");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 2.");
		} else if ("terça".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 3.");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 4.");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 5.");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Número do dia: 6.");
		} else {
			System.out.println("Número do dia: 7.");
		}
		
		entrada.close();
	}
}
