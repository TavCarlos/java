package fundamentos.desafiosFundamentos;


import java.util.Scanner;

public class DesafioDelta {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		System.out.println("Digite o valor de A:");
		int ValorA = entrada.nextInt();
		
		System.out.println("Digite o Valor de B:");
		int ValorB = entrada.nextInt();
		
		System.out.println("Digite o valor de C:");
		int ValorC = entrada.nextInt();
		
		entrada.close();
		
		int Delta =  (int) (Math.pow(ValorB, 2)) - (4 * ValorA * ValorC);
		
		System.out.printf("O resultado de Delta é: ", Delta);
		
	}
}
