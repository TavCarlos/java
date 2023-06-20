package estruturaDeControle.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		if(nota1 < 0 || nota1 > 10) {
			System.out.println("Nota1 Inválida!");
		} else {
			System.out.print("Digite a segunda nota: ");
			double nota2 = entrada.nextDouble();
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Nota2 Inválida!");
			} else {
				double media = (nota1 + nota2) / 2;
				
				switch((int)media) {
				case 0: case 1: case 2: case 3:
					System.out.printf("Sua média é: %.1f e você está REPROVADO.", media);
					break;
				case 4: case 5: case 6:
					System.out.printf("Sua média é: %.1f e você está EM RECUPERAÇÃO.", media);
					break;
				default:
					System.out.printf("Sua média é: %.1f e você está APROVADO.", media);
				}
			}
		}
		
		entrada.close();
	}
}
