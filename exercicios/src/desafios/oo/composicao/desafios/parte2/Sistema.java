package desafios.oo.composicao.desafios.parte2;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Seu nome: ");
		String clienteNome = entrada.nextLine();
		
		Cliente cliente1 = new Cliente(clienteNome);
		
		System.out.print("Nome do livro: ");
		String livroNome = entrada.nextLine();
		
		System.out.print("Nome do(a) autor(a): ");
		String autorNome = entrada.nextLine();
		
		System.out.print("Data do empréstimo: ");
		String dataEmprestimo = entrada.nextLine();
		
		System.out.print("Data da devolução: ");
		String dataDevolucao = entrada.nextLine();
		
		
		
		cliente1.AddLoan(livroNome, autorNome, dataEmprestimo, dataDevolucao);
		
		System.out.println("-------------------------");
		System.out.println("Nome do cliente: " + clienteNome);
		System.out.println("Livro adquirido: " + livroNome);
		System.out.println("Data da Devolução: " + dataDevolucao);
		System.out.println("Dias em atraso: " + cliente1.LoanDelayDays(dataEmprestimo, dataDevolucao));
		
		entrada.close();
	}
}
