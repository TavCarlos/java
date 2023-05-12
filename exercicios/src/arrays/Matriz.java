package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas? ");
		int quantidadeNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double[quantidadeAlunos][quantidadeNotas];
		
		double soma = 0;
		for(int i = 0; i < notasDaTurma.length; i++) { //percorrer os alunos
			for(int j = 0; j < notasDaTurma[i].length; j++) { //pecorrer cada nota dos alunos.
				System.out.printf("Digite a %d° nota do %d° aluno: ", j+1, i+1);
				notasDaTurma[i][j] = entrada.nextDouble();
				soma += notasDaTurma[i][j];
			}
		}
		
		System.out.printf("A media da turma é: %.1f ", soma/(quantidadeAlunos * quantidadeNotas));
		
		entrada.close();
		
	}
}
