package fundamentos;
//Não é necessário fazer import de ferramentas que estão dentro de java.lang
import java.util.Scanner; //necessário para obter informações a partir do console.

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom"); //utlizando o print ele não pulará de linha. O ln quebra linha.
		System.out.print(" dia!\n");
		
		System.out.printf("megasena: %d %d %d %d %d %d%n", 1,2, 3, 4, 5, 6); // \n ou %n = quebra de linha
		System.out.printf("Salário: %.2f%n", 1234.5678);
		

		//pegar informações do teclado a partir do console.
		Scanner entrada = new Scanner(System.in); //System.in vai scannear o teclado
		
		System.out.print("Digite o seu primeiro nome: ");
		String nome = entrada.nextLine();//nextLine irá esperar o usuário digitar e o resultado será colocado na variável nome.
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt(); //nextLine retoma uma String. nextInt um inteiro
				
		System.out.printf("%s %s tem %d anos!", nome, sobrenome, idade);
		
		entrada.close(); //Há a necessidade de fechar o Scanner.
		
		
		
		
		
		
		
	}
}
