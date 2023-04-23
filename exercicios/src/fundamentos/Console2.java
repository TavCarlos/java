package fundamentos;

import java.util.Scanner;

public class Console2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt(); 
		entrada.nextLine();
		/*
			Quando o usuário digitar "25" e apertar enter
			o java irá receber "25\n", sendo o \n referente ao enter.
			.nextInt irá pegar o número 25 e deixará de lado o \n(ENTER)
			É necessário utilizar um .nextLine(); para ler esse \n
			para que ele não pule a próxima etapa (caso fosse nextLine)
		*/
		
		
		System.out.print("Digite o seu primeiro nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		
		System.out.printf("%s %s tem %d anos de idade.", nome, sobrenome, idade);
		
		entrada.close();
	}
}
