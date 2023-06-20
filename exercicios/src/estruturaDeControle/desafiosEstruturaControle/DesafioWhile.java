package estruturaDeControle.desafiosEstruturaControle;

import java.util.Scanner;

public class DesafioWhile {
/*
 * Calcular a média, não sabe quantos alunos são
 * 
 * 1) digitar nota válida
 * 2) total das notas válidas 
 * 3) quantidade de notas digitadas
 * 4) total de notas válidas digitadas
 * 5) calcular a media
 * 6) usuário digitar -1
 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		int notaValida = 0;
		int notaDigitada = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			notaDigitada++;
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				notaValida++;
			} else if (nota == -1) {
				notaDigitada--;
			} else {
				System.out.println("Nota inválida, tenta novamente.");
			}
			
			
		}
		
		double media = total/notaValida;
		
		System.out.println("A média é: "+ media);
		System.out.println("Quantidade de notas válidas digitadas: "+ notaValida);
		System.out.println("Quantidade de notas digitadas: "+ notaDigitada);
		
		entrada.close();
	}
}
