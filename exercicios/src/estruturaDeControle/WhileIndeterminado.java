package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado { //estrutura focada para casos que há uma estrutura indeterminada de repetições.

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "" ;
		
		while(!valor.equalsIgnoreCase("sair")) {//enquanto a variavel valor NÃO for igual "sair" faça:
			System.out.print("Digite alguma coisa: ");
			valor = entrada.nextLine();
		}
		
		System.out.println("fim!");
		
		entrada.close();
	}
}
