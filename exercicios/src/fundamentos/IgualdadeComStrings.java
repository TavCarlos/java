package fundamentos;

import java.util.Scanner;

public class IgualdadeComStrings {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String s = entrada.nextLine();
		System.out.println("2" == s); //resultado vai dar false mesmo se o usuário digitar 2
		
		System.out.println("2".equals(s.trim())); //.equals() compara o conteúdo das strings
												 //.trim() tira espaços em branco caso o usuário deixe 
		
		entrada.close();
	}
}
