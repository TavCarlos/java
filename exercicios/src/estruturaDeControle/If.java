package estruturaDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		entrada.close();
		
		if(media >= 7.0 && media <= 10) { //dentro dos () -> expressão obrigatóriamente vai ter que retornar verdadeiro ou falso
			//se a sentença for verdadeira:
			System.out.println("Aprovado"); 
			System.out.println("Parabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação!");	
		}
		
		if(media < 4.5) {
			System.out.println("Reprovado!");
		}
		
		if(media < 0 || media > 10) {
			System.out.println("Valor Inválido!");
		}
		
	}
}
