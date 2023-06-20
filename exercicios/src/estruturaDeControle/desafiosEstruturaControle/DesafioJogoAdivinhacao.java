package estruturaDeControle.desafiosEstruturaControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String jogarNovamente = "s";
		
		while(!"n".equalsIgnoreCase(jogarNovamente)) {
			
			int numeroSorteado;
			int tentativa = 10;
			
			//obtendo número aleatório
			Random NumeroAleatorio = new Random();
			numeroSorteado = NumeroAleatorio.nextInt(101);
			
			System.out.println();
			System.out.println("===================================================");
			System.out.println("Bem vindo! Tente adivinhar um número entre 0 e 100");
			System.out.println("===================================================");
			System.out.println();
			
			while(tentativa != 0) {
				System.out.printf("Você ainda tem %d tentativas.\n", tentativa);
				System.out.print("Número: ");
				int numero = entrada.nextInt();
				tentativa--;
				System.out.println();
				
				if(numero > 100 || numero < 0) {
					System.out.println("Número inválido. Por favor, digite um número entre 0 e 100");
					tentativa++;
				} else if(tentativa == 0) {
					System.out.printf("Infelizmente você não acertou, o número sorteado era: %d\n", numeroSorteado);
				} else if(numero < numeroSorteado) {
					System.out.printf("O número sorteado é MAIOR do que o número %d\n", numero);
				} else if (numero > numeroSorteado) {
					System.out.printf("O número sorteado é MENOR do que o número %d\n", numero);
				} else {
					System.out.printf("PARABÉNS! você acertou o número faltando tentativas: %d\n", tentativa);
					break; //se acertar, ele encerra o while antes de acabar as tentativas
				}
			}
			
			
			System.out.println("Gostaria de Jogar novamente? (s/n)");
			entrada.nextLine(); //pega o \n(ENTER) quando o usuário digita o número.
			jogarNovamente = entrada.nextLine();
		}
		
		System.out.println();
		System.out.println("Obrigado por jogar.");
		entrada.close();
		
	}
}
